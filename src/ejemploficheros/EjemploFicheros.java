/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author usu21
 */
public class EjemploFicheros {

   public static void main(String[] args) {

		// Fichero del que queremos leer
		File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
                        int a = 0;
                        int cont=0;
			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	
                                a = a+Integer.parseInt(linea);
                                cont++;
				System.out.println("La línea "+cont+", es: "+linea);
			}
                        System.out.println("La media es: "+a/cont);
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	
   }


}