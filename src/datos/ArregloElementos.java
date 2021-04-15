/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import practica.Elemento;

/**
 *
 * @author Carlos Loaeza
 */
public interface ArregloElementos {
    
    public Elemento getElemento(int p);
    
    public void addElemento(Elemento elemento);
    
    public void listar();
}
