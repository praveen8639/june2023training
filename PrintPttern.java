import java.util.*;
public class PrintPttern {
    public static void printLine(char c, int col) {
        System.out.println();
        for (int j = 0; j <= col; j++)
            System.out.print(c);
    }

    public static void printPttern(char c, int n) {
        for (int i = 1; i <= n; i++) {
            printLine(c, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int row = sc.nextInt();
        printPttern(ch, row);
    }
}
