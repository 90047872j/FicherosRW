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
public class prueba {

    public static void main(String[] args) {

        // Fichero del que queremos leer
        File fichero = new File("fichero_leer2.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);
            int a = 0;
            int cont = 0;
            double columna2 = 0;
            // Leemos linea a linea el fichero

            while (s.hasNextLine()) {
                while (s.hasNextInt()) {
                    int columna1 = s.nextInt();
                    while (s.hasNextDouble()) {
                        columna2 = s.nextDouble();
//                                (\t)
                    }
                    System.out.println("La columna 1 es " + columna1);
                    System.out.println("La columna 2 es" + columna2);

//                        while (in.hasNext()) {
//20	 
//21	// lee primera palabra
//22	 
//23	String palabra = in.next();
//24	 
//25	System.out.println("Palabra:"+palabra);
//26	 
//27	// lee números
//28	while (in.hasNextDouble()) {
//29	 // lee un double
//30	double d = in.nextDouble();
//31	 System.out.println("Número:"+d);
//- See more at: http://www.redeszone.net/2012/02/20/curso-de-java-entrada-y-salida-con-ficheros-clase-scanner/#sthash.gKMzZzWX.dpuf
                }
//            System.out.println("La media es: " + a / cont);
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

        String[] lineas = {"Uno", "Dos", "888", "Cuatro", "Cinco", "Seis", "Siete", "..."};

        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero2 = null;
        try {

            fichero2 = new FileWriter("fichero_escritura.txt");

            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                fichero2.write(linea + "\n");
            }

            fichero2.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
