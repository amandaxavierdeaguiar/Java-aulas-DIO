public class Main {
    public static void main(String[] args) {
        
        //Exercicio Soma - Ex.Prof
        System.out.println("Resultado soma: ");

        SomaBasica.soma(2,6);
        SomaBasica.subtracao(6,8);
        SomaBasica.multiplicacao(9,9);
        SomaBasica.divisao(9, 2);

        //Exercicio Mensagem hora dia - Ex.Prof

        System.out.println("Saudações: ");

        MensagemHoraDia.obterMensagem(8);
        MensagemHoraDia.obterMensagem(14);
        MensagemHoraDia.obterMensagem(20);

        //Exercicio Mensagem hora dia - Minha lógica

        System.out.println("Mensagem: ");

        Saudacao.mensagem(14);
        Saudacao.mensagem(1);
        Saudacao.mensagem(20);

        //Parcelas

        System.out.println("Valores do Emprestimo com os Juros:");

        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);

        //Quadrilatero

        System.out.println("Quadrilátero utilizando a sobrecarga: ");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7, 8, 9);

        //Quadrilatero utilizando retorn

        System.out.println("Quadrilátero utilizando Return: ");

        double areaQuadrado = QuadrilateroRetorn.area(3);
        System.out.println("Área do quadrado" + areaQuadrado);
        double areaRetangulo= QuadrilateroRetorn.area(5,5);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        double areaTrapezio = QuadrilateroRetorn.area(7,8,9);
        System.out.println("Área do Trapézio: " + areaTrapezio); 
    }
}
