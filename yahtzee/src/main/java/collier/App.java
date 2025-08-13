package collier;

import collier.utilities.window_management.GameWindow;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome To Yahtzee");
        if (java.awt.GraphicsEnvironment.isHeadless()) {
            System.err.println("Cannot start GUI: Headless environment detected.");
            return;
        }
        GameWindow gameWindow = GameWindow.getInstance();
    }
}
