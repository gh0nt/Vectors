/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Estudiante
 */
public class Square extends Shape{
    int side;
    int x;
    int y;
    String color;


    public Square() {
        
        }
    
    public Square(int side, int x, int y,String color) {
        super("square");
        this.side = side;
        this.x=x;
        this.y=y;
        this.color=color;
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

    public String getColor() {
        return color;
    }

    public int getSide() {
        return side;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setSide(int side) {
        this.side = side;
    }
     public int perimeter()
   {
       return 4*this.side;
   }
     
       public double area()
   {
       return this.side*this.side;
   }
}
