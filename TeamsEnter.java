import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TeamsEnter extends JFrame implements ActionListener{
    JButton submit;
    JTextField team1;
    JTextField team2;
    JRadioButton bestof3;
    JRadioButton bestof5;

    TeamsEnter(){
        this.setTitle("Teams Enter");
        
        JLabel label1 = new JLabel("Enter team 1");
        JLabel label2 = new JLabel("Enter team 2");
        JLabel label3 = new JLabel("Choose match type");

        team1 = new JTextField();
        team2 = new JTextField();
        bestof3 = new JRadioButton("BO3");
        bestof5 = new JRadioButton("BO5");
        submit = new JButton("Submit");

        ButtonGroup group = new ButtonGroup();
        group.add(bestof3);
        group.add(bestof5);

        label1.setBounds(10, 20, 150, 40);
        label2.setBounds(10, 65, 150, 40);
        label3.setBounds(10, 110, 150, 40);
        team1.setBounds(165, 20, 260, 40);
        team2.setBounds(165, 65, 260, 40);
        bestof3.setBounds(165, 110, 130, 40);
        bestof5.setBounds(295, 110, 130, 40);
        submit.setBounds(175, 155, 100, 40);

        bestof3.addActionListener(this);
        bestof5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==bestof5){
                    System.out.println("You choose BO5");
                }
            }
        });
        submit.addActionListener(this);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(team1);
        this.add(team2);
        this.add(bestof3);
        this.add(bestof5);
        this.add(submit);

        this.setSize(450, 300);
        this.setLayout(null);
        this.setVisible(true); //Make the window appears
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the program when exit
        this.setLocationRelativeTo(null); //Make the window center
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            if(team1.getText().length() == 0 || team2.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Please enter both teams name", "Waring", JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(!bestof3.isSelected() && !bestof5.isSelected()){
                    JOptionPane.showMessageDialog(null, "Please select type of match", "Waring", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    if(bestof3.isSelected()){
                        this.dispose();
                        BO3Design bo3 = new BO3Design();
                        bo3.team1.setText(team1.getText());
                        bo3.team2.setText(team2.getText());
                    }
                }
            }
        }
    }
}
