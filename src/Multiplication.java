import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int mul;

        System.out.print("Enter the number to find multiple of: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(mul);
        }
    }
}
