

//write a programme to enter physics chemestry and math
//if avrage marks greater then 80 then grade 'A'
//greater then 70 then grade 'B'grater than 60 then 'C'
//greater than 50 then grade 'D'other wise fail

import java.util.Scanner;
public class Oops_Rcit7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int physics,chemestry,Math,avrage;
        System.out.println("ente your marks");
        physics=sc.nextInt();
        chemestry = sc.nextInt();
        Math= sc.nextInt();
        avrage =(physics+chemestry+Math)/3;
        
        
        if (avrage>=80){
            System.out.println("your grade A ");
        }
        else if (avrage>=70) {
            System.out.println("you grade B ");
            
        }
        else if(avrage>=60){
            System.out.println("you grade C ");
        }
        else if(avrage>=50){
            System.out.println("you grade D ");
        }
        else{
            System.out.println("you are fail");
        }
        sc.close();
        
    }
    
}
