package src.cont;

import src.mod.Problem;
import src.view.Window;

public class Main {
    /*
     *Uses JOptionPane to ask the user how many problems they would like to solve, then gives the user
     * that number of problems to solve. Tells the user when they get a question right and when they
     * get one wrong. Displays the correct answer after a wrong answer is given.Keeps track of how
     * many the user gets right and tells them the percentage of correct answers after all problems
     * have been answered.
     */
    public static void main(String[] args) {
        Window w = new Window();
        String msg = "Type how many problems you want to do \n \n Type exit at any time to quit";
        String input = w.in(msg).toLowerCase();
        int probs = checkStr(input, msg);
        Problem[] pList = new Problem[probs];
        for (int i = 0; i < probs; ) {
            pList[i] = new Problem();
            i++;
        }
        int correct = 0;
        for (int j = 1; j <= probs; j++) {
            char op;
            if (pList[j - 1].isAdding()) {
                op = '+';
            } else {
                op = '-';
            }
            msg = "Question " + j + "/" + probs + " \n \n " + pList[j - 1].getNum1() + " " + op + " " + pList[j - 1].getNum2() + " = ?  Type the answer";
            String ans = w.in(msg).toLowerCase();
            int intAns = checkStr(ans, msg);
            if (intAns == pList[j - 1].getAnswer()) {
                w.msg("Correct!");
                correct++;
            } else {
                w.msg("That's Wrong! \n \n It's actually " + pList[j - 1].getAnswer());
            }
        }
        int percent = (int)(correct * 1.0D / probs * 100.0D);
        w.msg("You finished! \n \n You got " + correct + " out of " + probs + ", or " + percent + "%");
    }

    /*
     *Processes user input. If the user entered exit, then it stops running the program. If not,
     * then it extracts an int from the String using parseInt. If no int is found, it asks for
     * user input again until a valid entry is given.
     */
    public static int checkStr(String s, String msg) {
        if (s.equals("exit"))
            System.exit(0);
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            Window w2 = new Window();
            String newInput = w2.in(msg + "\n \n You must type a number!").toLowerCase();
            checkStr(newInput, msg);
            return 0;
        }
    }
}