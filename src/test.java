import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        String uname;
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome in our login system !!!");
        String Username = "abi";
        String password = "abi";
        System.out.println("");
        System.out.println("Enter your username:");
        uname = sc.nextLine();
        System.out.println("Enter your password :");
        pass = sc.nextLine();
        if (pass.equals(password) && uname.equals(Username)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tLogin Success !!!");
            System.out.println("");
            System.out.println("For calculater type 1");
            System.out.println("To find result type 2");
            System.out.println("To find greater number  type 3");
            System.out.println("For guessting game type 4");
            System.out.println("");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tEnter your operation (1-4):");
            Scanner c = new Scanner(System.in);
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    double num1, num2;
                    Scanner scan = new Scanner(System.in);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Calculator");
                    System.out.print("Enter operators : +,-,*,/ ");
                    System.out.println("");
                    String operations = scan.next();
                    System.out.print("Enter the number: ");
                    double firstnum = scan.nextDouble();
                    System.out.print("Enter second number: ");
                    double secondnum = scan.nextDouble();

                    double greatest = Math.max(firstnum, secondnum);
                    if (greatest == firstnum) {
                        num1 = firstnum;
                        num2 = secondnum;
                    } else if (greatest == secondnum) {
                        num2 = firstnum;
                        num1 = secondnum;
                    } else {
                        num1 = firstnum;
                        num2 = secondnum;
                    }


                    if (operations.equals("+")) {
                        System.out.println("The sum is:" + (firstnum + secondnum));
                    } else if (operations.equals("-")) {
                        System.out.println("The difference is:" + (num1 - num2));
                    } else if (operations.equals("*")) {
                        System.out.println("The product is:" + (num1 * num2));
                    } else if (operations.equals("/")) {
                        System.out.println("The division is:" + (num1 / num2));
                    } else {
                        System.out.println("Invalid");
                    }
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to your result calculator");
                    double Nep;
                    double Eng;
                    double mat;
                    double per;
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter your marks in Nepali subject : ");
                    Nep = s.nextInt();
                    System.out.println("Enter your marks in English subject : ");
                    Eng = s.nextInt();
                    System.out.println("Enter your marks in Maths subject : ");
                    mat = s.nextInt();
                    per = (((Nep + mat + Eng) / 300) * 100);
                    if (per > 89 && per < 101) {
                        System.out.println("Your Result is A+");
                    } else if (per > 79 && per < 90) {
                        System.out.println(" Your Result is A");
                    } else if (per > 69 && per < 80) {
                        System.out.println(" Your Result is B+");
                    } else if (per > 59 && per < 70) {
                        System.out.println(" Your Result is B");
                    } else if (per > 49 && per < 60) {
                        System.out.println(" Your Result is C+");
                    } else if (per > 39 && per < 50) {
                        System.out.println("Your Result is C");
                    } else if (per > 100) {
                        System.out.println("Invalid entry");

                    } else {
                        System.out.println("You have failed your exam , try to study hard !!! ");
                    }


                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tCalculate the greatest number:");
                    System.out.println("");
                    int n1;
                    int n2;
                    int n3;
                    int max;
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter the first number: ");
                    n1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    n2 = scanner.nextInt();
                    System.out.print("Enter the third number: ");
                    n3 = scanner.nextInt();

                    if (n1 > n2 && n1 > n3) {
                        max = n1;
                    } else if (n2 > n1 && n2 > n3) {
                        max = n2;
                    } else {
                        max = n3;
                    }
                    System.out.println("The greatest number is: " + max);

                    System.out.println("");
                    break;

                case 4:

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to guessing game:");
                    Random random = new Random();
                    int correct = random.nextInt(100) + 1;
                    System.out.print("Enter a number from 1-100 : ");
                    int ans;
                    Scanner scanners = new Scanner(System.in);
                    ans = scanners.nextInt();

                    if (correct == ans) {
                        System.out.println("CONGRATULATIONS!!!");


                    } else {
                        System.out.println("BETTER LUCK NEXT TIME !!!");
                        break;
                    }
                default:
                    System.out.println("invalid input");
            }
        } else System.out.println("Invalid pass or username");
    }}








