

//WAP to enter sallary of a staf if sallry is greater then 10,000 
//so include 10% bonus in his sallary 

import java.util.Scanner;
public class Oops_Rcit4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter you sallary");
        int Sallry = sc.nextInt();
        if (Sallry>10000)
        {
            System.out.println("this is your final Sallry");
            System.out.println(Sallry+ (Sallry/100)*10);

        }
        else{
            System.out.println("this is your without bonus sallary ");
            System.out.println(Sallry);
        }


        sc.close();
        
    }
    
}
