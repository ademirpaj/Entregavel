import java.util.Objects;

public class Aluno {


    private String  nome;
    private  String sobrenome;
    private int codigoAluno;

    public Aluno(String nome, String sobrenome, int codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public boolean equals(int codigoAluno) {

        return this.codigoAluno == codigoAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }


}
