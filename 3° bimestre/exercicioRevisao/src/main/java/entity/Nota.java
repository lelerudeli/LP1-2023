package entity;

import jakarta.persistence.*;
//import static java.lang.Math;

@Entity
@Table (name = "boletim")

public class Nota {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;

    @Column
    private Double nota;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "notas da turma")
    private Turma turma;

    public Nota(Double nota, Turma turma) {
        this.nota = nota;
        this.turma = turma;
    }

    public Nota(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Turma getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    public Double getNota() {
        return nota;
    }


    public void setNota(Double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Nota [id=" + id + ", nota=" + nota + "]";
    }    
    
    
}
