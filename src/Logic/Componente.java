/**
 * Last edition: 10/30/2014
 */

/**
 * package Logic
 */
package Logic;

/**
 * This class create the object type Componente
 * @author Albin, Jairo and Ellioth
 */
public class Componente {
    private String _tipo;
    private String _imagen;
    private Componente _sigtConexion;
    private int _numEntradas;
    private Lista _valorEntrada;
    private double _posx;
    private double _posy;
        
    /**
     * COnstructor of the class
     * @param _tipo
     * @param _imagen
     * @param _numEntradas
     * @param _posx
     * @param _posy 
     */
    public Componente (String _tipo, String _imagen, int _numEntradas, double _posx, double _posy){
        this._tipo = _tipo;
        this._imagen = _imagen;
        this._numEntradas = _numEntradas;
        this._posx=_posx;
        this._posy=_posy;
        this._sigtConexion = null;
        this._valorEntrada=null;
    }   
    /**
     * Get to obtain the type of the Componente
     * @return _tipo (type)
     */
    public String getTipo(){
        return this._tipo;
    }
    /**
     * Get to obtain the route of the image
     * @return route
     */
    public String getImagen (){
        return this._imagen;
    }
    /**
     * Get to obtain the number of ins
     * @return number of ins 
     */
    public int getNumEntradas(){
        return this._numEntradas;
    }
    /**
     * Get to obtain the next connection
     * @return next connection (object Componente)
     */
    public Componente getSigtConexion(){
        return this._sigtConexion;
    }
    /**
     * Set to change the next connection
     * @param _sigtConexion (object Componente)
     */
    public void setSigtConexion (Componente _sigtConexion){
        this._sigtConexion = _sigtConexion;        
    }
    /**
     * Get to obtain the value (list) of the ins
     * @return _valorEntrada
     */
    public Lista getValorEntrada(){
        return this._valorEntrada;
    }
    /**
     * Get to obtain the position in x
     * @return _posx 
     */
    public double getPosx(){
        return this._posx;
    }
    /**
     * Get to obtain the position in y
     * @return _posy
     */
    public double getPosy(){
        return this._posy;
    }
    /**
     * Set to change the position in x
     * @param _posx 
     */
    public void setPosx(double _posx) {
        this._posx = _posx;
    }
    /**
     * Set to change the position in y
     * @param _posy 
     */
    public void setPosy(double _posy) {
        this._posy = _posy;
    }    
}           