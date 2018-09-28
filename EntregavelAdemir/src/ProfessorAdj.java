public class ProfessorAdj extends Professor {

  private int quantidadeDeHoras;


    public ProfessorAdj(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setCodProfessor(codigoProfessor);
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public int getHorasdeMentoria() {
        return quantidadeDeHoras;
    }

    public void setHorasdeMentoria(int horasdeMentoria) {
        this.quantidadeDeHoras = horasdeMentoria;
    }
}
