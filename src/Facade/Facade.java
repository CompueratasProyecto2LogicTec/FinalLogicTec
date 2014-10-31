/**
 * Last edition: 10/30/2014
 */

/**
 * package Facade
 */
package Facade;

import Logic.Componente;
import Logic.Conexiones;
import Logic.Lista;
import Logic.Main;
import static Logic.Main.main;

/**
 *
 * @author Albin, Jairo and Ellioth
 * 
 * Class to transfer data
 */
public class Facade {
    Lista lista;
    Conexiones conexion;
    Main mains;
    
    public Facade (){
         mains= new Main();
    }
    public void crearComp(String ptipo,int pnumEntradas){
        mains.crearComp(ptipo,pnumEntradas);
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
