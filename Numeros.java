
/**
 * Crear una matriz de números de 100 posiciones, que contendrá los
 * números del 1 al 100. Obtener la suma de todos ellos y la media.
 * @author (Israel Sandi) 
 * @version (a version number or a date)
 */
public class Numeros{
   public static void main(String []args){
        int [] vector = new int[100];
        int k =1;
        int suma = 0;
        double promedio = 0.0;
        for(int i = 0 ; i < vector.length ;i++){
             vector [i] = k;
             k++;
        }
       
        for(int j = 0; j <= vector.length; j++){
            System.out.print(" "+ j +" ");
            if(j % 10 == 0){
                System.out.println("");
            }
        }
        
        for(int i = 0; i < vector.length; i++){
            System.out.println( "suma: "+suma);
            suma = suma + vector[i];
        }
        promedio = (double)suma / vector.length;
        System.out.println("La suma de los numeros del arreglo son: "+suma);
        System.out.println("suma:\t "+ suma + "\t /" + vector.length + "\t =" + promedio );
       // System.out.println("El promedio es: "+ promedio );
    }
}


   
        