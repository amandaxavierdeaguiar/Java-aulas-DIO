public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        /* Forma de utilizar para ilustrar a interação entre classe e atributos */

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Meu canal atual é o: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Meu canal atual é o: " + smartTv.canal);

        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("Qual canal que se encontra? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        /* Previa do Estado que se encontra a Televisão */

        smartTv.ligar (); /*chamar o metodo da tv */
        System.out.println("Novo Status : A televisão está ligada? " + smartTv.ligada);
        /* Novo Status */

        smartTv.desligar ();
        System.out.println("Novo Status : A televisão está ligada? " + smartTv.ligada);
    }
}
