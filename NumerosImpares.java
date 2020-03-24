
/**
 * Lista todos los impares que tiene un numero por debajo de este,
 * la entrada debe ser un numero entero.
 * @author (Israel Sandi) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumerosImpares{
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.println("Ingrese un numero: ");
        num=sc.nextInt();
       for(int i=0;i<=num;i++){
        if(i%2!=0){
         System.out.println("  "+i+"  ");
        }
        else{
          System.out.println();  
        }
        } 
    }
}