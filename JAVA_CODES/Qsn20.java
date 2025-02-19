import java.util.Scanner;

public class Qsn20 {
    public static void main(String[] args) {
        System.out.print("Enter a Range : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        try {
            for (int i = 1; i <= range; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(" Error .");
        }
        sc.close();
    }
}