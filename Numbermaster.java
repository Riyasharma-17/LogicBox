import java.util.*;

public class Numbermaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------");
            System.out.println(" Welcome to Number Master 🔢");
            System.out.println("-------------------------------");
            System.out.println("1. Check Prime");
            System.out.println("2. Find Factorial");
            System.out.println("3. Check Even/Odd");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Reverse a Number");
            System.out.println("6. Digit Sum");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int num; 

            switch (choice) {
                case 1:
                    System.out.println("You have Selected Prime!");
                    System.out.println("Enter a number:");
                    num = sc.nextInt();

                    boolean isPrime = true;

                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(num + " is a prime number!");
                    } else {
                        System.out.println(num + " is NOT a prime number!");
                    }
                    break;

                case 2:
                    System.out.println("You selected Factorial!");
                    System.out.println("Enter a number:");
                    num = sc.nextInt();
                    int f = 1;

                    if (num < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        for (int i = 1; i <= num; i++) {
                            f = f * i;
                        }
                        System.out.println("Factorial of " + num + " is: " + f);
                    }
                    break;

                case 3:
                    System.out.println("You selected Even/Odd!");
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    if (num % 2 == 0) {
                        System.out.println(num + " is Even!");
                    } else {
                        System.out.println(num + " is Odd!");
                    }
                    break;

                case 4:
                    System.out.println("You selected Table!");
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    System.out.println("Multiplication Table of " + num + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 5:
                    System.out.println("You selected Reverse!");
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    int reversed = 0;
                    int tempNum = num;

                    while (tempNum != 0) {
                        int digit = tempNum % 10;
                        reversed = reversed * 10 + digit;
                        tempNum = tempNum / 10;
                    }

                    System.out.println("Reversed number: " + reversed);
                    break;

                case 6:
                    System.out.println("You selected Digit Sum!");
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    int sum = 0;
                    int temp = num;

                    System.out.print("Sum of digits of " + num + ": ");
                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += digit;
                        System.out.print(digit);
                        temp = temp / 10;
                        if (temp > 0) {
                            System.out.print(" + ");
                        }
                    }
                    System.out.println(" = " + sum);
                    break;

                case 7:
                    System.out.println("Exiting ...Bye Riya ");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            System.out.println();
        }
    }
}
