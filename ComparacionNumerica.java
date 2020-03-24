
/**
 * Controla si un numero es mayor,menor o igual que el otro numero
 * En caso de poner otro valor que no se numerico dara error
 * @author (Israel Sandi) 
 */
import java.util.Scanner;
public class ComparacionNumerica
{
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Ingrese el primer numero: ");
    num1=sc.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    num2=sc.nextInt();
       if(num1>num2){
           System.out.println("El numero: "+num1+" es mayor que el numero "+num2);
       }
       if(num1<num2){
       System.out.println("El numero: "+num1+" es menor que el numero "+num2);    
       }
       if(num1==num2){
       System.out.println("El numero: "+num1+" es igual al numero "+num2); 
        }
  }
}
