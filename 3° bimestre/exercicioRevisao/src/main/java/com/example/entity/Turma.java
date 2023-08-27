package main.java.com.example.entity;

import java.util.List;

@Entity
@Table (name = "turma")

public class Turma {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;
    private Professor professor;
    @Column
    private int horario;
    @Column
    private String codigo;

    private List<Aluno> alunos;

    
    public Turma(Professor professor, int horario, String codigo) {
        this.professor = professor;
        this.horario = horario;
        this.codigo = codigo;
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
