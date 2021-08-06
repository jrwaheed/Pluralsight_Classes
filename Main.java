package com.company;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations(){
        MathEquations [] equations = new MathEquations[4];
        equations[0] = new MathEquations('d',100.0d, 50.0d );
        equations[1] = new MathEquations('a', 25.0d, 92.0d );
        equations[2] = new MathEquations('s', 225.0d, 17.0d);
        equations[3] = new MathEquations('m',11.0d, 3.0d );

        for (MathEquations equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.result);
        }

        System.out.println("Average result = " + MathEquations.getAverageResult());

        MathEquations equationOverload = new MathEquations('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("Overload result with Doubles: " + equationOverload.getResult());


    }



}