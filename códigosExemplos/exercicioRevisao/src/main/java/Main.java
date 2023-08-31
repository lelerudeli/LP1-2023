import entity.Professor;
import entity.Aluno;
import entity.Turma;
import entity.Nota;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor ("bio", "39973705831", "Luciana", "sp0001234");

        Aluno aluno1 = new Aluno ("1234", "Leticia", "sp3091741", 0.0);
        Aluno aluno2 = new Aluno ("5678", "Isabella", "sp3093658", 0.0);
        Aluno aluno3 = new Aluno ("0910", "Lucas", "sp3081234", 0.0);
        Aluno aluno4 = new Aluno("1313", "Henry", "sp3096547", 0.0);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        
        Turma turma = new Turma (professor1, 10, "213", alunos);
        
        Nota n1 = new Nota (9.5, turma);
        Nota n2 = new Nota (10.0, turma);
        Nota n3 = new Nota (8.0, turma);
        Nota n4 = new Nota (5.5, turma);

        System.out.println(turma);


        Session session = HibernateUtil.getSessionFactory().openSession(); // criando sessão, pegando sessão, abrindo sessão

        Transaction transaction = session.beginTransaction(); // transação = varias acoes que eu posso realizar, abrindo uma ação

        session.persist(turma); //salvando turma1 no bdd || principal conexao
       
        transaction.commit();

        List<Turma> turmas = session.createQuery("from turma", Turma.class).list();
        for (Turma t: turmas) {
            System.out.println(t);
        }

        //turmasList.forEach(t -> System.out.println(t));

        aluno1.add(n1);
        aluno2.add(n2);
        aluno3.add(n3);
        aluno3.add(n4);

        System.out.println(turmas.get(0));


    }
}