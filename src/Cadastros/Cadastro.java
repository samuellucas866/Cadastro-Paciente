package Cadastros;

public class Cadastro {

    protected String nomePaciente;

    protected String cpf;

    protected int idPaciente;

    protected String endereco;

    protected String cep;

    private int valorPlano;

    protected int validadePlano;

    protected boolean valorPago;


    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(int valorPlano) {
        this.valorPlano = valorPlano;
    }

    public boolean isValorPago() {
        return valorPago;
    }

    public int getValidadePlano() {
            return validadePlano;
    }

    public void setValidadePlano(int validadePlano) {
        this.validadePlano = validadePlano;
    }
}
