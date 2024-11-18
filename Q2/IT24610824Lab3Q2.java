import java.util.Scanner;

public class IT24610824Lab3Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double salary;
        double numOfOTHrs;
        double OTRate;
        double total;
        System.out.print("Enter the monthly salary: ");
        salary = scanner.nextDouble();
        System.out.print("Enter the num of OT hours: ");
        numOfOTHrs = scanner.nextDouble();
        System.out.print("Enter the num of OT hourly rate: ");
        OTRate = scanner.nextDouble();
        total = salary+(numOfOTHrs*OTRate);
        System.out.println("Salary including OT is : " + total);

    }
}
