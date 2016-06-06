/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usu21
 */
public class dosColumnas {

  public static void main(String[] args) {
		// Fichero del que queremos leer
		File fichero = new File("fichero_leer2.txt");
		Scanner s = null;
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
                        int a = 0;
                        int b = 0;
                        int max1 = Integer.MIN_VALUE;
                        int max2 = Integer.MIN_VALUE;
                        int max = Integer.MIN_VALUE;
                        int cont=0;
                        ArrayList cl = new ArrayList();
			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine();
                                String [] arr = linea.split("\t");
                                a += Integer.parseInt(arr[0]);
                                b = b+Integer.parseInt(arr[1]);
                                cont++;
				System.out.println("La linea "+cont+", es: "+arr[0]+"\t"+arr[1]);
                                
                                //Maximo por collection:
                                cl.add(Integer.parseInt(arr[0]));
                                cl.add(Integer.parseInt(arr[1]));
                                
                                if ( Integer.parseInt(arr[0])  > max1 ){
                                max1 = Integer.parseInt(arr[0]);   
                                }
                                if ( Integer.parseInt(arr[1])> max2){
                                max2 = Integer.parseInt(arr[1]);
                                }
                        }
                        if (max1 == max2){
                            max=max2;
                        }else if (max1>max2) {
                        max = max1;
                    }else{
                        max=max2;
                        }
                        System.out.println("La media de la primera columna es: "+a/cont);
                        System.out.println("La media de la segunda columna es: "+b/cont);
                        System.out.println("El número más alto es: "+max);
                        System.out.println("El número más alto por collection es: "+Collections.max(cl));
                        System.out.println("El número mínimo por collection es: "+Collections.min(cl));
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