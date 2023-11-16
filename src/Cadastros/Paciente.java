package Cadastros;

import java.time.LocalDate;

public class Paciente extends Cadastro {

    protected double valorPlano;
    protected double valorPago;

    protected LocalDate validadePlano;



    // CONSTRUTOR PARA PACIENTE E VERIFICAÇÃO DA SITUAÇÃO DO PLANO

    public Paciente(String nomePaciente, String cpf, int idPaciente, String valorPlano, LocalDate validadePlano){

        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.idPaciente = idPaciente;
        this.validadePlano = validadePlano;
        this.valorPago = 0.0;  // VALOR INICIAL PAGO É ZERO



    }

    public Paciente(String lucas, String cpf, int idPaciente, String valorPlano, String s) {
        super();
    }

    //********

    // MÉTODO PARA REALIZAÇÃO DE PAGAMENTO DO PLANO

    // ******

    public void realizarPagamento(double valor) {
        if (valor >= this.valorPlano) {
            this.valorPago += valor;
            System.out.println("Pagamento de " + valor + " realizado com sucesso.");
            verificarValidadePlano();
        } else {
            System.out.println("O valor pago não pode ser menor que o valor do plano.");
        }
    }


    // *******

    // MÉTODO DE COBRANÇA ADICIONAL DE 10% DO VALOR DO PLANO POR DIA

    //*******
    private void verificarValidadePlano() {
        if (LocalDate.now().isAfter(this.validadePlano)) {
            double diferencaDias = LocalDate.now().toEpochDay() - this.validadePlano.toEpochDay();
            double valorAdicional = diferencaDias * 0.1 * this.valorPlano;
            this.valorPago += valorAdicional;
            System.out.println("Plano vencido! Cobrança adicional de " + valorAdicional + " aplicada ao valor pago.");
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
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public int getIdPaciente() {
        return super.getIdPaciente();
    }

    @Override
    public void setIdPaciente(int idPaciente) {
        super.setIdPaciente(idPaciente);
    }


    @Override
    public void setValorPlano(int valorPlano) {
        super.setValorPlano(valorPlano);
    }

    @Override
    public boolean isValorPago() {
        return super.isValorPago();
    }

    @Override
    public int getValidadePlano() {
        return super.getValidadePlano();
    }

    @Override
    public void setValidadePlano(int validadePlano) {
        super.setValidadePlano(validadePlano);
    }
}



