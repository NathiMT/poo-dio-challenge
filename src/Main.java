import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathália");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devNathalia.getConteudosInscritos());

        devNathalia.progredir();
        devNathalia.progredir();

        System.out.println("----");
        System.out.println("Conteúdos Inscritos" + devNathalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devNathalia.getConteudosConcluidos());
        System.out.println("XP: " + devNathalia.calcularTotalXp());

        System.out.println("-------- // ---------");

        Dev devEdu = new Dev();
        devEdu.setNome("Eduardo");
        devEdu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devEdu.getConteudosInscritos());

        devEdu.progredir();
        devEdu.progredir();
        devEdu.progredir();

        System.out.println("----");
        System.out.println("Conteúdos Inscritos" + devEdu.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devEdu.getConteudosConcluidos());
        System.out.println("XP: " + devEdu.calcularTotalXp());
    }
}
