/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import models.Point;
import models.Square;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import models.Shape;
import models.ShapeCollection;
import java.util.List;
import javax.imageio.ImageIO;
import models.Circle;
import models.Elipse;
import models.Rectangle;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import models.AreasAsignadas;
import org.springframework.core.ParameterizedTypeReference;


/**
 *
 * @author Estudiante
 */
public class MainPanel extends javax.swing.JPanel {
    private int x, y, width;
    private boolean shouldDraw = false;
    double evaluatedarea=0, nativeforest=0, porcentajebosque=0;
    ImageIcon icon;
    ShapeCollection shapeCollection = new ShapeCollection();
    BufferedImage backgroundImage;
    int id_areaasignada, id_usuario, id_area;
    /**
     * Creates new form MainPanel
     */
    public MainPanel(int id_areaasignada) {
        this.id_areaasignada=id_areaasignada;
        initComponents();
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/AreasAsignadas/"+id_areaasignada; 
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        
         ResponseEntity<AreasAsignadas> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<AreasAsignadas>() {});

        AreasAsignadas resultados = response.getBody();

        if (resultados != null) {
            id_area=resultados.getId_area();
            id_usuario=resultados.getId_usuario();
        }
        
        this.setSize(1200,900);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        CargarImagen = new javax.swing.JButton();
        LabelCuadrado = new javax.swing.JLabel();
        PosicionX = new javax.swing.JTextField();
        Ancho = new javax.swing.JTextField();
        LabelX = new javax.swing.JLabel();
        LabelLado = new javax.swing.JLabel();
        DibujarCuadrado = new javax.swing.JButton();
        LabelY = new javax.swing.JLabel();
        PosicionY = new javax.swing.JTextField();
        CargarJson = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AltoRec = new javax.swing.JTextField();
        AnchoRec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboColor = new javax.swing.JComboBox<>();
        DibujarRectangulo = new javax.swing.JButton();
        Radio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DibujarCirculo = new javax.swing.JButton();
        AltoElipse = new javax.swing.JTextField();
        AnchoElipse = new javax.swing.JTextField();
        DibujarElipse = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        AreaEvaluada = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AreaBosque = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PorcentajeBosque = new javax.swing.JLabel();
        CalcularArea = new javax.swing.JButton();

        setLayout(null);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setText("Carbon Credits");
        add(Titulo);
        Titulo.setBounds(464, 24, 161, 74);

        CargarImagen.setText("Cargar Imagen");
        CargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarImagenActionPerformed(evt);
            }
        });
        add(CargarImagen);
        CargarImagen.setBounds(10, 120, 120, 30);

        LabelCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCuadrado.setText("Cuadrado");
        add(LabelCuadrado);
        LabelCuadrado.setBounds(100, 530, 70, 16);
        add(PosicionX);
        PosicionX.setBounds(60, 420, 40, 22);

        Ancho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnchoActionPerformed(evt);
            }
        });
        add(Ancho);
        Ancho.setBounds(90, 560, 91, 22);

        LabelX.setText("X:");
        add(LabelX);
        LabelX.setBounds(40, 420, 30, 16);

        LabelLado.setText("Lado:");
        add(LabelLado);
        LabelLado.setBounds(40, 560, 40, 16);

        DibujarCuadrado.setText("Cuadrado");
        DibujarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarCuadradoActionPerformed(evt);
            }
        });
        add(DibujarCuadrado);
        DibujarCuadrado.setBounds(80, 620, 90, 23);

        LabelY.setText("Y:");
        add(LabelY);
        LabelY.setBounds(40, 450, 20, 16);
        add(PosicionY);
        PosicionY.setBounds(60, 450, 40, 22);

        CargarJson.setText("Cargar");
        CargarJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarJsonActionPerformed(evt);
            }
        });
        add(CargarJson);
        CargarJson.setBounds(20, 200, 110, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Rectangulo");
        add(jLabel1);
        jLabel1.setBounds(320, 530, 70, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Circulo");
        add(jLabel2);
        jLabel2.setBounds(500, 530, 60, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Elipse");
        add(jLabel3);
        jLabel3.setBounds(660, 530, 50, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Coordenadas:");
        add(jLabel4);
        jLabel4.setBounds(30, 400, 90, 16);
        add(AltoRec);
        AltoRec.setBounds(320, 560, 64, 22);
        add(AnchoRec);
        AnchoRec.setBounds(320, 590, 64, 22);

        jLabel5.setText("Alto:");
        add(jLabel5);
        jLabel5.setBounds(260, 560, 30, 16);

        jLabel6.setText("Ancho:");
        add(jLabel6);
        jLabel6.setBounds(260, 590, 50, 16);

        ComboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo" }));
        add(ComboColor);
        ComboColor.setBounds(40, 490, 72, 22);

        DibujarRectangulo.setText("Rectangulo");
        DibujarRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarRectanguloActionPerformed(evt);
            }
        });
        add(DibujarRectangulo);
        DibujarRectangulo.setBounds(300, 620, 100, 23);
        add(Radio);
        Radio.setBounds(500, 560, 71, 22);

        jLabel7.setText("Radio:");
        add(jLabel7);
        jLabel7.setBounds(450, 560, 40, 16);

        DibujarCirculo.setText("Circulo");
        DibujarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarCirculoActionPerformed(evt);
            }
        });
        add(DibujarCirculo);
        DibujarCirculo.setBounds(490, 610, 80, 23);
        add(AltoElipse);
        AltoElipse.setBounds(670, 560, 71, 22);
        add(AnchoElipse);
        AnchoElipse.setBounds(670, 590, 70, 22);

        DibujarElipse.setText("Elipse");
        DibujarElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarElipseActionPerformed(evt);
            }
        });
        add(DibujarElipse);
        DibujarElipse.setBounds(660, 620, 72, 23);

        jLabel8.setText("Alto:");
        add(jLabel8);
        jLabel8.setBounds(620, 560, 40, 16);

        jLabel9.setText("Ancho:");
        add(jLabel9);
        jLabel9.setBounds(620, 590, 50, 16);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        add(Guardar);
        Guardar.setBounds(20, 160, 110, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Area Evaluada:");
        add(jLabel10);
        jLabel10.setBounds(20, 270, 90, 16);

        AreaEvaluada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AreaEvaluada.setForeground(new java.awt.Color(51, 51, 255));
        AreaEvaluada.setText("0");
        add(AreaEvaluada);
        AreaEvaluada.setBounds(40, 290, 70, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Area Bosque Nativo:");
        add(jLabel12);
        jLabel12.setBounds(20, 310, 130, 20);

        AreaBosque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AreaBosque.setForeground(new java.awt.Color(255, 0, 0));
        AreaBosque.setText("0");
        add(AreaBosque);
        AreaBosque.setBounds(40, 330, 70, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Porcentaje:");
        add(jLabel14);
        jLabel14.setBounds(20, 350, 70, 20);

        PorcentajeBosque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PorcentajeBosque.setForeground(new java.awt.Color(255, 0, 0));
        PorcentajeBosque.setText("0");
        add(PorcentajeBosque);
        PorcentajeBosque.setBounds(90, 350, 60, 20);

        CalcularArea.setText("Calcular");
        CalcularArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularAreaActionPerformed(evt);
            }
        });
        add(CalcularArea);
        CalcularArea.setBounds(20, 240, 110, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void CargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarImagenActionPerformed
    JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    //icon = new ImageIcon(selectedFile.getPath());
                    //Imagen.setIcon(icon);
                    try {
                backgroundImage = ImageIO.read(selectedFile);
                
                
            } catch (IOException e) {
                e.printStackTrace();
            }
                }
                repaint();
                // TODO add your handling code here:
    }//GEN-LAST:event_CargarImagenActionPerformed

    private void AnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnchoActionPerformed

    private void CargarJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarJsonActionPerformed
         
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Shape> shapes = mapper.readValue(new File("shapes.json"), new TypeReference<List<Shape>>(){});
            shapes.forEach(shapeCollection::addShape);
            System.out.println("Shapes loaded from shapes.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        repaint();
        
    }//GEN-LAST:event_CargarJsonActionPerformed

    private void DibujarCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarCuadradoActionPerformed
        int x = Integer.parseInt(PosicionX.getText());
        int y = Integer.parseInt(PosicionY.getText());
        int width = Integer.parseInt(Ancho.getText());
        String color=ComboColor.getSelectedItem().toString();
        
        Square square;
        square=new Square(width,x,y,color);
        
        shapeCollection.addShape(new Square(width,x,y,color));

       
        repaint();
    }//GEN-LAST:event_DibujarCuadradoActionPerformed

    private void DibujarRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarRectanguloActionPerformed
        int x = Integer.parseInt(PosicionX.getText());
        int y = Integer.parseInt(PosicionY.getText());
        int height = Integer.parseInt(AltoRec.getText());
        int width = Integer.parseInt(AnchoRec.getText());
        String color=ComboColor.getSelectedItem().toString();
        
        Rectangle rectangle;
        rectangle=new Rectangle(height, width,x,y,color);
         
        shapeCollection.addShape(new Rectangle(height, width,x,y,color));

       
        repaint();
    }//GEN-LAST:event_DibujarRectanguloActionPerformed

    private void DibujarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarCirculoActionPerformed
        int x = Integer.parseInt(PosicionX.getText());
        int y = Integer.parseInt(PosicionY.getText());
        int radio = Integer.parseInt(Radio.getText());
        String color=ComboColor.getSelectedItem().toString();
        
        Circle circle;
        circle=new Circle(radio,x,y,color);
        
        shapeCollection.addShape(new Circle(radio,x,y,color));

        
        repaint();
    }//GEN-LAST:event_DibujarCirculoActionPerformed

    private void DibujarElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarElipseActionPerformed
        int x = Integer.parseInt(PosicionX.getText());
        int y = Integer.parseInt(PosicionY.getText());
        int height = Integer.parseInt(AltoElipse.getText());
        int width = Integer.parseInt(AnchoElipse.getText());
        String color=ComboColor.getSelectedItem().toString();
        
        Elipse elipse;
        elipse=new Elipse(height, width,x,y,color);
        shapeCollection.addShape(new Elipse(height, width,x,y,color));

        
        repaint();
    }//GEN-LAST:event_DibujarElipseActionPerformed

    private void CalcularAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularAreaActionPerformed
        porcentajebosque=(nativeforest*100)/evaluatedarea;
        
        AreaBosque.setText(String.valueOf(nativeforest));
        AreaEvaluada.setText(String.valueOf(evaluatedarea));
        PorcentajeBosque.setText(String.valueOf(porcentajebosque)); 
    }//GEN-LAST:event_CalcularAreaActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Convertir la colección a JSON y guardarla en un archivo
            mapper.writeValue(new File("shapes.json"), shapeCollection.getShapes());
            System.out.println("Figuras guardadas json");
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        porcentajebosque=(nativeforest*100)/evaluatedarea;
        
        AreasAsignadas areasAsignadas = new AreasAsignadas();
        areasAsignadas.setId_areasasignadas(id_areaasignada);
        areasAsignadas.setAreaevaluada(evaluatedarea);
        areasAsignadas.setId_area(id_area);
        areasAsignadas.setId_usuario(id_usuario);
        areasAsignadas.setAreaasignada(nativeforest);
        areasAsignadas.setPorcentajebosque(porcentajebosque);
        areasAsignadas.setStatus("Evaluated");
        
        System.out.println(porcentajebosque);
        
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/AreasAsignadas"; 
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        
        
        HttpEntity<AreasAsignadas> request = new HttpEntity<>(areasAsignadas, headers);

        // Enviar la petición POST
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        // Imprimir la respuesta del servidor
        
        
    }//GEN-LAST:event_GuardarActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
         
        super.paintComponent(g);
        
         evaluatedarea=0;
         nativeforest=0; 
         porcentajebosque=0;
         
      if (backgroundImage != null) {
            g.drawImage(backgroundImage, 160,120, 800, 400, null);
        }
      
        g.setColor(Color.RED);
        
         List<Shape> shapes = shapeCollection.getShapes();
        for (Shape shape : shapes) {
            if (shape instanceof Elipse) {
                Elipse elipse = (Elipse) shape;
                switch(elipse.getColor()){
                    case "Rojo":
                        g.setColor(Color.RED);
                        nativeforest=nativeforest+elipse.area();
                        break;
                    case "Azul":
                        g.setColor(Color.BLUE);
                        evaluatedarea=evaluatedarea+elipse.area();
                        break;
                }
                g.drawOval(elipse.getX(), elipse.getY(), elipse.getHeight(), elipse.getWidth());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                switch(square.getColor()){
                    case "Rojo":
                        g.setColor(Color.RED);
                        nativeforest=nativeforest+square.area();
                        break;                   
                    case "Azul":
                        g.setColor(Color.BLUE);
                        evaluatedarea=evaluatedarea+square.area();
                        break;                    
                }
                g.drawRect(square.getX(), square.getY(), square.getSide(), square.getSide());
                
            }else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                switch(rectangle.getColor()){
                    case "Rojo":
                        g.setColor(Color.RED);
                        nativeforest=nativeforest+rectangle.area();
                        break;                   
                    case "Azul":
                        g.setColor(Color.BLUE);
                        evaluatedarea=evaluatedarea+rectangle.area();
                        break;
                }
                g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getHeight(), rectangle.getWidth());
                
            }else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                switch(circle.getColor()){
                    case "Rojo":
                        g.setColor(Color.RED);
                        nativeforest=nativeforest+circle.area();
                        break;                    
                    case "Azul":
                        g.setColor(Color.BLUE);
                        evaluatedarea=evaluatedarea+circle.area();
                        break;
                }
                g.drawOval(circle.getX(), circle.getY(), circle.getRadio(), circle.getRadio());
                
            }
       
        }
       
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AltoElipse;
    private javax.swing.JTextField AltoRec;
    private javax.swing.JTextField Ancho;
    private javax.swing.JTextField AnchoElipse;
    private javax.swing.JTextField AnchoRec;
    private javax.swing.JLabel AreaBosque;
    private javax.swing.JLabel AreaEvaluada;
    private javax.swing.JButton CalcularArea;
    private javax.swing.JButton CargarImagen;
    private javax.swing.JButton CargarJson;
    private javax.swing.JComboBox<String> ComboColor;
    private javax.swing.JButton DibujarCirculo;
    private javax.swing.JButton DibujarCuadrado;
    private javax.swing.JButton DibujarElipse;
    private javax.swing.JButton DibujarRectangulo;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel LabelCuadrado;
    private javax.swing.JLabel LabelLado;
    private javax.swing.JLabel LabelX;
    private javax.swing.JLabel LabelY;
    private javax.swing.JLabel PorcentajeBosque;
    private javax.swing.JTextField PosicionX;
    private javax.swing.JTextField PosicionY;
    private javax.swing.JTextField Radio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
