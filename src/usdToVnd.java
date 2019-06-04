import java.util.Scanner;

public class usdToVnd {
    public static void main(String[] args) {
      int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        int Usd = scanner.nextInt();
        int Vnd = Usd * rate ;
        System.out.println(Usd+" "+"USD"+"="+" "+Vnd+" "+"VND");

    }
}
