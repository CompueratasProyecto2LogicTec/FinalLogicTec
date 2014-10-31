/**
 * Last edition: 10/30/2014
 */

/**
 * package Logic
 */
package Logic;

/**
 * This class execute the process of any Compuerta Logic
 * @author jairo
 */
public class CompuertasLogicas {  
    private String _tipo;
    private Lista _lista;
    private int _cero=0;
    private int _uno=1;
    /**
     * Constructor of the class
     * @param _tipo
     * @param _lista 
     */
    public CompuertasLogicas(String _tipo, Lista _lista) {
        this._tipo=_tipo;
        this._lista=_lista;
    }
    /**
     * This method identify the _tipo and go information to respective Compuerta
     * @param _tipo
     * @param _lista 
     */
    public void compuertas (String _tipo, Lista _lista){
        if(_tipo.equals("And"))
            And(_lista);
        else if (_tipo.equals("Nand"))
            Nand (_lista);
        else if (_tipo.equals("Or"))
            Or (_lista);
        else if (_tipo.equals("Nor"))
            Nor (_lista);
        else if (_tipo.equals("Xor"))
            Xor (_lista);
        else if (_tipo.equals("Xnor"))
            Xnor (_lista);
        else if (_tipo.equals("Not"))
            Not (_lista);
        else
            Linea(_lista);
    }
    /**
     * This method do the Compuerta And
     * @param _lista
     * @return int (result of the operation)
     */    
    private int And (Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_uno;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_uno))
                tmp=tmp.getNext();
            else{
                x=_cero;
                break;}
        }
        return x;
    }
    /**
     * This method do the negative of the Compuerta And
     * @param _lista
     * @return int (result of the operation)
     */
    private int Nand(Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_cero;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_uno))
                tmp=tmp.getNext();
            else{
                x=_uno;
                break;}
        }
        return x;
    }
    /**
     * This method do the Compuerta Or
     * @param _lista
     * @return int (result of the operation)
     */
    private int Or (Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_cero;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_cero))
                tmp=tmp.getNext();
            else{
                x=_uno;
                break;}
        }
        return x;
    }
    /**
     * This method do the negative of the Compuerta Or
     * @param _lista
     * @return int (result of the operation)
     */
    private int Nor(Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_uno;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_cero))
                tmp=tmp.getNext();
            else{
                x=_cero;
                break;}
        }
        return x;
    }
    /**
     * This method do the Compuerta Exclusive Or
     * @param _lista
     * @return int (result of the operation)
     */
    private int Xor(Lista _lista){
        Nodo tmp = _lista.getHead().getNext();
        int x= (int)_lista.getHead().get_data();
        while(tmp!=null){
            if (tmp.get_data().equals(x)){
                x=_cero;
                tmp=tmp.getNext();
            }
            else{
                x=_uno;
                tmp=tmp.getNext();                
            }
        }
        return x;
    }
    /**
     * This method do the negative of the Compuerta Exclusive Or
     * @param _lista
     * @return int (result of the operation)
     */
    private int Xnor(Lista _lista){
        Nodo tmp = _lista.getHead().getNext();
        int x= (int)_lista.getHead().get_data();
        while(tmp!=null){
            if (tmp.get_data().equals(x)){
                x=_uno;
                tmp=tmp.getNext();
            }
            else{
                x=_cero;
                tmp=tmp.getNext();                
            }
        }
        return x;
    }
    /**
     * This method do the Compuerta Not
     * @param _lista
     * @return int (result of the operation)
     */
    private int Not (Lista _lista){
        if (_lista.getHead().get_data().equals(_uno)){
            return _cero;
        }
        else{
            return _uno;
        }
    }
    /**
     * This method do the data of the line
     * @param _lista
     * @return int (result of the operation)
     */
    private int Linea (Lista _lista){
        if (_lista.getHead().get_data().equals(_uno)){
            return _uno;
        }
        else{
            return _cero;
        }
    }    
}
