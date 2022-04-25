package com.castelar.contacts.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Persona {
    // Siempre private final Property
    private final StringProperty nombre;
    private final StringProperty apellidos;
    private final StringProperty direccion;
    private final IntegerProperty codigo_postal;
    private final StringProperty ciudad;
    private final ObjectProperty<LocalDate> cumple;

    public Persona() {
        nombre = null;
        apellidos = null;
        direccion = null;
        codigo_postal = null;
        ciudad = null;
        cumple = null;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = new SimpleStringProperty(nombre);
        this.apellidos = new SimpleStringProperty(apellidos);
        this.direccion = new SimpleStringProperty("direccion");
        this.codigo_postal = new SimpleIntegerProperty(06011);
        this.ciudad = new SimpleStringProperty("ciudad");
        this.cumple = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public StringProperty apellidosProperty() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public int getCodigo_postal() {
        return codigo_postal.get();
    }

    public IntegerProperty codigo_postalProperty() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal.set(codigo_postal);
    }

    public String getCiudad() {
        return ciudad.get();
    }

    public StringProperty ciudadProperty() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad.set(ciudad);
    }

    public LocalDate getCumple() {
        return cumple.get();
    }

    public ObjectProperty<LocalDate> cumpleProperty() {
        return cumple;
    }

    public void setCumple(LocalDate cumple) {
        this.cumple.set(cumple);
    }
}
