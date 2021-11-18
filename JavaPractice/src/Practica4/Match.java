package Practica4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Match extends JFrame {
    private JFrame match;
    private JButton milan, madrid;
    private JLabel winner, score, lastScorer;
    private int madridScore = 0, milanScore = 0;

    public Match() {
        match = new JFrame("MATCH");
        milan = new JButton("AC Milan");
        madrid = new JButton("Real Madrid");
        winner = new JLabel("Winner: DRAW");
        score = new JLabel(madridScore+" x "+milanScore);
        lastScorer = new JLabel("Last Scorer: N/A");
        match.setSize(500, 500);
        BorderLayout location = new BorderLayout();
        match.add(milan, location.WEST);
        match.add(madrid, location.EAST);
        match.add(winner, location.NORTH);
        match.add(lastScorer, location.SOUTH);
        match.add(score, location.CENTER);
        MouseListener listenerMilan = new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                lastScorer.setText("Last Scorer: AC Milan");
                score.setText(milanScore+" x "+madridScore);
                if (madridScore>milanScore){
                    winner.setText("Winner: RealMadrid");
                }else if (milanScore>madridScore){
                    winner.setText("Winner: AC Milan");
                }else winner.setText("Winner: DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        };

        milan.addMouseListener(listenerMilan);
        MouseListener listenerMadrid = new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                madridScore++;
                lastScorer.setText("Last Scorer: Real Madrid");
                score.setText(milanScore+" x "+madridScore);
                if (madridScore>milanScore){
                    winner.setText("Winner: RealMadrid");
                }else if (milanScore>madridScore){
                    winner.setText("Winner: AC Milan");
                }else winner.setText("Winner: DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        };
        madrid.addMouseListener(listenerMadrid);
        match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        match.setVisible(true);
    }
}

