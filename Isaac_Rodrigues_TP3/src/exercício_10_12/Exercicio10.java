package exercício_10_12;

public class Exercicio10 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0);
        Esfera esfera = new Esfera(7.0);

        System.out.printf("A area do círculo com o raio de 4 é igual a %f\n", circulo.calcularArea());

        System.out.printf("A area da esfera com o raio de 7 é igual a %f\n", esfera.calcularVolume());

    }
}
