package com.example;

import main.java.com.example.entity.Professor;
import main.java.com.example.entity.Aluno;
import main.java.com.example.entity.Turma;
import main.java.com.example.entity.Nota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor ("amelhor", "39973705831", "Luciana", "sp0001234");

        Aluno aluno1 = new Aluno ("1234", "Leticia", "sp3091741", 9.5);
        Aluno aluno2 = new Aluno ("5678", "Isabella", "sp3093658", 9.0);
        Aluno aluno3 = new Aluno ("0910", "Lucas", "sp3081234", 8.5);
        Aluno aluno4 = new Aluno("1313", "Henry", "sp3096547", 8.0);

        Turma turma1 = new Turma (7, "113");
        Turma turma2 = new Turma (10, "213");

        Nota n1 = new Nota (113, 9.0);


        

       

    }
}