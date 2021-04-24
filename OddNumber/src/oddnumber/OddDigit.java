
package oddnumber;

import java.util.Scanner;

public class OddDigit {
    
    public static void main(String[] args) {
        
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Inter a Numbe For Starting Number :- ");
        i = input.nextInt();
        System.out.println("Please Inter a Numbe For ENDing Number :- ");
        j = input.nextInt();
        
        do{
           
         System.out.println(i);
        
        i=i+2;
            
        }while(i<=j);
          
        
    }
    
}
