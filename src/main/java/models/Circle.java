/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Estudiante
 */
public class Circle extends Shape{
    int radio, x, y;
    String color;

     public Circle() {
        
        }
    
    public Circle(int radio, int x, int y, String color) {
        super("circle");
        this.radio = radio;
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public int getRadio() {
        return radio;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

public double perimeter()
   {
       return 2*3.1416*this.radio;
   }

public double area()
   {
       return 3.1416*Math.pow(this.radio, 2);
   }
}
