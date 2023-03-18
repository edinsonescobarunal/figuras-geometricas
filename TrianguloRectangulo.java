package figuras_geometricas;

// Clase triangulo rectangulo
public class TrianguloRectangulo {

    // Atributos
    int base, altura;

    // Constructor
    TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    // Metodos
    double calcularArea() {
        return ((base * altura) / 2);
    }

    double calcularPerimetro() {
        // calcularHipotenusa() -> Invoca al método calcular hipotenusa
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow((base * base) + (altura * altura), 0.5);
    }

    /*
      Método que determina si un triángulo es:
       - Equilatero: si sus tres lados son iguales.
       - Isósceles: si dos de sus lados son iguales y el otro es diferente de los demás.
       - Escaleno: si sus tres lados son todos diferentes.
     */
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");
        }
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        }
        else{
            System.out.println("Es un triángulo isósceles");
        }

    }
}
