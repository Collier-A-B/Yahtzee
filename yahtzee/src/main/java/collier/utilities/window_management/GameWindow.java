package collier.utilities.window_management;

import javax.swing.JFrame;

/**
 * Singleton Class for the game window
 */
public class GameWindow {
    private static GameWindow instance;
    private JFrame frame;

    private GameWindow() {
        frame = new JFrame("Yahtzee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static GameWindow getInstance() {
        if (instance == null) {
            instance = new GameWindow();
        }
        return instance;
    }

    public boolean closeFrame() {
        frame.dispose();
        instance = null;
        return true;
    }

    /**
     * Revalidates and repaints the frame to update the display
     * TODO: Update after player turn
     */
    public void updateDisplay() {
        frame.revalidate();
        frame.repaint();
    }
}
