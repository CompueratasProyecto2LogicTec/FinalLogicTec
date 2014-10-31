/**
 * Last edition: 10/30/2014
 */

/**
 * package Facade
 */
package Facade;

import Logic.Main;
import Logic.Lista;
import Logic.Componente;
import Logic.Conexiones;

/**
 *
 * @author Albin, Jairo and Ellioth
 * 
 * Class to transfer data
 */
public class Facade {
    Lista lista;
    Conexiones conexion;
    
    public Facade (){
        Main main = new Main();
    }
    public void crearComp(String ptipo,int pnumEntradas){
        main.crearComp(ptipo,pnumEntradas);
    }
    public Lista getList(){
        return lista;
    }
    
    public void Connection (Componente componente1, Componente componente2){
        conexion.establecerConexion(componente1, componente2);
    }
    public void Switch (Componente componente1, Componente componente2){
        conexion.Switch(componente1, componente2);
    }
    
}
