import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEvandro = new Dev();
        devEvandro.setNome("Evadro");
        devEvandro.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devEvandro.getConteudosInscritos());
        devEvandro.progredir();
        devEvandro.progredir();
        System.out.println("---------------------");
        System.out.println("Conteudos Inscritos:" + devEvandro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + devEvandro.getConteudosConcluidos());
        System.out.println("XP:" + devEvandro.calcularTotalXp());

        System.out.println("=====================");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---------------------");
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}