/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Lider;
import Modelo.*;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daiitoku
 */
public class CtLider {

    private ModeloDAO modeloDAO;

    public CtLider() {
        this.modeloDAO = new ModeloDAO();
    }

    public DefaultTableModel listar() {
        ResultSet rs = modeloDAO.consultar("SELECT ID_Lider,Nombre,Primer_Apellido,"
                + "Ciudad_Residencia FROM Lider ORDER BY ciudad_residencia");
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID_Lider", "Nombre", "Primer_Apellido", "Ciudad_Residencia"});

        try {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("ID_Lider"), rs.getString("Nombre"), rs.getString("Primer_Apellido"), rs.getString("Ciudad_Residencia")});

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        return model;
    }

    public LinkedList<Lider> lidtarLiderCiudad() {
        ResultSet rs = modeloDAO.consultar(" SELECT Ciudad_Residencia  AS CIUDAD,"
                + " count(Ciudad_Residencia) AS TOTAL "
                + "From Lider GROUP BY Ciudad_Residencia");
        LinkedList<Lider> lideres = new LinkedList<>();
        try {
            while (rs.next()) {
                String nombre = rs.getString(1);
                int cantidad = rs.getInt(2);
                Lider lider = new Lider(nombre, cantidad);
                lideres.add(lider);
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return lideres;

    }
}
