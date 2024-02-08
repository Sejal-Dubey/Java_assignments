package assignment1_part2;
import java.util.Scanner;

public class calculator {
	
	input input=new input();
	double number[]=new double[2];
	
	 public double addition() {
		 number=input.inputNumbers();
		 return number[0]+number[1];
	 }
	 public double subtratcion() {
		 number=input.inputNumbers();
		 return number[0]-number[1];
	 }
     public double multiplication() {
        number=input.inputNumbers();
        return number[0]*number[1];
    }
    public double division() {
        number=input.inputNumbers();
        return number[0]/number[1];
    }
    public void square_root() {
        number=input.inputNumbers();
        System.out.println("Square_root of number[0]:"+Math.sqrt(number[0]));
        System.out.println("Square_root of number[1]:"+Math.sqrt(number[1]));
    }
    public void power() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        double base=sc.nextDouble();
        System.out.println("Enter exponent:");
        double exponent=sc.nextDouble();
        System.out.println("value is:"+Math.pow(base,exponent));
    }
	public void mean_variance()
	{
		Scanner sc =new Scanner(System.in);
		String str;
		int ctr=0;
		double result=0,no;
        double sumOfSquares = 0.0;
		
		do
		{
			System.out.println("Enter the numbers and to end the input enter 'end'");
			str=sc.next();
			if(str.equals("end"))
				break;
			else
			{
				no=Double.parseDouble(str);
				result+=no;
                sumOfSquares += Math.pow(no, 2);
				ctr++;
			}
			
		}while(true);
        double mean=result/ctr;
        double variance = (sumOfSquares / ctr) - Math.pow(mean, 2);
		System.out.println("Mean is"+(mean)+" "+"Variance is"+(variance));
	}
	
}