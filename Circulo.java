package figuras_geometricas;

// Clase circulo
public class Circulo {

    // Atributos
    int radio;

    // Constructor
    Circulo(int radio){
        this.radio = radio;
    }

    // Métodos
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
