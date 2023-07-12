package com.pluralsight.calcengine;

/**
 * Created by Jim on 10/10/2015.
 */
 // clase base por lo que otras clases heredan de ella.
 // actua como punto comun de herencia.

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getResult() { return result;}
    public void setResult(double result) {this.result = result;}

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
// creamos un método vacio (public void calculate();) como no existe una definición unica de Calculate
//  por lo tanto hacemos con abstract y ponermos abstract la clase tambien (linea 9)
    public abstract void calculate();

}
