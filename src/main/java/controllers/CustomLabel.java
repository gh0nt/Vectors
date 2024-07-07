/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 *
 * @author PC-OSCAR
 */
public class CustomLabel extends JLabel{
    private BufferedImage backgroundImage;
    private List<Shape> shapes;
    
    public CustomLabel() {
        // Inicializar sin imagen y sin figuras
    }

    public void setBackgroundImage(BufferedImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        repaint();  // Redibujar el JLabel cuando se actualiza la imagen de fondo
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
        repaint();  // Redibujar el JLabel cuando se actualizan las figuras
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar la imagen de fondo si existe
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }

        // Dibujar las figuras sobre la imagen de fondo
       /* if (shapes != null) {
            for (Shape shape : shapes) {
                if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    g.drawOval(circle.getX(), circle.getY(), circle.getRadius() * 2, circle.getRadius() * 2);
                } else if (shape instanceof Square) {
                    Square square = (Square) shape;
                    g.drawRect(square.getX(), square.getY(), square.getSideLength(), square.getSideLength());
                }
            }
        }*/
    }
    
}
