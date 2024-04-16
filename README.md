# Consulta de Endereço por CEP

Este é um aplicativo Java simples que permite aos usuários consultar um endereço utilizando um CEP fornecido. Além disso, ele gera um arquivo JSON com as informações do endereço consultado.

## Classes do Projeto

### ConsultaCep.java

Esta classe é responsável por realizar a consulta do endereço correspondente a um CEP utilizando a API do ViaCEP. Ela contém o método `buscaEndereco`, que aceita um CEP como argumento e retorna um objeto do tipo `Endereco` com as informações do endereço correspondente.

### Endereco.java

A classe `Endereco` é um registro (record) que representa as informações de um endereço. Ela contém os seguintes campos:

- `cep`: o CEP do endereço.
- `logradouro`: o logradouro (rua, avenida, etc.) do endereço.
- `complemento`: informações adicionais sobre o endereço, se houver.
- `bairro`: o bairro do endereço.
- `localidade`: a cidade do endereço.
- `uf`: a unidade federativa (estado) do endereço.
- `ibge`: o código IBGE da cidade.
- `gia`: o código GIA (Gerência de Informática de Assistência) da cidade.
- `ddd`: o código DDD da cidade.
- `siafi`: o código SIAFI (Sistema Integrado de Administração Financeira) da cidade.

### GeradorDeArquivo.java

Esta classe é responsável por gerar um arquivo JSON com as informações de um endereço. Ela contém o método `GeraJason`, que aceita um objeto do tipo `Endereco` como argumento e cria um arquivo JSON com as informações desse endereço.

### Main.java

A classe `Main` é a classe principal do aplicativo. Ela contém o método `main`, que inicia a execução do aplicativo. Neste método, é solicitado ao usuário que digite um CEP para consulta, e então a consulta é realizada utilizando a classe `ConsultaCep`. As informações do endereço são exibidas no console e um arquivo JSON é gerado utilizando a classe `GeradorDeArquivo`.

## Como Usar

1. Compile e execute o arquivo `Main.java` para iniciar o aplicativo.

2. Quando solicitado, digite o CEP desejado para consulta e pressione Enter.

3. O aplicativo buscará o endereço correspondente ao CEP utilizando a API do ViaCEP e exibirá as informações no console.

4. Além disso, será gerado um arquivo JSON no diretório do projeto com o nome do CEP consultado, contendo as informações do endereço.

## Observações

- Certifique-se de ter uma conexão de internet ativa durante a execução do aplicativo para que a consulta à API do ViaCEP funcione corretamente.

- Este aplicativo utiliza a biblioteca Gson para fazer o parsing do JSON retornado pela API do ViaCEP e para gerar os arquivos JSON. Certifique-se de incluir a biblioteca Gson no seu projeto.

- Se ocorrer algum erro durante a consulta ou a geração do arquivo JSON, uma mensagem de erro será exibida no console, e a aplicação será finalizada.

