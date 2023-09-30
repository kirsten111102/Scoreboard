import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TeamsEnter extends JFrame implements ActionListener{
    JButton submit;
    JTextField team1;
    JTextField team2;
    
    TeamsEnter(){
        this.setTitle("Teams Enter");
        
        JLabel label1 = new JLabel("Enter team 1");
        JLabel label2 = new JLabel("Enter team 2");

        team1 = new JTextField();
        team2 = new JTextField();
        submit = new JButton("Submit");

        label1.setBounds(10, 20, 150, 40);
        label2.setBounds(10, 65, 150, 40);
        team1.setBounds(165, 20, 260, 40);
        team2.setBounds(165, 65, 260, 40);
        submit.setBounds(175, 110, 100, 40);

        submit.addActionListener(this);

        this.add(label1);
        this.add(label2);
        this.add(team1);
        this.add(team2);
        this.add(submit);

        this.setSize(450, 200);
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
                this.dispose();
                Scoreboard bo3 = new Scoreboard();
                bo3.team1.setText(team1.getText());
                bo3.team2.setText(team2.getText());
            }
        }
    }
}
