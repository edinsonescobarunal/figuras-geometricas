package figuras_geometricas;

/* Ejercicios propuestos.
   Agregar una nueva clase denominada Trapecio. Definir los métodos
   para calcular el área y el perímetro de esta nueva figura geométrica. */
public class Trapecio {

    // Atributos
    int altura, ladoA, ladoB, ladoC, ladoD;

    // Constructor
    Trapecio(int altura, int ladoA, int ladoB, int ladoC, int ladoD){
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    // Metodos
    float calcularArea(){
        float i = altura * (ladoA + ladoB) / 2;
        return i;
    }

    double calcularPerimetro(){
        return (ladoA + ladoB + ladoC + ladoD);
    }
}
