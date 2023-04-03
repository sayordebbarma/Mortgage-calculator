import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte month_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("principal loan amount: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter value between 1000 and 1000000");
        }

        float monthlyInterest;
        while (true) {
            System.out.print("Annual interest rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / percent / month_in_year;
                break;
            }
            System.out.println("Please enter value between 1 and 30");
        }

        int numberOfPayments;
        while (true) {
            System.out.print("Period (years): ");
            byte years = scanner.nextByte();
            if (years >=1 && years <= 30) {
                numberOfPayments = years * month_in_year;
                break;
            }
            System.out.println("Please enter value between 1 and 30");
        }

        double mortgageCal = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments)) + 1);

        System.out.println("Therefore the mortgage will be " + Math.round(mortgageCal));

    }
}