
import java.util.Scanner;

public class hola { 

    /**
     * @param args
     */
    public static void main(String[] args) {
        
 String cadena = " jhonni  ".trim();
 int lop=  cadena.length();
 String cadena_mayucula = cadena.toUpperCase();
 String minuscula = cadena.toLowerCase();
 String palabra = cadena.substring( 0, 4);

 
System.out.println(  cadena+ "tine" + "="  +lop+ "caracteres ");
System.out.println(" la primera leyra es " +cadena.charAt(2));
System.out.println(  cadena + "en mayuscula" + cadena_mayucula);
System.out.println( " las letras minuscalas son " +minuscula);
System.out.println(  " las palabras son " + palabra);


          
        
        
    }
    
           
    

    
}
