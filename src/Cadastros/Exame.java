package Cadastros;

import java.util.Date;


public class Exame extends Cadastro {

    protected Date dataExame;

    protected Consulta consultaExame;

    protected String tipoExame;



    //CONSTRUTOR PARA AGENDAR EXAME

    public Exame(String nomePaciente, int idPaciente, Date dataExame){

        this.nomePaciente = nomePaciente;
        this.idPaciente = idPaciente;
        this.dataExame = dataExame;

    }

    public Exame(String roberta, int idPaciente, String s) {
        super();
    }

    // MÉTODO PARA AGENDAR EXAME DE ACORDO COM A CONSULTA


    public void agendarExame(Consulta consulta, String tipoExame, Date dataExame ){

        if(consulta != null){
            this.consultaExame = consultaExame;
            this.dataExame = dataExame;
            this.tipoExame = tipoExame;

            System.out.println("Exame agendado para " + dataExame + " do tipo " + tipoExame +
                    " para o paciente " + consulta.getNomePaciente() +
                    " - Associado à consulta de " + consulta.getDataConsulta());
        } else {
            System.out.println("Erro: É necessário associar o exame a uma consulta existente.");
        }

        }



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











}
