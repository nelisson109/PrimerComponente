package brandy;

import javafx.scene.Node;
import javafx.scene.control.Label;

public class Componente extends Label {

    private String nombre;

    public Componente() {
    }

    public Componente(String s) {
        super(s);
    }

    public Componente(String s, Node node) {
        super(s, node);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * este metodo saludo utilizando el nombre que tiene como propiedad
     */
    public void saludar (){
        if(nombre==null)
            throw new RuntimeException("el nombre esta vacio");// cuando entra al thro sale
        setText("Hello World "+ nombre );
    }
}
