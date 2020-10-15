using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace Projeto_Cadastro_Web
{
    public class Banco
    {
        //classe conexão com o banco.

        private static SqlConnection conexao;

        private static SqlConnection ConexaoBanco()
        {
            conexao = new SqlConnection("Data Source = C:\\Users\\Maria Cabral\\Desktop\\Projeto-Cadastro-Web\\App_Data");
            conexao.Open();
            return conexao;



        }
    }
}

        
         
           

        



