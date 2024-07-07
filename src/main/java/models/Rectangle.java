/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Estudiante
 */
public class Rectangle extends Shape{
    int height, width,x,y;
    String color;

    public Rectangle(int height, int width,int x, int y, String color) {
        super("rectangle");
        this.height = height;
        this.width = width;
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int perimeter()
   {
       return 2*this.width+2*this.height;
   }
    
     public double area()
   {
       return this.width+2*this.height;
   }
}
