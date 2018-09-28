import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

private String nomeCurso;
private int codigoCurso;
private ProfessorTitular professorTitular;
private ProfessorAdj professorAdj;
private List<Aluno> listaAlunoMatriculados = new ArrayList<>();
private int capacidadeMaxima;



    public Curso(String nomeCurso, int codigoCurso, int capacidadeMaxima) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.capacidadeMaxima = capacidadeMaxima;
    }




    public void excluirAluno(Aluno umAluno){

        listaAlunoMatriculados.remove(umAluno);


    }

    public boolean adicionarumAluno(Aluno umaluno){

        listaAlunoMatriculados.add(umaluno);

        return true;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdj getProfessorAdj() {
        return professorAdj;
    }

    public void setProfessorAdj(ProfessorAdj professorAdj) {
        this.professorAdj = professorAdj;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean equals(int codigoCurso) {

        return this.codigoCurso == codigoCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }




}
