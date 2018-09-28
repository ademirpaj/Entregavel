import java.util.Objects;

public class Professor {

    private String nome;
    private String sobrenome;
    private int codProfessor;
    private int tempoDeCasa;

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
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

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public boolean equals(int codProfessor) {

        return this.codProfessor == codProfessor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodProfessor());
    }
}
