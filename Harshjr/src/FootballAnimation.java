import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballAnimation {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FootballGame());
    }
}

class FootballGame extends JFrame {
    private GamePanel gamePanel;

    public FootballGame() {
        setTitle("Football Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new GamePanel();
        add(gamePanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class GamePanel extends JPanel {
    // Player and ball positions
    private int player1X = 50, player1Y = 150;  // Player 1 (Blue)
    private int player2X = 300, player2Y = 150; // Player 2 (Red)
    private int ballX = 200, ballY = 150;       // Ball position
    private int ballDirectionX = 2;              // Ball movement direction

    private boolean isPlayer1Kicking = true; // Flag to alternate kicking between players

    public GamePanel() {
        setPreferredSize(new Dimension(600, 300));
        Timer timer = new Timer(30, new GameLoop());
        timer.start();
    }

    private class GameLoop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Update player positions and ball movement
            // Alternate running direction for the players
            if (isPlayer1Kicking) {
                player1X += 1;  // Player 1 running to the right
                player2X -= 1;  // Player 2 running to the left
            } else {
                player1X -= 1;  // Player 1 running to the left
                player2X += 1;  // Player 2 running to the right
            }

            // Ball movement based on kick
            ballX += ballDirectionX;

            // Ball bouncing logic: Reverse direction when it hits the edges
            if (ballX >= getWidth() - 50 || ballX <= 0) {
                ballDirectionX = -ballDirectionX;
            }

            // Switch player roles (kick and chase)
            if (Math.abs(player1X - ballX) < 20 || Math.abs(player2X - ballX) < 20) {
                isPlayer1Kicking = !isPlayer1Kicking;  // Alternate the kicker
            }

            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the field background (green)
        g.setColor(new Color(34, 139, 34)); // Grass color
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw players (simplified as circles for heads, lines for bodies)
        g.setColor(Color.BLUE);
        g.fillOval(player1X, player1Y - 20, 20, 20); // Player 1 head (Blue)
        g.drawLine(player1X + 10, player1Y, player1X + 10, player1Y + 40); // Player 1 body

        g.setColor(Color.RED);
        g.fillOval(player2X, player2Y - 20, 20, 20); // Player 2 head (Red)
        g.drawLine(player2X + 10, player2Y, player2X + 10, player2Y + 40); // Player 2 body

        // Draw the football (orange circle)
        g.setColor(Color.ORANGE);
        g.fillOval(ballX, ballY - 10, 20, 20);
    }
}

