
/**
 * Write a description of class SumaImpares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumaImpares
{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int num;
    int suma=0;
    System.out.println("Ingrese un numero: ");
    num=sc.nextInt();
    for(int i=0;i<=num;i++){
      if(i%2!=0){
        suma=suma+i;
        }
    
    }
    System.out.println("La suma de los impares del numero: "+num+" es "+suma);
    }  
    
}