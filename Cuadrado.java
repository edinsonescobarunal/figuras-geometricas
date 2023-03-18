package figuras_geometricas;

// Clase cuadrado
public class Cuadrado {

    // Atributos
    int lado;

    // Constructor
    Cuadrado(int lado){
        this.lado = lado;
    }

    // Metodos
    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}
