package figuras_geometricas;

/* Ejercicios propuestos.
   Agregar una nueva clase denominada Rombo. Definir los métodos
   para calcular el área y el perímetro de esta nueva figura geométrica. */
public class Rombo {

    // Atributos
    int lado, diagonalA, diagonalB;

    // Constructor
    Rombo(int lado, int diagonalA, int diagonalB){
        this.lado = lado;
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
    }

    // Metodos

    double calcularArea(){
        return (4 * lado);
    }

    double calcularPerimetro(){
        return (diagonalA * diagonalB) / 2;
    }

}
