/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
/**
 *
 * @author Daiitoku
 */
public class Conexion {
    private final String ubicacion = "C:/ProyectosConstruccion.db";
    
    public Connection Conexion() throws SQLException{
        String url = "jdbc:sqlite:" + ubicacion;
        return DriverManager.getConnection(url);
    }
}
