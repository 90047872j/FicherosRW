/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usu21
 */
public class EscrituraFichero {

    public static void main(String[] args) {
        String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",};
        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("fichero_escritura.txt");
            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                fichero.write(linea + "\n");
            }
            fichero.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        // se ejecuta de nuevo con append (añade líneas al final del fichero)
        try {
            fichero = new FileWriter("fichero_escritura.txt", true);
            String[] lineas2 = {"ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "..."};
            for (String linea : lineas2) {
                fichero.write(linea + "\n");
            }
            fichero.close();
         } catch (IOException ex) {
            Logger.getLogger(EscrituraFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
