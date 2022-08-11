/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Daiitoku
 */
public class ModeloDAO {
    Conexion conexion;

    public ModeloDAO() {
        this.conexion=new Conexion();
    }
    
    public ResultSet consultar(String querry) {
        ResultSet result;
        try {
            var conn = conexion.Conexion();

            
            PreparedStatement st = conn.prepareStatement(querry);
            result = st.executeQuery();
           
            return result;

        } catch (Exception ex) {
            System.out.println("error" + ex);
            result = null;
            return result;
        }
    }
    
}
