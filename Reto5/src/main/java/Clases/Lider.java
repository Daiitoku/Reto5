/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daiitoku
 */
public class Lider {
    private int id;
    private String nombre;
    private String PApellido;
    private String SApellido;
    private int salrio;
    private String ciudad;
    private String cargo;
    private int clasificacion;
    private String documento;
    private String fecha;
    private int cantidad;

    public Lider(int id, String nombre, String PApellido, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.PApellido = PApellido;
        this.ciudad = ciudad;
    }

    public Lider(String nombre, int cantidad) {
        this.nombre=nombre;
        this.cantidad= cantidad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the PApellido
     */
    public String getPApellido() {
        return PApellido;
    }

    /**
     * @param PApellido the PApellido to set
     */
    public void setPApellido(String PApellido) {
        this.PApellido = PApellido;
    }

    /**
     * @return the SApellido
     */
    public String getSApellido() {
        return SApellido;
    }

    /**
     * @param SApellido the SApellido to set
     */
    public void setSApellido(String SApellido) {
        this.SApellido = SApellido;
    }

    /**
     * @return the salrio
     */
    public int getSalrio() {
        return salrio;
    }

    /**
     * @param salrio the salrio to set
     */
    public void setSalrio(int salrio) {
        this.salrio = salrio;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the clasificacion
     */
    public int getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
