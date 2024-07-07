/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Estudiante
 */
public class Line extends Shape{
    Point start; 
    Point end;
     

    public Line(Point start, Point end) {
        super("line");
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }
     
    public int perimeter()
   {
       return end.getX()-start.getX();
   }
}
