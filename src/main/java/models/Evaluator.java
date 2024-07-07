/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC-OSCAR
 */
public class Evaluator {
    int id_usuario;
    String nombre;
    String password;
    String usuario;

    public Evaluator() {
    }

    public Evaluator(int id_usuario, String nombre, String password, String usuario) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.password = password;
        this.usuario = usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
