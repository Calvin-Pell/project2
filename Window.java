package src.view;

import javax.swing.JOptionPane;

public class Window {

    /*
     *Displays the String parameter to the user using the JOptionPane method showMessageDialog.
     */
    public void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    /*
     *Displays the String parameter and gets text input from the user and returns it as a String. This is
     *done with the JOptionPane method showInputDialog.
     */
    public String in(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    /*
     *Displays the String parameter along with several buttons for the user, and returns which button the
     * user clicks as an int. This is done with the JOptionPane method showOptionDialog.
     */
    public int option(String[] options, String msg) {
        return JOptionPane.showOptionDialog(null, msg, "Click a button", -1, 1, null, (Object[])options, options[0]);
    }

    /*
     *Prints msg to the console with a new line afterward. This is done with System.out.println
     */
    public void println(String msg) {
        System.out.println(msg);
    }

    /*
     *Prints msg to the console without a new line afterward. This is done with System.out.print
     */
    public void print(String msg) {
        System.out.println(msg);
    }

    /*
     *Displays msg to the user using the JOptionPane method showMessageDialog.
     */
    public void msg(Object msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    /*
     *Displays msg to the user and gets text input from the user which is returned as a String. This
     * is done with the JOptionPane method showInputDialog.
     */
    public String in(Object msg) {
        return JOptionPane.showInputDialog(msg);
    }

    /*
     *Displays msg to the user along with several buttons. Returns which button the user clicks on as an
     * int. This done with the JOptionPane method showOptionDialog
     */
    public int option(Object[] options, Object msg) {
        return JOptionPane.showOptionDialog(null, msg, "Click a button", -1, 1, null, options, options[0]);
    }
}
