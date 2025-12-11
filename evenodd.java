import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int odd=0,even=0;
        for(int i=0;i<10;i++) {
            System.out.println("Enter your numbers: ");
            int p = sc.nextInt();
            if (p % 2 != 0) {
                odd++;//
            } else {
                even++;}
                System.out.println("the number of even numbers are"  +even);
                System.out.println("the numbers of odd numbers are"  +odd);

        }
    }
}
