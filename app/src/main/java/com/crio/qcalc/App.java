/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        StandardCalculator calc = new StandardCalculator();
        calc.getVersion();
        //calc.add1(1, 2);
        calc.add(1, 4);
        calc.subtract(8, 4);
        calc.multiply(7, 3);
        calc.divide(9, 3);

    System.out.println(calc.getResult());
    }
}
