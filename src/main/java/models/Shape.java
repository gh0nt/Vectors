/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

    @JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Circle.class, name = "circle"),
    @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
    @JsonSubTypes.Type(value = Elipse.class, name = "elipse"),
    @JsonSubTypes.Type(value = Square.class, name = "square")
})
/**
 *
 * @author Estudiante
 */
public class Shape {
    private String type;

     public Shape() {
        // Constructor por defecto necesario para Jackson
    }

    public Shape(String type) {
        this.type = type;
    }
     
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
