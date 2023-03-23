import javax.swing.JOptionPane;

public class ExceptionPersonalizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0 ; i < denominador.length; i++) {
            try{ 
                if(numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador [i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e){
                JOptionPane.showMessageDialog(null, e.getMessage());;
                e.printStackTrace();
            } catch (ArithmeticException ex){
                JOptionPane.showMessageDialog(null, "Não pode dividir o numero por zero" + ex.getMessage());
                ex.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(null, "Array Exception " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {
    
    private int numerador;
    private int denominador;

    @Override
    public String toString() {
        return "DivisaoNaoExataException [numerador=" + numerador + ", denominador=" + denominador + "]";
    }

    public DivisaoNaoExataException(String message, int numerador, int denominador){
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }  
}

class DivisaoNumeroZeroArithmeticException extends ArithmeticException{

    private int numerador2;
    private int denominador2;
    
    public DivisaoNumeroZeroArithmeticException(String message, int numerador2, int denominador2){
        super(message);
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    @Override
    public String toString() {
        return "DivisaoNumeroZeroArithmeticException [numerador2=" + numerador2 + ", denominador2=" + denominador2 + "]";
    }
}

class NumeroBoundsExcepcion extends ArrayIndexOutOfBoundsException {
    private int numerador3;
    private int denominador3;


    @Override
    public String toString() {
        return "NumeroBoundsExcepcion [numerador3=" + numerador3 + ", denominador3=" + denominador3 + "]";
    }

   public NumeroBoundsExcepcion (String message, int numerador3, int denominador3){
        super(message);
        this.numerador3 = numerador3;
        this.denominador3 = denominador3;
    }
}

