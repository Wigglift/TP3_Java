package exercício_10_12;

public class Circulo {
    private double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI*(Math.pow(raio,2));
    }
}
