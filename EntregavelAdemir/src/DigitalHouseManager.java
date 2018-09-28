import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAluno = new ArrayList<>();
    private List<Curso> listaDeCurso = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();


    public Curso buscarCursoPorCodigo(int codigoCurso) {
        for (Curso curso : listaDeCurso) {
            if (curso.equals(codigoCurso)) {

                return curso;

            }
        }
        return null;


    }

    public Aluno buscarAlunoPorCodigo(int codigoaluno) {

        for (Aluno aluno : listaDeAluno) {

            if (aluno.equals(codigoaluno)) {

                return aluno;
            }
        }
        return null;
    }


    public ProfessorAdj buscarProfAdjPorCod(int codigoProfessor) {
        for (Professor professor : listaDeProfessores) {
            if (professor.getCodProfessor() == codigoProfessor) {
                return (ProfessorAdj) professor;
            }

        }
        return null;
    }

    public ProfessorTitular buscarProfTitularPorCod(int codigoProfessor) {
        for (Professor professor : listaDeProfessores) {
            if (professor.getCodProfessor() == codigoProfessor) {
                return (ProfessorTitular) professor;
            }
        }
        return null;
    }


    public void registrarUmCurso(String nome, int codigoCurso, int capacidadeMaxima) {
        Curso curso = new Curso(nome, codigoCurso, capacidadeMaxima);
        listaDeCurso.add(curso);
        System.out.println("o curso registrado é "+curso.getNomeCurso()+" com o codigo "+curso.getCodigoCurso());
    }

    public void excluirCurso(int codigoCurso) {
        listaDeCurso.remove(codigoCurso);


    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdj professorAdj = new ProfessorAdj(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        listaDeProfessores.add(professorAdj);

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidades) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidades);
        listaDeProfessores.add(professorTitular);
        System.out.println();


    }


    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAluno.add(aluno);

        System.out.println("O Aluno " + aluno.getNome()+" "+ aluno.getSobrenome()+" com o código "+aluno.getCodigoAluno()+" cadastrado com sucesso");

    }


    public void matricularnoCurso(int codigoAluno, int codigoCurso) {
        Aluno aluno = buscarAlunoPorCodigo(codigoAluno);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Matricula matricula = new Matricula(aluno, curso);
        listaDeMatricula.add(matricula);
        curso.adicionarumAluno(aluno);

        System.out.println("O Aluno "+aluno.getNome()+" está  Matriculado no curso de "+curso.getNomeCurso());


    }

    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {
        ProfessorTitular professorTitular = buscarProfTitularPorCod(codigoProfessorTitular);
        ProfessorAdj professorAdjunto = buscarProfAdjPorCod(codigoProfessorAdjunto);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        listaDeProfessores.add(professorTitular);
        listaDeProfessores.add(professorAdjunto);

        curso.setProfessorAdj(professorAdjunto);
        System.out.println("O Professor "+professorAdjunto.getNome()+" "+professorAdjunto.getSobrenome()+" tem "+professorAdjunto.getHorasdeMentoria()+" horas de mentoria");

        curso.setProfessorTitular(professorTitular);
        System.out.println("O Professor titular do curso é o "+professorTitular.getNome()+" "+professorTitular.getSobrenome()+" e é especialista em " +professorTitular.getEspecialidades());
    }


}
