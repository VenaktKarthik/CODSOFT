import java.util.*;

public class demo{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scan =new Scanner(System.in);
        int c=1,score=0;
        while(c>0){
            int n=random.nextInt(100);
            int num=-1, count=1;
            while(num!=n&&count<=10){
                System.out.print("Attempt number "+count+":");
                System.out.println(" Enter your guess:");
                num=scan.nextInt();
                if(num>n){
                    System.out.println("High");
                }
                else if(num<n){
                    System.out.println("Low");
                }
                count++;
            }
            if(count<=10){
                System.out.println("Your Guess is right!");
                score+=11-count;
            }
            else
                System.out.println("Out of moves! Try again!");
            System.out.println("Your Score is: "+score);
            System.out.println("Enter 1 to try again or 0 to quit");
            if(scan.nextInt()==0){
                c--;
            }
        }
    }
}
