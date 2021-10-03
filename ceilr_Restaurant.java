import java.util.*;

public class ceilr_Restaurant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=5) {
            for (int i = 0; i < t; i++) {
                int p=sc.nextInt();
                int c=0;
                double po;
                if (1<=p && p<=100000) {
                    for (int j = 12; j >0; j--) {
                        po= Math.pow(2, j-1);
                        while (p>=po) {
                            p-=po;
                            c++;
                        }
                    }
                }
                System.out.println(c);
            }
        }
    }
}
