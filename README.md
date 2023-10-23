# Desafio Alura - Buscador de CEP
Projeto final do curso ["Java: consumindo API, gravando arquivos e lidando com erros"](https://cursos.alura.com.br/course/java-consumindo-api-gravando-arquivos-lidando-erros), da Alura.

## 💻 O desafio
Implementar uma aplicação para consultar um endereço a partir de um CEP e salvar as informações em um arquivo JSON.

### 📝 Requisitos
- Criar uma classe que represente um endereço (cep, uf, cidade, bairro, logradouro e complemento);
- Criar uma classe que consulte a API [ViaCEP](https://viacep.com.br) para buscar um endereço a partir de um cep;
- Criar uma classe que crie um arquivo JSON contendo os dados de um objeto Endereco;
- Criar uma classe com método main que deve solicitar ao usuário que informe um CEP e, na sequência, utilizar as classes para consultar a api ViaCEP e salvar os dados do endereço em um arquivo json.
 
 ## 📚 Tecnologias Utilizadas e Conceitos Aprendidos
- Para o desenvolvimento do projeto, foi utilizada a linguagem **Java**
- A API utilizada para consulta foi a [viaCEP](https://viacep.com.br)
- Para desserializar o JSON e, posteriormente, criar o arquivo JSON com os dados buscados, foi utilizada a biblioteca **GSON**

- Neste projeto, foram trabalhados os seguintes conceitos:
  - Integração de APIs
  - Requisições HTTP
  - Exceptions
  - Criação e manipulação de arquivos
  - Utilização de bibliotecas externas
