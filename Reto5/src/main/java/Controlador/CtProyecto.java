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
public class CtProyecto {
    
    private ModeloDAO modeloDAO;

    public CtProyecto() {
        this.modeloDAO = new ModeloDAO();
    }
    
    
    
     public DefaultTableModel listarProyecto() {
        ResultSet rs = modeloDAO.consultar("SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                + "FROM Proyecto WHERE Clasificacion = 'Casa Campestre' and Ciudad in "
                + "('Santa Marta', 'Cartagena', 'Barranquilla')");
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID_Proyecto", "Constructora", "Numero_Habitaciones", "Ciudad"});
        

        try {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)});
                
            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
        
        return model;
    }
}
