package Singleton;

public class SingletonLazyHolder {

    //encapsular a instancia numa classe estatica interna
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
