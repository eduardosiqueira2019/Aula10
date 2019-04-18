package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //cursos
        Curso android = new Curso("Mobile Android");
        Curso fullStack = new Curso("Web Full Stack");
        //alunos
        Aluno james = new Aluno( 1,"James","Bond",android);
        Aluno jameson = new Aluno( 10,"James","Bond",android);
        Aluno jessica = new Aluno(2,"Jessica","Jones",fullStack);
        Aluno andy = new Aluno(3,"Andy","Panda",android);
        Aluno peny = new Aluno(4,"Peny","Cilina",fullStack);

        //lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        //alunos.add(james);
        alunos.add(jameson);
        alunos.add(jessica);
        alunos.add(andy);
        alunos.add(peny);


        //System.out.println(james.equals(jameson));
        //System.out.println(alunos.contains(james));
        System.out.println(jameson.toString());


    }
}
