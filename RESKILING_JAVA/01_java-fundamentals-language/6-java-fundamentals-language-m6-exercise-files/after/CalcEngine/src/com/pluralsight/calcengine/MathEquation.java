package com.pluralsight.calcengine;

/**
 * Created by Jim on 9/12/2015.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() { return result;}
    // realmente no entiendo porque se ponen los tres constructores siguientes. TSTATA
    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        // se pone this(opCode) para llamar a todos los consturctores que utiliznan opCode. Debe de ser nuestra primera linea del constructor.
        this(opCode); // para encadenar los constructores. se esta utilizando ien el constructor de arriba tambien
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }

    }
}
