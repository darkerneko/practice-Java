
/**
 * Se crea un arreglo de String, el usuario pone un valor para el tamanio
 * y empieza a llenar con nombres, luego se muestra una lista de la misma.
 * @author (Israel Sandi) 
 * @version (ArregloA.0)
 */
import java.util.Scanner;
public class ArregloA{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador=0;
        String nombre;
        System.out.println("Ingrese el tamaño del vector");
            numero = sc.nextInt();
        String [] arreglo = new String[numero];
        System.out.println("Empieze a llenar la lista:");
        for(int i = 0; i < numero; i++){
            System.out.println("Ingrese el nombre que se almacenara en la posicion: "+i+" : ");
            nombre = sc.next();
            arreglo [i] = nombre;
            contador=contador +1;
            }
        System.out.println("El arreglo se lleno satisfactoriamente");    
        if(numero == contador){
            System.out.println("!!Estos son los nombres de la lista!!");
           for(int j = 0; j < numero; j++){
             System.out.println(" "+arreglo[j]);
            }
        }
      }
}
