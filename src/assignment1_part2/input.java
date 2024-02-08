package assignment1_part2;

import java.util.Scanner;
public class input {
    public double[] inputNumbers()
    {
        Scanner sc=new Scanner(System.in);
        double numbers[]=new double[2];
        System.out.println("Enter first number:");
        double firstNum=sc.nextDouble();
        System.out.println("Enter second number:");
        double secondNum=sc.nextDouble();

        numbers[0]=firstNum;
        numbers[1]=secondNum;
        return numbers;
    }

}
