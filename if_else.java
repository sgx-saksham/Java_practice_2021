import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if ((n & 1) != 0 || (6 <= n && n <= 20))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
