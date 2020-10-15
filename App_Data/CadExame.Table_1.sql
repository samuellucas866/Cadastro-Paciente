CREATE TABLE [dbo].[Table]
(
	[IdExame] INT NOT NULL PRIMARY KEY, 
    [TipoExame] VARCHAR(100) NOT NULL, 
    [DescriExame] VARCHAR(256) NOT NULL, 
    [NomeExame] VARCHAR(100) NOT NULL, 
    [Observacoes] VARCHAR(1000) NOT NULL 
)
