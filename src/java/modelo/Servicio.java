/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author Informatica
 */
@Singleton
public class Servicio implements ServicioLocal {
private ArrayList<Producto>lista=new ArrayList();




  
    public Servicio() {
        lista.add(new Producto("bicicleta",49990));
           lista.add(new Producto("Mesa",150990));
    }

    @Override
    public void addProducto(Producto p) {
        lista.add(p);
    }

    @Override
    public ArrayList<Producto> getProductos() {
        return lista;
    }
    
}
