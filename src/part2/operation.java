package part2;

import java.util.Scanner;

public class operation {

    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("------------- Operations-----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean and Variance");
            System.out.println("0. Exit");
            System.out.println("Enter option for operation (0 to exit): ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Addition is " + calc.addition());
                    break;
                case 2:
                    System.out.println("Subtraction is " + calc.subtratcion());
                    break;
                case 3:
                    System.out.println("Multiplication is " + calc.multiplication());
                    break;
                case 4:
                    System.out.println("Division is " + calc.division());
                    break;
                case 5:
                    calc.square_root();
                    break;
                case 6:
                    calc.power();
                    break;
                case 7:
                    calc.mean_variance();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }

        } while (option != 0);

        sc.close();
    }
}
