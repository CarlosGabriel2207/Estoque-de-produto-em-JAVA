package applicationProduct;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Digite o nome do produto: ");
        p.name = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        p.price = sc.nextDouble();
        System.out.println("Digite o quantidade do produto: ");
        p.quantity = sc.nextInt();

        System.out.println(p.name + ", " + p.price + ", " + p.quantity);
        sc.close();
    }
}
