/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Migracion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.PantallaBusqueda;
import pantallas.Pantallas;

/**
 *
 * @author Odalys
 */
public class ReaderWriter {
    
    public static void leerRegistrosM() {
        
        try (BufferedReader in = new BufferedReader(new FileReader("./src/images/migraciones.txt"))) {
            String line = "";
            
            while ((line = in.readLine()) != null) {
                String[] migraciones = line.split(",");
                Migrante mig = new Migrante(migraciones[6], migraciones[7], migraciones[8], new SimpleDateFormat("dd/MM/yyyy").parse(migraciones[9]), Integer.valueOf(migraciones[10]));
                Migracion migracion = new Migracion(migraciones[0], migraciones[1], new SimpleDateFormat("dd/MM/yyyy").parse(migraciones[2]), new SimpleDateFormat("dd/MM/yyyy").parse(migraciones[3]), migraciones[4], migraciones[5], mig);
                Migracion.agregarLeer(migracion);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantallas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantallas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException pe) {
            System.out.println(pe.toString());
        }
        
    }

    public static void writerRegistrosM() {
        Iterator<Migracion> it = Migracion.getRegistroMigratorios().iterator();
        try (FileWriter out = new FileWriter("./src/images/migraciones.txt");
                BufferedWriter bw = new BufferedWriter(out)) {
            
            while (it.hasNext()) {
                bw.write(it.next().toString());
            }
        } catch (FileNotFoundException f) {
            System.out.println(f.toString());
        } catch (IOException io) {
            System.out.println(io.toString());
        }
        
    }
    
}
