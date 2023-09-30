import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Scoreboard extends JFrame implements ActionListener, MouseListener{
    JLabel team1 = new JLabel("Long team");
    JLabel team2 = new JLabel("Long team");

    int totalroundwins1 = 0;
    int totalroundwins2 = 0;
    int scoreboardmatches1 = 0;
    int scoreboardmatches2 = 0;

    JPanel scoreboardpanel1 = new JPanel();
    JPanel scoreboardpanel2 = new JPanel();

    JPanel team1space = new JPanel();
    JPanel team2space = new JPanel();
    JPanel team1rounds = new JPanel();
    JPanel team2rounds = new JPanel();

    JLabel scoreboard1;
    JLabel scoreboard2;
    JLabel roundswin1;
    JLabel roundswin2;

    JButton reset;
    JButton endmatch;
    JButton endgame;

    Scoreboard(){
        this.setTitle("Scoreboard - BO3");

        scoreboard1 = new JLabel(Integer.toString(scoreboardmatches1));
        scoreboard2 = new JLabel(Integer.toString(scoreboardmatches2));
        roundswin1 = new JLabel(Integer.toString(totalroundwins1));
        roundswin2 = new JLabel(Integer.toString(totalroundwins2));
        
        reset = new JButton("Reset");
        endmatch = new JButton("End Match");
        endgame = new JButton("End Game");

        scoreboardpanel1.setBounds(0, 0, 50, 60);
        team1space.setBounds(50, 0, 300, 40);
        team1rounds.setBounds(350, 0, 50, 40);
        team2rounds.setBounds(400, 0, 50, 40);
        team2space.setBounds(450, 0, 300, 40);
        scoreboardpanel2.setBounds(750, 0, 50, 60);
        reset.setBounds(245, 50, 100, 40);
        endmatch.setBounds(350, 50, 100, 40);
        endgame.setBounds(455, 50, 100, 40);

        team1rounds.setBackground(Color.red);
        team2rounds.setBackground(Color.cyan);

        scoreboard1.setFont(new Font(null, Font.BOLD, 40));
        scoreboard2.setFont(new Font(null, Font.BOLD, 40));
        team1.setFont(new Font(null, Font.PLAIN, 25));
        team2.setFont(new Font(null, Font.PLAIN, 25));
        roundswin1.setFont(new Font(null, Font.PLAIN, 25));
        roundswin2.setFont(new Font(null, Font.PLAIN, 25));

        team1rounds.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                totalroundwins1 += 1;
                roundswin1.setText(Integer.toString(totalroundwins1));
            }

            public void mouseEntered(MouseEvent e) {}
            
            public void mouseExited(MouseEvent e) {}
            
            public void mousePressed(MouseEvent e) {}
            
            public void mouseReleased(MouseEvent e) {}
        });
        team2rounds.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                totalroundwins2 += 1;
                roundswin2.setText(Integer.toString(totalroundwins2));
            }

            public void mouseEntered(MouseEvent e) {}
            
            public void mouseExited(MouseEvent e) {}
            
            public void mousePressed(MouseEvent e) {}
            
            public void mouseReleased(MouseEvent e) {}
        });
        reset.addActionListener(this);
        endgame.addActionListener(this);

        this.add(scoreboardpanel1);
        this.add(team1space);
        this.add(team1rounds);
        this.add(team2rounds);
        this.add(team2space);
        this.add(scoreboardpanel2);
        this.add(reset);
        this.add(endmatch);
        this.add(endgame);

        scoreboardpanel1.add(scoreboard1);
        scoreboardpanel2.add(scoreboard2);
        team1space.add(team1);
        team2space.add(team2);
        team1rounds.add(roundswin1);
        team2rounds.add(roundswin2);

        this.setSize(820, 150);
        this.setLayout(null);
        this.setVisible(true); //Make the window appears
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the program when exit
        this.setLocationRelativeTo(null); //Make the window center
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset){
            totalroundwins1 = 0;
            totalroundwins2 = 0;
            scoreboardmatches1 = 0;
            scoreboardmatches2 = 0;

            roundswin1.setText(Integer.toString(totalroundwins1));
            roundswin2.setText(Integer.toString(totalroundwins2));
            scoreboard1.setText(Integer.toString(scoreboardmatches1));
            scoreboard2.setText(Integer.toString(scoreboardmatches2));
        }
        else if(e.getSource() == endgame){
            if(Integer.parseInt(roundswin1.getText()) >= 13 && Integer.parseInt(roundswin1.getText()) > Integer.parseInt(roundswin2.getText()) && 
                Integer.parseInt(roundswin1.getText()) - Integer.parseInt(roundswin2.getText()) >= 2){
                    scoreboardmatches1 += 1;
                    totalroundwins1 = 0;
                    totalroundwins2 = 0;

                    roundswin1.setText(Integer.toString(totalroundwins1));
                    roundswin2.setText(Integer.toString(totalroundwins2));
                    scoreboard1.setText(Integer.toString(scoreboardmatches1));
            }
            else if(Integer.parseInt(roundswin2.getText()) >= 13 && Integer.parseInt(roundswin2.getText()) > Integer.parseInt(roundswin1.getText()) && 
                Integer.parseInt(roundswin2.getText()) - Integer.parseInt(roundswin1.getText()) >= 2){
                    scoreboardmatches2 += 1;
                    totalroundwins1 = 0;
                    totalroundwins2 = 0;

                    roundswin1.setText(Integer.toString(totalroundwins1));
                    roundswin2.setText(Integer.toString(totalroundwins2));
                    scoreboard2.setText(Integer.toString(scoreboardmatches2));
            }
        }
    }
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mouseEntered(MouseEvent e) {}
    
    public void mouseExited(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
}
