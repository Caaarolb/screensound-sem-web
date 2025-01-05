# 🎵 ScreenSound 🎵

O **ScreenSound** é um projeto desenvolvido para pesquisar informações sobre artistas musicais e exibir esses dados de maneira simples. Utilizando o **Jsoup** para obter informações sobre os artistas e **PostgreSQL** para armazenar os dados dos artistas e músicas, o projeto oferece uma plataforma integrada e eficiente para gerenciar e consultar essas informações.

## Funcionalidades

- **Busca por artista**: O projeto permite que o usuário pesquise sobre artistas musicais, como **Anahí**, **Shakira**, **Beyoncé**, entre outros.
- **Informações detalhadas**: O sistema retorna informações básicas sobre o artista, como descrições ou trechos de conteúdo relacionados, capturados de fontes confiáveis da web.
- **Cadastro de artistas e músicas**: Permite cadastrar artistas (solo, dupla ou banda) e suas músicas.
- **Pesquisa de músicas por artista**: Permite buscar todas as músicas de um artista específico.
- **Informações sobre o artista**: Realiza a busca de informações detalhadas sobre o artista a partir da internet, utilizando o Jsoup.

## Tecnologias

- **Java**: A linguagem principal utilizada no desenvolvimento.
- **Spring Data JPA**: Para facilitar a integração com o banco de dados e realizar operações de CRUD.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar dados sobre artistas e músicas.
- **Jsoup**: Biblioteca utilizada para realizar scraping e obter dados da web, como informações sobre artistas.
- **Hibernate (JPA)**: Para mapeamento objeto-relacional e integração com o banco de dados.

## Como rodar o projeto

### Pré-requisitos

- JDK 8 ou superior.
- Maven (ou qualquer outro sistema de build de sua preferência).
- Uma IDE (como IntelliJ IDEA, Eclipse ou VSCode) ou terminal para execução.

### Passos para rodar:

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/screensound.git
    ```

2. **Abra o projeto na sua IDE** (ou no terminal).

3. **Instale as dependências** com Maven ou outro gerenciador de dependências:
    ```bash
    mvn install
    ```

4. **Execute a classe principal** (ou o método que inicializa a busca de artistas) diretamente da sua IDE ou via terminal:
    ```bash
    mvn exec:java
    ```

5. **Digite o nome do artista** quando solicitado para pesquisar.

## Como funciona

1. O projeto utiliza o **Jsoup** para buscar a página de pesquisa do Google ou da Wikipedia, dependendo da configuração.
2. A partir da URL, o sistema obtém as informações relevantes sobre o artista, como descrições ou parágrafos importantes.
3. As informações são retornadas e exibidas para o usuário no console.

## Exemplo de uso

1. Ao rodar o programa, ele pedirá para você digitar o nome de um artista:

## Pesquisar por qual artista?

2. Digite, por exemplo: `Anahí`.
3. O programa exibirá uma descrição ou informações relacionadas ao artista:

Informações sobre o artista Anahí: Anahí é uma cantora, atriz e compositora mexicana, conhecida por seu trabalho em novelas e carreira musical...


## Contribuindo

1. Faça o **fork** deste repositório.
2. Crie uma **branch** para sua feature (`git checkout -b feature/nova-feature`).
3. **Commit** suas mudanças (`git commit -am 'Adicionando nova feature'`).
4. **Push** para a branch (`git push origin feature/nova-feature`).
5. Crie um novo **Pull Request**.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


