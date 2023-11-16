import Cadastros.Cadastro;
import Cadastros.Consulta;
import Cadastros.Exame;
import Cadastros.Paciente;

public class Main {

    public static void main(String[] args) {


            Paciente paciente1 = new Paciente("Lucas","333.444.222-66",567385,"R$ 350","31/10/2025");
            Consulta consulta1 = new Consulta("Demerval", 549365,"12/12/2023");
            Exame exame1 = new Exame("Roberta",656943, "11/01/2024");


        System.out.println(paciente1);
        System.out.println(consulta1);
        System.out.println(exame1);


        }
    }