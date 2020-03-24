
/**
 * Lista todos los numeros pares dado un numero,
 * mostrara todos los que esten por debajo del numero
 * la entrada debe ser un numero entero,para que funcione
 * @author (Israel Sandi) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class NumerosPares
{
 
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.println("Ingrese un numero: ");
        num=sc.nextInt();
       for(int i=0;i<=num;i++){
        if(i%2==0){
         System.out.println("  "+i+"  ");
        }
        else{
          System.out.println();  
        }
        } 
    }
}