/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-OSCAR
 */
public class ShapeCollection {
    private List<Shape> shapes;
    
    
    public ShapeCollection() {
        //this.shapes = shapes;
        shapes = new ArrayList<>();
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
