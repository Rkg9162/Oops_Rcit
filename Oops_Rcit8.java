//enter 3 and get which number is greatest
import java.util.Scanner;
public class Oops_Rcit8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int a,b,c;
        System.out.println("Enter your number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b)
        {
            if(a>c){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else{
            if (b>c) {
                System.out.println("b is greatest");
                
            }
            else{
                System.out.println("c is greatest");
            }
        }



        sc.close();

        
    }
    
}
