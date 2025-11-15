package org.drozdov;

public class App 
{
    public static void main( String[] args ) {
        System.out.println("Add 2 + 4: "+SimpleCalculator.add(2,4));
        System.out.println("Subtract 12 - 7: "+SimpleCalculator.subtract(12,7));
        System.out.println("Multiply 5 * 4: "+SimpleCalculator.multiply(5,4));
        System.out.println("divide 6 / 3: "+SimpleCalculator.divide(6,3));
    }
}
