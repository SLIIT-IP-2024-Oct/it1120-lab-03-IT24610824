import java.util.Scanner;

public class IT4610824Lab3Q1A{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double priceOfKilo;
        double numOfKilo;
        double total;
        System.out.printl("Enter the price of one KILO of rice : ");
        priceOfKilo = scanner.nextDouble();
        System.out.printl("Enter the num of one KILO you want : ");
        numOfKilo = scanner.nextDouble();
        total = priceOfKilo*numOfKilo;
        System.out.println("Total : " + total);
    }
}
