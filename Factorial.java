/*El programa solo calcula numero enteros
 * no lleva ninguna estructura de control
 * y solo funciona bien hasta factorial de 16
 */
import java.util.Scanner;
public class Factorial{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int num=0;
        System.out.println ("Introduce un numero: ");
        num =sc.nextInt();
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        System.out.println ("El factorial de : "+num+ " es "+fact);	
    }  

}

