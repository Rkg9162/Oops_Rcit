//WAP to enter sallary of a staf if sallry is greater then 10,000 
//so include 10% bonus in his sallary other wise bonous is 5%


import java.util.Scanner;
public class Oops_Rcit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sallary");
        int Sallary = sc.nextInt();
        int bonous1;
        int bonous2= ((Sallary/100)*5);
        if (Sallary>10000)
        {
            
            bonous1= ((Sallary/100)*10);
           Sallary= Sallary+bonous1;

        }
        else{
           
             bonous2= ((Sallary/100)*5);
            Sallary= Sallary+bonous2;

        }
        System.out.println("this is your final sallary with bonous");
        System.out.println(Sallary);



        sc.close();
        
    }
}
