package src.mod;

import java.util.Random;

public class Problem {

    //INSTANCE VARIABLES
    private int num1;
    private int num2;
    private boolean isAdding;
    private int answer;
    private Random rand = new Random();

    //GETTERS
    public int getNum1() { return this.num1; }
    public int getNum2() { return this.num2; }
    public int getAnswer() { return this.answer; }
    public boolean isAdding() { return this.isAdding; }

    //CONSTRUCTOR
    public Problem() {
        int rand1 = (int)(Math.random() * 10.0D);
        int rand2 = (int)(Math.random() * 10.0D);
        this.isAdding = this.rand.nextBoolean();
        if (this.isAdding) {
            this.num1 = rand1;
            this.num2 = rand2;
        } else {
            this.num1 = rand1;
            for (; rand2 > this.num1; rand2 = (int)(Math.random() * 10.0D));
            this.num2 = rand2;
        }
        if (this.isAdding) {
            this.answer = this.num1 + this.num2;
        } else {
            this.answer = this.num1 - this.num2;
        }
    }

}
