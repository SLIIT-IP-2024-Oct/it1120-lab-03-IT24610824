import java.util.Scanner;

public class IT24610824Lab3Q1B{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double priceOfKilo;
        double numOfKilo;
        double total;
        double discount;
        double totalAfterDiscount;
        System.out.println("Enter the price of one KILO of rice : ");
        priceOfKilo = scanner.nextDouble();
        System.out.println("Enter the num of one KILO you want : ");
        numOfKilo = scanner.nextDouble();
        total = priceOfKilo*numOfKilo;
        discount = total*0.10;
        totalAfterDiscount = total-discount;
        System.out.println("Total after discount : " + totalAfterDiscount);
    }
}

