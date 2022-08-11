/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daiitoku
 */
public class CtCompra {

    private ModeloDAO modeloDAO;

    public CtCompra() {
        this.modeloDAO = new ModeloDAO();
    }

    public DefaultTableModel listarCompra() {
        ResultSet rs = modeloDAO.consultar("SELECT ID_Compra, Constructora, Banco_Vinculado "
                + "FROM Compra INNER JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto "
                + "WHERE Proveedor = 'Homecenter'and Proyecto.Ciudad ='Salento'");

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID_Compra", "Constructora", "Banco_Vinculado"});

        try {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3)});

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        return model;
    }
}
