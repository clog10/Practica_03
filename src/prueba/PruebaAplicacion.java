/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import control.ConexionArchivo;
import datos.AdaptadorArchivo;
import datos.Arreglo;
import datos.ArregloElementos;
import practica.Elemento;

/**
 *
 * @author Carlos Loaeza
 */
public class PruebaAplicacion {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        ConexionArchivo.conectar("jdbc:derby://localhost:1527/DATOS", "administrador", "123456");
        System.out.println("-----------------------------------------------------");

        System.out.println("Prueba Clase AdaptadorArchivo");
        System.out.println("-----------------------------------------------------");

        Elemento elemento1 = new Elemento();
        elemento1.setDato("Patrón Composite");
        System.out.println(elemento1.toString());
        System.out.println("-----------------------------------------------------");

        ArregloElementos ae = new AdaptadorArchivo();
 
        ae.addElemento(elemento1);
        System.out.println("-----------------------------------------------------");
        ae.listar();

        System.out.println("-----------------------------------------------------");
        System.out.println("Recuperando Elemento");
        System.out.println(ae.getElemento(4).toString());
        System.out.println("-----------------------------------------------------");
        System.out.println("Prueba Clase Arreglo");
        System.out.println("-----------------------------------------------------");

        ArregloElementos arr = new Arreglo();

        Elemento elemento2 = new Elemento();
        elemento2.setDato("Patrón Singleton");

        Elemento elemento3 = new Elemento();
        elemento3.setDato("Patrón Bridge");

        Elemento elemento4 = new Elemento();
        elemento4.setDato("Patrón Adapter");

        Elemento elemento5 = new Elemento();
        elemento5.setDato("Patrón de Estrategia");

        Elemento elemento6 = new Elemento();
        elemento6.setDato("Patrón Factory");

        arr.addElemento(elemento2);
        arr.addElemento(elemento3);
        arr.addElemento(elemento4);
        arr.addElemento(elemento5);
        arr.addElemento(elemento6);
        System.out.println("-----------------------------------------------------");
        arr.listar();
        System.out.println("-----------------------------------------------------");
        System.out.println("Recuperando Elemento");
        Elemento recuperado = arr.getElemento(1);
        System.out.println(recuperado);
        System.out.println("-----------------------------------------------------");    
    }

}
