import com.sun.deploy.util.StringUtils;

/**
 * Created by isabellamers on 12/04/17.
 */
public class Runner {
    public static void main (String[] args) {
        System.out.println("*");

        int n;
        //horizontal line
        for (n = 0; n < 8; n = n + 1) {
            System.out.print("*");
        }
        //vertical line
        for (n = 0; n <= 3; n = n + 1) {
            System.out.println("*");
        }
        //right triangle
        for (n = 0; n <= 3; n = n + 1) {
            for (int i = 0; i < n; i = i + 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //isosceles triangle
        n = 3;
        int count, row, spaces = 1;
        spaces = n - 1;
        for (row = 1; row <= n; row++) {
            for(count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            spaces--;
            for(count = 1; count <= 2*row-1; count++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //diamond
        n = 3;
        int c, r, s = 1;
        s = n - 1;
        for (r = 1; r <=n; r++) {
            for (c = 1; c <= s; c++) {
                System.out.print(" ");
            }
            s--;
            for (c = 1; c <= 2*r-1; c++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        s= 1;
        for (r = 1; r <= n - 1; r++) {
            for (c = 1; c <= s; c++) {
                System.out.print(" ");
            }
            s++;
            for (c = 1; c<= 2*(n-r)-1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //diamond with name
        n = 3;
        s = n - 1;
        for (r = 1; r <= n; r++) {
            if (r < n) {
                for (c = 1; c <= s; c++) {
                    System.out.print(" ");
                }
                s--;
                for (c = 1; c <= 2 * r - 1; c++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.println("Anays");
            }
        }
        s= 1;
        for (r = 1; r <= n - 1; r++) {
            for (c = 1; c <= s; c++) {
                System.out.print(" ");
            }
            s++;
            for (c = 1; c<= 2*(n-r)-1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
