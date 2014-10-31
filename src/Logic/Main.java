/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.IOException;

/**
 *
 * @author jairo
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    public Main() {
        
    }
    public void crearComp(String ptipo,int pnumEntradas){
        Xml xml = new Xml(ptipo, pnumEntradas);
        String ruta;
        ruta = xml.getimageName();
        Componente comp = new Componente(ptipo, ruta, pnumEntradas, 200, 200);
    }
    
    
}
