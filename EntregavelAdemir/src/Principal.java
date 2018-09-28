import java.util.List;

public class Principal {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();



        digitalHouseManager.matricularAluno("Ademir", "Aasumpcao", 200123);
        digitalHouseManager.matricularAluno("Thiago", "Goncalves", 200124);
        digitalHouseManager.matricularAluno("João", "da Silva", 200125);
        digitalHouseManager.matricularAluno("Lucas", "Silva e Silva", 200126);


        digitalHouseManager.registrarProfessorTitular("Fabio", "Tadashi Myasato", 120, "Mobile");
        digitalHouseManager.registrarProfessorAdjunto("Gui", "Top", 130, 200);
        digitalHouseManager.registrarProfessorTitular("Romario","da Silva", 100, "Full Stsck");
        digitalHouseManager.registrarProfessorAdjunto("Victor", "Torres", 140,200);
        System.out.println("------------------------------");
        digitalHouseManager.registrarUmCurso("Mobile", 20001, 40);
        digitalHouseManager.alocarProfessores(20001, 120, 130);
        digitalHouseManager.registrarUmCurso("Full Stack", 30001, 30);
        digitalHouseManager.alocarProfessores(30001, 100, 140);
        System.out.println("------------------------------");
        digitalHouseManager.matricularnoCurso(200123,20001);
        digitalHouseManager.matricularnoCurso(200124,20001);
        digitalHouseManager.matricularnoCurso(200125,30001);
        digitalHouseManager.matricularnoCurso(200126,30001);


    }
}
