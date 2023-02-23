public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaEscolar = 10;
        if (mediaEscolar < 6)
            System.out.println ("Reprovado");
        else if (mediaEscolar == 6)
            System.out.println ("Na média");
        else if (mediaEscolar == 10)
            System.out.println ("Parabéns, és um gênio!");
        else
            System.out.println ("Aprovado");
    }
}
