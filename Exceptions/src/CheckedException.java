
import java.io.*;

import javax.swing.JOptionPane;

public class CheckedException {
//Imprimir um arquivo no console.
    public static void main(String[] args) {
        String nomeDoArquivo = "testeArquivo.txt";

        try {
            imprimirArquivoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            //Mostrar mensagem em caso de FileNotFoundException.
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que deseja imprimir! " + e.getCause());
        } catch (IOException e) {
            //Mostrar mensagem em caso de IOException
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!" + e.getCause());
            e.printStackTrace();
        } finally { //Finaly é opicional
            System.out.println("Chegou no Finally!");
        }


        System.out.println("Atividade para imprimir arquivo no console e tratar erros! ");
    }

    static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        /*FileReader lança uma Exception FileNotFoundException - tem que tratar. 
         * IOException é mãe da FileNotFoundException
        */
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}