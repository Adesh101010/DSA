package Ifelse;
import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary in laks - ");int salary = sc.nextInt();
        if (salary >500000) {
            System.out.println(salary*0.2);
            
        }
        else if (salary >=500000 && salary <=1000000){
            System.out.println(salary*0.3);
        }
        else{
            System.out.println("you dont Need to pay any taxes-"+salary);
        }

        
        

    }
    
}
