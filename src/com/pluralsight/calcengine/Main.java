package com.pluralsight.calcengine;

import java.util.stream.StreamSupport;

public class Main {

        public static void main(String[] args) {
            MathEquation[] equations = new MathEquation[4];
            equations[0] = new MathEquation('d', 100.0d, 50.0d);
            equations[1] = new MathEquation('a', 25.0d, 92.0d);
            equations[2] = new MathEquation('s', 225.0d, 17.0d);
            equations[3] = new MathEquation('m', 11.0d, 3.0d);

            for(MathEquation equation : equations){
                equation.execute();
                System.out.println("result = ");
                System.out.println(equation.getResult());

            }

            Integer i1000a = 127 + 1;
            Integer i1000b = 127 + 1;

            if(i1000a == i1000b){
                System.out.println("i1000a == i1000b");
            }else{
                System.out.println("i1000a =//= i1000b");
            }

            Integer i8a = 2 * 2 * 2;
            Integer i8b = 2 * 4;

            if(i8a == i8b){
                System.out.println("i8a == i8b");
            }else{
                System.out.println("i8a =//= i8b");
            }


            System.out.println();
            System.out.println("Using Overloads");
            System.out.println();

            double leftDouble = 9.0d;
            double rightDouble = 4.0d;
            int leftInt = 9;
            int rightInt = 4;

            MathEquation equationOverload = new MathEquation('a');

            equationOverload.execute(leftDouble, rightDouble);
            System.out.print("result=");
            System.out.println(equationOverload.getResult());

            equationOverload.execute(leftInt, rightInt);
            System.out.print("result=");
            System.out.println(equationOverload.getResult());

            equationOverload.execute((double)leftInt, rightInt);
            System.out.print("result=");
            System.out.println(equationOverload.getResult());


            System.out.println();
            System.out.println("Using Inheritance");
            System.out.println();


            CalculateBase[] calculators = {
                    new Divider(100.d, 50.0d),
                    new Adder(25.d, 98.0d),
                    new Subtractor(222.d, 34.0d),
                    new Multiplier(6.d, 76.0d),
            };

            for(CalculateBase calculator:calculators){
                calculator.calculate();
                System.out.print("result=");
                System.out.println(calculator.getResult());
            }



        }


}

