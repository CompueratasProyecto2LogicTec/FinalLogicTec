/**
 * Last edition: 10/30/2014
 */

/**
 * package Facade
 */
package Facade;

import Logic.Main;

/**
 *
 * @author Albin, Jairo and Ellioth
 * 
 * Class to transfer data
 */
public class Facade {
    
    public Facade (){
        Main main = new Main();   
    }
    public void crearComp(String ptipo,int pnumEntradas){
        main.crearComp(ptipo,pnumEntradas);
    }
    
    
    
}
