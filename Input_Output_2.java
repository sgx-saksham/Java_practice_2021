import java.util.*;

public class Input_Output_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        sc.close();

        // System.out.println();

        System.out.print("String: ");
        System.out.println(s);
        System.out.print("Double: ");
        System.out.println(d);
        System.out.print("Int: ");
        System.out.println(a);
    }
}
