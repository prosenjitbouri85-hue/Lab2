import java.util.*;
public class student {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        sc.nextLine();
        String name2="";
        int roll[]=new int[n];
        float[] cgpa=new float[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER YOUR NAME: ");
            name[i]=sc.nextLine();
            System.out.println("ENTER YOUR ROLLNO: ");
            roll[i]=sc.nextInt();
            System.out.println("ENTER YOUR CGPA: ");
            cgpa[i]=sc.nextFloat();
            sc.nextLine();


        }
        float min=cgpa[0];
        for(int i=0;i<n;i++){
            if(cgpa[i]<min){
                min=cgpa[i];


            }

        }
        for(int i=0;i<n;i++){
            if(cgpa[i]==min){
                name2=name[i];
            }
        }
        System.out.println("NAME: "+name2+" CGPA: "+min);


    }
}