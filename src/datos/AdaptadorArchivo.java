/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import control.ConexionArchivo;
import java.util.List;
import practica.Elemento;

/**
 *
 * @author Carlos Loaeza
 */
public class AdaptadorArchivo implements ArregloElementos {

    public AdaptadorArchivo() {
    }

    @Override
    public Elemento getElemento(int p) {
        return ConexionArchivo.recuperar(p);
    }

    @Override
    public void addElemento(Elemento elemento) {
        ConexionArchivo.Insertar(elemento);
    }

    @Override
    public void listar() {
        System.out.println("Listar Elementos");
        ConexionArchivo.consultaDatos();
    }
}
