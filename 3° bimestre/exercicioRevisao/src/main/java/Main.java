
import entity.Professor;
import entity.Aluno;
import entity.Turma;
import entity.Nota;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor ("bio", "39973705831", "Luciana", "sp0001234");
        Professor professor2 = new Professor ("java", "321654987011", "Igor", "sp0012345");

        Aluno aluno1 = new Aluno ("1234", "Leticia", "sp3091741", 9.5, n1);
        Aluno aluno2 = new Aluno ("5678", "Isabella", "sp3093658", 9.0, n2);
        Aluno aluno3 = new Aluno ("0910", "Lucas", "sp3081234", 8.5, n3);
        Aluno aluno4 = new Aluno("1313", "Henry", "sp3096547", 8.0, n4);

        Turma turma1 = new Turma (professor1, 10, "001", aluno1);
        Turma turma2 = new Turma (professor2, 7, "002", aluno2);

        Nota n1 = new Nota (9.5, turma1);
        Nota n2 = new Nota (10.0, turma2);
        Nota n3 = new Nota (8.0, turma1);
        Nota n4 = new Nota (5.5, turma2);

        


        aluno1.add(n1);

        retornarMedia();


        Session session = HibernateUtil.getSessionFactory().openSession(); // criando sessão, pegando sessão, abrindo sessão

        Transaction transaction = session.beginTransaction(); // transação = varias acoes que eu posso realizar, abrindo uma ação

        session.persist(turma1); //salvando turma1 no bdd || principal conexao
        session.persist(turma2);

        transaction.commit();


    }
}