import java.util.*;

public class Newline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; scan.hasNext() == true; i++) {
            System.out.println(i + " " + scan.nextLine());
        }
        scan.close();
    }
}