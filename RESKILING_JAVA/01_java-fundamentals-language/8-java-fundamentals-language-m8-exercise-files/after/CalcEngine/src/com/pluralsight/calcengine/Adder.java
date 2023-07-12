package com.pluralsight.calcengine;

/**
 * Created by Jim on 10/10/2015.
 */
public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal); // Llama al constructor de la clase base
        /*
        super se utiliza para acceder a los miembros de la clase base
        y para invocar al constructor de la clase base desde la subclase
         */
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

}
