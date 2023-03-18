package figuras_geometricas;

// Clase rectangulo
public class Rectangulo {

    // Atributos
    int base, altura;

    // Constructor
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    // Metodos
    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
