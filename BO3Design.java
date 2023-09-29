import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BO3Design extends JFrame implements ActionListener{
    JLabel team1 = new JLabel("Long team");
    JLabel team2 = new JLabel("Long team");

    BO3Design(){
        this.setTitle("Scoreboard - BO3");

        JLabel scoreboard1 = new JLabel("0");
        JLabel scoreboard2 = new JLabel("0");
        JButton reset = new JButton("Reset");
        JButton endmatch = new JButton("End Match");

        team1.setBounds(50, 10, 200, 40);
        team2.setBounds(350, 10, 200, 40);
        scoreboard1.setBounds(10, 10, 50, 60);
        scoreboard2.setBounds(560, 10, 50, 60);

        team1.setFont(new Font(null, Font.PLAIN, 35));
        team2.setFont(new Font(null, Font.PLAIN, 35));
        scoreboard1.setFont(new Font(null, Font.BOLD, 45));
        scoreboard2.setFont(new Font(null, Font.BOLD, 45));

        this.add(team1);
        this.add(team2);
        this.add(scoreboard1);
        this.add(scoreboard2);

        this.setSize(1000, 300);
        this.setLayout(null);
        this.setVisible(true); //Make the window appears
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the program when exit
        this.setLocationRelativeTo(null); //Make the window center
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
    
}
