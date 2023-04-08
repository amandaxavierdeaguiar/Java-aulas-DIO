package Singleton;

public class SingletonEager {
    public static SingletonEager instancia = new SingletonEager();
    //instanciar direto

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
