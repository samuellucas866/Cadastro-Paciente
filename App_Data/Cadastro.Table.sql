CREATE TABLE [dbo].[Table]
(
	[IdPaciente] INT NOT NULL PRIMARY KEY, 
    [NomePaciente] VARCHAR(100) NOT NULL, 
    [DataNascimento] INT NOT NULL, 
    [Sexo] VARCHAR(50) NOT NULL, 
    [CPF] BIT NOT NULL, 
    [Telefone] VARCHAR(50) NOT NULL, 
    [Email] VARCHAR(50) NOT NULL
)
