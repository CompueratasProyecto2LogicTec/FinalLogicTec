/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author estadm
 */
public class PosImagen {
    private String _rutaImagen;
    private int _tamX;
    private int _tamY;
    private int _posX;
    private int _posY;
    private BufferedImage _Image;
    
    public PosImagen(String ruta,int tamx,int tamy){
        this._rutaImagen=ruta;
        this._tamX=tamx;
        this._tamY= tamy;
        setImage(ruta,tamx,tamy);
    }
    public void setPosx(int posX){
        _posX=posX;
    }
    public void setPosY(int posY){
        _posY=posY;
    }
    public Rectangle getRectangle(){
        Rectangle r = new Rectangle(_posX, _posY,_tamX,_tamY);
        return r;
    }
    private void setImage(String ruta,int tamx,int tamy){
        CargarImage loaders = new CargarImage();
        BufferedImage Image= null;
        try {
            Image = loaders.loadImage(ruta);
        } catch (Exception e) {
        }
        Sprite sFondo = new Sprite(Image);
        _Image= sFondo.grabsprite(0, 0,tamx,tamy);  
        
    }
    
    
}
