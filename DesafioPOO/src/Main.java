import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); //instancia projeto (planta da casa)
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Avançado");
        curso2.setDescricao("Curso para os feras! ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao");
        mentoria.setData(LocalDate.now()); //Aparece a data de criação

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("DEscrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Amanda " + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("........");
        System.out.println("Conteudos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Amanda" + devAmanda.getConteudosConcluidos());
        System.out.println("XP: " + devAmanda.calcularTotalXp());

        System.out.println("............");

        Dev devAdilson = new Dev();
        devAdilson.setNome("Adilson");
        devAdilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Adilson " + devAdilson.getConteudosInscritos());
        devAdilson.progredir();
        devAdilson.progredir();
        devAdilson.progredir();
        System.out.println("........");
        System.out.println("Conteudos Inscritos Adilson " + devAdilson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Adilson " + devAdilson.getConteudosConcluidos());
        System.out.println("XP: " + devAdilson.calcularTotalXp());
    }
}
