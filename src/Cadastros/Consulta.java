package Cadastros;
import java.util.Date;


public class Consulta extends Cadastro {


        protected Date dataConsulta;



        // CONSTRUTOR PARA AGENDAR CONSULTA


        public  Consulta (String nomePaciente, int idPaciente, Date dataConsulta){

            this.nomePaciente = nomePaciente;
            this.idPaciente = idPaciente;
            this.dataConsulta = dataConsulta;



        }

    public Consulta(String demerval, int idPaciente, String s) {
        super();
    }


    // MÉTODO PARA AGENDAR UMA NOVA CONSULTA


        public void agendarConsulta(String nomePaciente, int idPaciente, Date dataConsulta){

            this.nomePaciente = nomePaciente;
            this.idPaciente = idPaciente;
            this.dataConsulta = dataConsulta;

            System.out.println("Consulta agendada para " + dataConsulta + " para o paciente " + nomePaciente + "Código para identificação paciente: " + idPaciente);


        }




        //MÉTODOS GETTERS E SETTERS PARA MODIFICAR ATRIBUTOS
    @Override
    public String getNomePaciente() {
        return super.getNomePaciente();
    }

    @Override
    public void setNomePaciente(String nomePaciente) {
        super.setNomePaciente(nomePaciente);
    }

    @Override
    public int getIdPaciente() {
        return super.getIdPaciente();
    }

    @Override
    public void setIdPaciente(int idPaciente) {
        super.setIdPaciente(idPaciente);
    }


    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void exibirConsulta() {
        System.out.println("Consulta agendada para " + dataConsulta + " para o paciente " + nomePaciente);
    }



}
