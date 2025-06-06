package exercício_1;

public class Pessoa {

    float peso;
    float altura;

    public float imc(){
        float imc;

        imc = this.peso/(this.altura * this.altura);

        return imc;
    }

}
