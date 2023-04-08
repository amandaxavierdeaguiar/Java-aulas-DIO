package dio.Springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
}