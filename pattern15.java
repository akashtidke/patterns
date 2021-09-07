import java.util.Scanner;
//		1
//	2	3	2
//3	4	5	4	3
//	2	3	2
//		1
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=1;
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++) {
            int mcount = count;
            for (int j = 1; j <= space; j++) {
                System.out.print("	");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(mcount + "	");

                if (j <= star / 2) {
                    mcount++;
                } else {
                    mcount--;

                }

            }


            if (i <= n / 2) {
                space--;
                star += 2;
                count++;

            } else {
                space++;
                star -= 2;
                count--;
            }
            System.out.println();
        }
    }
}
