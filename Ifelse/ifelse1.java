package Ifelse;
import java.util.*;
public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        if (age>18) {
            
            System.out.println("You can Vote !! "+name);
        }
        else {
            System.out.println("You cant vote "+ name);
        }
    }
    
    
}
