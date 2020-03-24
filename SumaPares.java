
/**
 * Dado un numero hallar la suma de todos los pares
 * @author (Sandi) 
 */
import java.util.Scanner;

public class SumaPares{
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int num;
    int suma=0;
    System.out.println("Inserte un numero: ");
    num=sc.nextInt();
    for(int j=0; j<=num;j++){
        if(j%2==0){
        suma=suma+j;
        }
       
    }
    System.out.println("La suma de todo sus pares del numero: "+num+" es "+suma);
    }
 
}
