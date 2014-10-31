/**
 * Last edition: 10/30/2014
 */

/**
 * package Logic
 */
package Logic;

/**
 *Class to do the connection among Componentes
 * @author Albin, Jairo and Ellioth
 */
public class Conexiones {
    private Lista _componente;
    /**
     * Constructor of the class
     * @param _componente 
     */
    public Conexiones(Lista _componente){
        this._componente=_componente;
    }
    /**
     * To validate the  Componentes connection
     * @return boolean value
     */
    public boolean validaConexion (){
        Nodo tmp= this._componente.getHead();
        int contadorCompuertas=0;
        boolean condicion=true;
        while (tmp!=null){
            if (((Componente)(this._componente.getData(tmp))).getTipo()!=""){
                contadorCompuertas++;
                tmp=tmp.getNext();
            }
        }
        if (contadorCompuertas>1)
            condicion=false;
        return condicion;
    }
    
    public void establecerConexion (Componente componente1,Componente componente2){
        
    }
    public void Switch (Componente componente1, Componente componente2){
        
    }
    
    
}
