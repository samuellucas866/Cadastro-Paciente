using System;
using System.Security.Cryptography.X509Certificates;
using System.Web.Services.Description;
using System.Web.UI.WebControls;




    public class CadPaciente
    {
        

        static void Main()
        {
            String NomePaciente;
            String IdPaciente;
            String DataNascimento;
            String Sexo;
            String CPF = Console.ReadLine();
            String auxCPF;
            String Digito;
            int soma;
            int resto;
            String Telefone;
            String Email = Console.ReadLine();

            bool validacao = Email.Contains("@") && Email.Contains(".com") && Email.Contains(".com.br");
            
            int[] multiplicador1 = new int[9] { 10, 9, 8, 7, 6, 5, 4, 3, 2 }; // primeiro vetor para 1° multiplicação
            int[] multiplicador2 = new int[10] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 }; // segundo vetor para 2° multiplicação
            
                        
                                        

            //**Validação de CPF**

            CPF = Console.ReadLine();
            CPF = CPF.Replace(".", " ").Replace("-", " "); // ** remove todos os pontos e traços, substituindo por nada no lugar.**

            auxCPF = CPF.Substring(0, 9); //** aux do CPF pega todos os 9 primeiros digitos do valor digitado **
            soma = 0; 

            for (int i = 0; i < 9; i++){

             //** método que vai multiplicando e somando ao mesmo tempo para economizar linha com vetor multiplicador1.**
                soma += int.Parse(auxCPF[i].ToString()) * multiplicador1[i];

             }
               resto = soma % 11;

            if (resto < 2)
            {
                resto = 0; //** se menor que 2 vai valer 0.**
            }

            else
            {
                resto = 11 - resto; //** se não é 11 menos o resto.**
            }

            Digito = resto.ToString(); //** Guarda o primeiro Digito. **
            auxCPF = auxCPF + Digito; //** passa para o aux do CPF.**

            soma = 0;

            // ** conta 10 devido ter um digito a mais agora.**
            for (int i = 0; i < 10; i++)
            {
                //** vai multiplicando e somando ao mesmo tempo pelo vetor multiplicador 2. Segunda tabela**
                soma += int.Parse(auxCPF[i].ToString()) * multiplicador2[i];

            }

            resto = soma % 11; //** pega o resto da divisão.

            if(resto < 2)
            {
                resto = 0;
            }
            else
            {
                resto = 11 - resto;
            }

            auxCPF = auxCPF + resto; //** passa o último digito restante para comparar. **

            if (CPF == auxCPF) //** se o cpf digitado no campo for igual ao que for processado aqui é porque é válido.**
            {
                Console.WriteLine("O CPF é válido!!");

            }
            else
            {
                Console.WriteLine("O CPF é Invalido!!");
            }


            Console.Write("Digite Telefone do Paciente: ");
            Telefone = Console.ReadLine();
            Console.WriteLine("Telefone do Paciente: ", Telefone);

            Console.Write("Digite o E-mail do Paciente: ");
            Email = Console.ReadLine();
            Console.WriteLine("E-mail do Paciente: ", Email);

            //** Validação Email

            if (validacao == true)
            {
                Console.WriteLine("O Email digitado é válido!", Email);
            }

            else
            {
                Console.WriteLine("O Email Digitado é Invalido! ", Email);
                Console.WriteLine("Digite um Email válido por favor!", Email);
            }




        }


    }


// **Cadastro de Exame, tipo, Descrição e Identificação.**



public class CadExame
{

    static void Main()
    {

        String NomeExame;
        String TipoExame;
        String DescriExame;
        String Observacao;
        String IdExame;


        Console.Write("Digite o Nome do Exame: ");
        NomeExame = Console.ReadLine();
        Console.WriteLine("Nome do Exame: ", NomeExame);


        Console.Write("Digite o tipo de Exame: ");
        TipoExame = Console.ReadLine();
        Console.WriteLine("Tipo de Exame: ", TipoExame);


        Console.Write("Digite a Descrição do Exame: ");
        DescriExame = Console.ReadLine();
        Console.WriteLine("Descrição do Exame: ", DescriExame);

        Console.Write("Digite a Observação do Exame: ");
        Observacao = Console.ReadLine();
        Console.WriteLine("Observação do Exame: ", Observacao);

        Console.Write("Digite o ID do Exame:");
        IdExame = Console.ReadLine();
        Console.WriteLine("Id do Exame: ", IdExame);

    }

    //** Marcação de Consulta.**


    class Consulta
    {
        static void Main()
        {
            String NovaConsulta = Console.ReadLine();
            String Medico = Console.ReadLine();
            String Horario = Console.ReadLine();
            String Data = Console.ReadLine();





            Boolean validacaoh = Horario.Contains("hrs") && Horario.Contains("hra") && Horario.Contains("hr");

            Boolean validacaod = Data.Contains("/") && Data.Contains("-");



        }
    }
}

    

    
