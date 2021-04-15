/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import org.apache.derby.client.am.Connection;
import org.apache.derby.client.am.ResultSet;
import org.apache.derby.client.am.Statement;
import practica.Elemento;

/**
 *
 * @author Carlos Loaeza
 */
public class ConexionArchivo {

    private static Connection con;
    private static Conexion conec;

    public static void conectar(String url, String usuario, String password) {
        //"jdbc:derby://localhost:1527/ACADEMICA", "administrador", "123456"
        conec = conec.getConexion(url, usuario, password);
        con = conec.getConneccion();
    }

    public static void Insertar(Elemento e) {
        try {
            java.sql.Statement st = con.createStatement();//inserta, actualiza o elimina
            st.executeUpdate("INSERT INTO ADMINISTRADOR.ELEMENTO (dato) values ('" + e.getDato() + "')");
            System.out.println("Elemento Agregado Exitosamente");
        } catch (Exception ex) {
            System.err.println("Error al Insertar " + ex);
        }
    }

    public static Elemento recuperar(int p) {
        Elemento elemento = new Elemento();
        try {
            Statement ps = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) ps.executeQuery("SELECT dato FROM ADMINISTRADOR.ELEMENTO WHERE idElemento=" + p);
            while (rs.next()) {
                String dat = "";
                dat = rs.getString(1);
                elemento.setDato(dat);
            }
        } catch (Exception e) {
            System.err.println("Error al listar " + e);
        }
        return elemento;
    }

    public static void consultaDatos() {
        Elemento elemento = new Elemento();
        String dat = "";
        try {
            Statement ps = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) ps.executeQuery("SELECT dato FROM ADMINISTRADOR.ELEMENTO");
            while (rs.next()) {
                dat = rs.getString(1);
                elemento.setDato(dat);
                System.out.println(elemento.toString());
            }
        } catch (Exception e) {
            System.err.println("Error al listar " + e);
        }
    }
}
