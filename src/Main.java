import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte month_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("principal loan amount: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / month_in_year;
        System.out.println(monthlyInterest);

        System.out.print("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * month_in_year;

        double mortgageCal = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments)) +1);


        System.out.println("Therefore the mortgage will be " + mortgageCal);

    }
}