package collier.utilities.window_management;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import collier.game_management.GameManager;

/**
 * Singleton Class for the game window
 */
public class GameWindow extends JFrame implements WindowListener{
    private static GameWindow instance;

    private final GameManager gameManagerInstance = GameManager.getInstance();

    private GameWindow() {
        super("Yahtzee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        initMenuBar();
    }

    /**
     * Constructor helper function
     * 
     * Initializes Menu Bar of parent frame
     */
    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu optionsMenu = new JMenu("Options");
        JMenuItem endGameOption = new JMenuItem("End Game");
        optionsMenu.add(endGameOption);

        menuBar.add(optionsMenu);
    }

    /**
     * Constructor helper function
     * 
     * Initializes Player Scores panel of parent frame
     */
    private void initScorePanel() {

    }

    /**
     * Contructor helper function
     * 
     * Initializes main pannel for game functionality
     */
    private void initGamePanel() {

    }

    public static GameWindow getInstance() {
        if (instance == null) {
            instance = new GameWindow();
            instance.addWindowListener(instance);
        }
        return instance;
    }

    public boolean closeFrame() {
        this.dispose();
        instance = null;
        return true;
    }

    /**
     * Revalidates and repaints the frame to update the display
     * 
     */
    public void updateDisplay() {
        this.revalidate();
        this.repaint();
    }

    /**
     * Called when window is configured to be active window
     * @param e window event
     */
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window has been activated");
    }

    /**
     * Triggered upon closing of window via "dispose" method
     * @param e
     */
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window has been closed");
    }

    /**
     * Triggered when user tries to dismiss window via system menu
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window about to close");
    }

    /**
     * Triggered when window isn't the active window anymore
     * @param e
     */
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window has been deactivated");
    }

    /**
     * Triggered when window is reopened from it's minimized state
     * @param e
     */
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window has been restored");
    }

    /**
     * Triggered when window is minimized
     * @param e
     */
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window has been minimized");
    }

    /**
     * Triggered first time a window appears
     * @param e
     */
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window has been opened");
    }
}
