import com.sun.deploy.util.StringUtils;

/**
 * Created by isabellamers on 12/04/17.
 */
public class Runner {
    public static void main (String[] args) {
        System.out.println("*");

        int n;
        for (n = 0; n < 8; n = n + 1) {
            System.out.print("*");
        }

        for (n = 0; n <= 3; n = n + 1) {
            System.out.println("*");
        }

        for (n = 0; n <= 3; n = n + 1) {
            for (int i = 0; i < n; i = i + 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (n = 0; n < 3; n++) {
            for (int e = 3; e > n ; e--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= n + 1; s++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }
}
