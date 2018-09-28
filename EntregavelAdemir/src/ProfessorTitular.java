public class ProfessorTitular extends Professor {

    private String especialidades;


    public ProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidades) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setCodProfessor(codigoProfessor);
        this.especialidades = especialidades;
    }


    public String getEspecialidades(){
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
}
