/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author jairo
 */

public class Conexiones {
    
    private Lista _componente;
    
    public Conexiones(Lista _componente){
        this._componente=_componente;
                
    }
    
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
    
    
}
