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
public class Arreglo implements ArregloElementos {

    private Elemento[] elementos;

    public Arreglo() {
        elementos = new Elemento[0];
    }

    @Override
    public Elemento getElemento(int p) {
        Elemento e = new Elemento();
        if (p < elementos.length) {
            e = elementos[p];
            System.out.println(e.getDato());
        }
        return e;
    }

    @Override
    public void addElemento(Elemento elemento) {
        Elemento[] tem = new Elemento[elementos.length + 1];
        System.arraycopy(elementos, 0, tem, 0, elementos.length);
        tem[elementos.length] = elemento;
        elementos = tem;

        System.out.println("Elemento " + elemento.getDato() + " Agregado");
    }

    @Override
    public void listar() {
        System.out.println("Listar Elementos");
        for (Elemento e : elementos) {
            if(e!=null){
                System.out.println(e.getDato());
            }
        }
    }

}
