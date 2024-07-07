/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC-OSCAR
 */
public class AreasAsignadas {
    int id_areasasignadas;
    int id_area;
    int id_usuario;
    Double areaevaluada;
    Double areaasignada;
    Double porcentajebosque;
    String status;

    public AreasAsignadas() {
    }

    public AreasAsignadas(int id_areasasignadas, Double areaevaluada, Double areaasignada, Double porcentajebosque, String status) {
        this.id_areasasignadas = id_areasasignadas;
        this.areaevaluada = areaevaluada;
        this.areaasignada = areaasignada;
        this.porcentajebosque = porcentajebosque;
        this.status = status;
    }

    public int getId_areasasignadas() {
        return id_areasasignadas;
    }

    public void setId_areasasignadas(int id_areasasignadas) {
        this.id_areasasignadas = id_areasasignadas;
    }

    public int getId_area() {
        return id_area;
    }

    public int getId_usuario() {
        return id_usuario;
    }
  
    public String getStatus() {
        return status;
    }

    public Double getAreaevaluada() {
        return areaevaluada;
    }

    public Double getAreaasignada() {
        return areaasignada;
    }

    public Double getPorcentajebosque() {
        return porcentajebosque;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setAreaevaluada(Double areaevaluada) {
        this.areaevaluada = areaevaluada;
    }

    public void setAreaasignada(Double areaasignada) {
        this.areaasignada = areaasignada;
    }

    public void setPorcentajebosque(Double porcentajebosque) {
        this.porcentajebosque = porcentajebosque;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
}
