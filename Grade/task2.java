import java.util.*;
public class task2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,i=0,j=0,mark;
        System.out.println("Enter the number of subjects:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            System.out.printf("Enter the mark for subject: %d\n",i);
            mark=scan.nextInt();
            if(mark>90) System.out.println("A+ grade");
            else if(mark>80) System.out.println("A grade");
            else if(mark>70) System.out.println("B grade");
            else if(mark>60) System.out.println("C grade");
            else if(mark>50) System.out.println("D grade");
            else System.out.println("Fail");
            j+=mark;
        }
        System.out.printf("Toal marks: %d\n",j);
        System.out.printf("Average percentage is: %d",j/n);
    }    
}
