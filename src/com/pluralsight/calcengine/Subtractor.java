package com.pluralsight.calcengine;

/**
 * Created by nickgrato on 1/5/17.
 */
public class Subtractor extends CalculateBase{
    public Subtractor(){}
    public Subtractor(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
