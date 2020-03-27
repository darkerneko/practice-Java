
/**
 * Almacena numeros en un arreglo unidimensional dado por el 
 * usuario,muestra mensajes y una lista del arreglo llenado
 * @author (Israel Sandi) 
 * @version (A.0)
 */
import java.util.Scanner;
public class Arreglo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
            int contador=0;
            int numero;
        System.out.println("Ingrese el tamaño del arreglo: ");
            numero = sc.nextInt();
            int [] arreglo = new int[numero] ;
        System.out.println("Empiece a llenar el arreglo: ");    
    for(int i = 0 ; i < numero ; i++  ){
       System.out.println("Ingrese un numero para la posicion "+i+" : ");
            arreglo [i] = sc.nextInt();
            contador = contador +1;
        }
         System.out.println("********************************************************");        
         System.out.println("** !!EL arreglo ha sido llenado satisfactoriamente!!  **");  
         System.out.println("*********************************************************");
          if(contador==arreglo.length){
              System.out.println(" !!!  Esta es la lista de los numeros almacenados  !!!");
        for(int j = 0; j < numero; j++){
             if(j < arreglo.length-1){
                System.out.print(" "+arreglo[j]+",");
            }
             else{
                System.out.print(" "+arreglo[j]);
            }
        }   
    }
   }
 }
