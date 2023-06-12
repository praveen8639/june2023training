import java.util.*;
class PrintNumberLine {
    public static void printLine(int n,int stop) {
        System.out.print("\n");
        for (int i = n; i <= stop; i++) {
            System.out.print(i);
            if (i < stop)
                System.out.print(",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer");
        int n = sc.nextInt();
        printLine(0,0);
        printLine(1,2);
        printLine(3,5);
        printLine(6,9);
    }
}