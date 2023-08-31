package entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table (name = "turma")

public class Turma {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professorId")
    private Professor professor;
    @Column
    private int horario;
    @Column
    private String codigo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "aluno-turma", joinColumns = @JoinColumn(name = "turma_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Aluno> alunos;

    
    public Turma (Professor professor, int horario, String codigo, List<Aluno>alunos) {
        this.professor = professor;
        this.horario = horario;
        this.codigo = codigo;
        this.alunos = alunos; 
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Professor getProfessor() {
        return professor;
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public int getHorario() {
        return horario;
    }


    public void setHorario(int horario) {
        this.horario = horario;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return "Turma [id=" + id + ", professor=" + professor + ", horario=" + horario + ", codigo=" + codigo
                + ", alunos=" + alunos + "]";
    } 

    

    
}
