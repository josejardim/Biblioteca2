# Biblioteca2
 
 **Classe usuário**
 A classe usuário  cria uma lista de 25 usuários com informações de nome, CPF e matrícula geradas automaticamente.
 
  A classe Usuario possui três campos (ou atributos): nome, cpf e matricula, que são informações associadas a um usuário. Essa classe também possui um construtor para criar objetos do tipo Usuario com os valores para esses campos e três métodos getter para obter essas informações.
 Além disso, a classe Usuario tem um método estático chamado gerarUsuariosPadrao. Esse método é responsável por gerar uma lista de 25 objetos do tipo Usuario com informações padrão, como nome, CPF e matrícula. Vamos entender a sequência lógica desse método:

1- public static List<Usuario> gerarUsuariosPadrao(): Este é o método estático que retorna uma lista de objetos Usuario.

2- List<Usuario> usuarios = new ArrayList<>();: Aqui, uma nova lista chamada usuarios é criada para armazenar os objetos Usuario gerados.

3-for (int i = 1; i <= 25; i++) {: O loop for é usado para gerar 25 objetos Usuario.

4-String nome = "Usuário " + i;: Para cada iteração do loop, um nome é criado com base no valor de i. Os nomes serão "Usuário 1", "Usuário 2", ..., "Usuário 25".

5-String cpf = "CPF" + i;: Da mesma forma, um número de CPF é criado com base no valor de i. Os CPFs serão "CPF1", "CPF2", ..., "CPF25".

6-int matricula = 1000 + i;: A matrícula é gerada com base em i, começando em 1001 e indo até 1025.

7-Usuario usuario = new Usuario(nome, cpf, matricula);: Um novo objeto Usuario é criado com as informações geradas para nome, CPF e matrícula.

8-usuarios.add(usuario);: O objeto Usuario recém-criado é adicionado à lista usuarios.

9-Após o loop ser executado 25 vezes, a lista usuarios conterá 25 objetos Usuario, cada um com valores únicos de nome, CPF e matrícula.

10-return usuarios;: A lista de objetos Usuario é retornada pelo método gerarUsuariosPadrao.






**classe Main**

A classe Main cria uma biblioteca, adiciona livros e usuários a ela, empresta alguns livros a usuários específicos e, por fim, lista e exibe os livros emprestados. 
 
1-classe Main  executa operações envolvendo objetos de classe Biblioteca, Livro, e Usuario:

2-public class Main {: Começa a definição da classe Main.

3-public static void main(String[] args) {: Começa o método main, que é o ponto de entrada do programa.

4-Biblioteca biblioteca = new Biblioteca();: É criada uma instância da classe Biblioteca chamada biblioteca. Isso representa a biblioteca onde os livros são armazenados e emprestados.

5-Três objetos Livro são criados: livro1, livro2, e livro3, com informações diferentes, como título, autor e ISBN.

6-biblioteca.adicionar_livro(livro1);: Cada um dos objetos Livro é adicionado à biblioteca usando o método adicionar_livro da instância biblioteca.

7-Dois objetos Usuario são criados: usuario1 e usuario2, com informações de nome, CPF e matrícula.

8-biblioteca.adicionar_usuario(usuario1); e biblioteca.adicionar_usuario(usuario2);: Cada um dos objetos Usuario é adicionado à biblioteca usando o método adicionar_usuario da instância biblioteca.
biblioteca.emprestar_livro("ISBN1", 1001); e biblioteca.emprestar_livro("ISBN2", 1002);: Dois livros são emprestados a dois usuários. Isso é feito usando o método emprestar_livro da instância biblioteca, passando o ISBN do livro que se deseja emprestar e a matrícula do usuário que está pegando o livro emprestado.

9-System.out.println("Livros emprestados:");: Uma mensagem é impressa na tela para indicar que a lista de livros emprestados será exibida.

10-for (Livro livro : biblioteca.listar_livros_emprestados()) {: Um loop for-each é usado para percorrer a lista de livros emprestados obtida pelo método listar_livros_emprestados da instância biblioteca.

11-System.out.println(livro.exibir_info());: Para cada livro emprestado, as informações do livro são impressas na tela usando o método exibir_info da classe Livro.



**classe Livro**

 A classe Livro representa um livro com informações como título, autor, ISBN e um status de empréstimo. Ela fornece métodos para acessar informações do livro, exibir detalhes, verificar se está emprestado, emprestar o livro e devolvê-lo, além de um método para gerar livros com informações aleatórias.

1-public class Livro {: Começa a definição da classe Livro.

2-Os campos (ou atributos) da classe Livro são declarados:

titulo: Representa o título do livro.

autor: Representa o autor do livro.

isbn: Representa o número ISBN do livro, que é uma identificação única para livros.

emprestado: Uma variável booleana que controla se o livro está emprestado ou não.

3-public Livro(String titulo, String autor, String isbn) {: Este é o construtor da classe Livro. Quando um objeto Livro é criado, esse construtor é chamado para definir os valores iniciais para os campos titulo, autor, isbn e emprestado.

4-public String getTitulo() { return titulo; }: Este é um método getter que permite obter o título do livro.

5-public String getAutor() { return autor; }: Este é um método getter que permite obter o autor do livro.

6-public String getISBN() { return isbn; }: Este é um método getter que permite obter o número ISBN do livro.

7-public String exibir_info() { return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn; }: Este método retorna uma string que contém informações sobre o livro, incluindo o título, autor e número ISBN.

8-public boolean estaEmprestado() { return emprestado; }: Este método verifica se o livro está emprestado (o valor de emprestado é true) e retorna true, caso contrário, retorna false.

9-public void emprestar() { emprestado = true; }: Este método é usado para marcar o livro como emprestado, definindo o valor de emprestado como true.

10-public void devolver() { emprestado = false; }: Este método é usado para marcar o livro como devolvido, definindo o valor de emprestado como false.

11-public static Livro gerarLivroAleatorio() {: Este é um método estático que gera um livro aleatório com um título, autor e número ISBN gerados aleatoriamente. Os valores gerados são baseados em números aleatórios entre 0 e 999.

12-No método gerarLivroAleatorio, são criadas strings aleatórias para o título, autor e ISBN do livro, e em seguida, um novo objeto Livro é criado com essas informações aleatórias e retornado.



**classe GeradorUsuarios**

  A GeradorUsuarios Cria uma lista de 25 usuários fictícios com nomes, CPFs e matrículas geradas automaticamente e, em seguida, imprime os detalhes desses usuários no console.

1-public class GeradorUsuarios {: Começa a definição da classe GeradorUsuarios.

2-public static List<Usuario> gerarUsuarios() {: Este é um método estático que gera uma lista de objetos do tipo Usuario.

3-List<Usuario> usuarios = new ArrayList<>();: Uma lista vazia chamada usuarios é criada para armazenar os objetos Usuario gerados.

4-for (int i = 1; i <= 25; i++) {: Um loop for é usado para gerar 25 objetos Usuario.

5-String nome = "Usuário " + i;: Para cada iteração do loop, um nome é criado com base no valor de i. Os nomes serão "Usuário 1", "Usuário 2", ..., "Usuário 25".

6-String cpf = "CPF" + i;: Da mesma forma, um número de CPF é criado com base no valor de i. Os CPFs serão "CPF1", "CPF2", ..., "CPF25".

7-int matricula = 1000 + i;: A matrícula é gerada com base em i, começando em 1001 e indo até 1025.

8-Usuario usuario = new Usuario(nome, cpf, matricula);: Um novo objeto Usuario é criado com as informações geradas para nome, CPF e matrícula.

9-usuarios.add(usuario);: O objeto Usuario recém-criado é adicionado à lista usuarios.

10-Após o loop ser executado 25 vezes, a lista usuarios conterá 25 objetos Usuario, cada um com valores únicos de nome, CPF e matrícula.

11-return usuarios;: A lista de objetos Usuario é retornada pelo método gerarUsuarios.

12-public static void main(String[] args) {: Começa o método main, que é o ponto de entrada do programa.

13-List<Usuario> usuarios = gerarUsuarios();: É chamado o método gerarUsuarios() para obter a lista de usuários gerados e armazená-la na variável usuarios.

14-Um loop for-each é usado para iterar pela lista de usuários.

15-No loop, os detalhes de cada usuário, como nome, CPF e matrícula, são impressos na tela usando System.out.println().

16-Após imprimir os detalhes de um usuário, uma linha em branco é inserida para separar as informações do próximo usuário.


 **Classe GeradorAleatorio**

 A classe GeradorAleatorio,tem métodos para gerar listas aleatórias de livros, usuários e conectar esses livros aleatoriamente a usuários simulando empréstimos. 

1-public class GeradorAleatorio {: Começa a definição da classe GeradorAleatorio.

2-public static List<Livro> gerarLivros(int quantidadeLivros) {: Este é um método estático que gera uma lista de objetos do tipo Livro. Ele aceita um parâmetro, quantidadeLivros, que determina quantos livros serão gerados.

3-public static List<Usuario> gerarUsuarios(int quantidadeUsuarios) {: Este é um método estático que gera uma lista de objetos do tipo Usuario. Ele aceita um parâmetro, quantidadeUsuarios, que determina quantos usuários serão gerados.

4-Em ambos os métodos gerarLivros e gerarUsuarios, é criada uma lista vazia para armazenar os objetos a serem gerados. Em seguida, um loop for é usado para gerar os objetos, com títulos, autores, ISBNs, nomes, CPFs e matrículas fictícias, com base na quantidade especificada.

5-Os objetos gerados são adicionados às listas e, por fim, as listas são retornadas.

6-public static void conectarLivrosAosUsuarios(List<Livro> livros, List<Usuario> usuarios) {: Este é um método que conecta aleatoriamente livros a usuários simulando empréstimos.

7- criada uma instância de Random para gerar números aleatórios.

8-Um loop for-each é usado para percorrer a lista de livros. Para cada livro, um usuário é escolhido aleatoriamente a partir da lista de usuários usando a classe Random. Isso simula o empréstimo de livros, embora a simulação seja exibida no console com uma mensagem de empréstimo.

9-public static void main(String[] args) {: Começa o método main, que é o ponto de entrada do programa.

10-List<Livro> livros = gerarLivros(50);: São gerados 50 objetos Livro chamando o método gerarLivros e armazenados em uma lista.

11-List<Usuario> usuarios = gerarUsuarios(25);: São gerados 25 objetos Usuario chamando o método gerarUsuarios e armazenados em outra lista.

12-conectarLivrosAosUsuarios(livros, usuarios);: O método conectarLivrosAosUsuarios é chamado para conectar aleatoriamente os livros aos usuários e simular empréstimos.

