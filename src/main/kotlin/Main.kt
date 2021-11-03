fun main(args: Array<String>) {

    /*
    Objetos
    Estados - Nome, idade, cor dos olhos, cor da pele // Atributos
    Comportamentos - Andar, Piscar os olhos, Falar //Métodos

    Todos os objetos que nós instanciarmos vão ter uma identidade
    única

     */

    /* Exemplo utilizando a classe Pessoa
    val maria = Pessoa()

    maria.nome = "Maria"
    maria.idade = 20
    maria.corOlhos = "Castanhos"
    maria.corPele = "Parda"

    val joao = Pessoa()

    joao.nome = "João"
    joao.idade = 18

    println("Olá, meu nome é ${maria.nome}" +
            ", tenho ${maria.idade}, meus olhos são ${maria.corOlhos}" +
            " e minha pele é ${maria.corPele}")
     */

    /*
    Função - Uma função ela pode ser um método
    Métodos - Um método nunca pode ser uma função
     */

    //Exemplo Função
    /*
    fun soma(num1: Int, num2: Int){
        println("$num1 + $num2 = ${num1 + num2}")
    }
     */

    //Exemplo utilizando uma classe que vai simular uma conta de banco
    /*
    val contaCorrente1 = ContaBanco("Henrique",
        3600.00)

    val contaCorrente = ContaBanco("Henrique",
        3600.00,
        1)

    val contaCorrente2 = ContaBanco("Henrique",
        3600.00,
        1,
    3600.00)



    println(contaCorrente.tipo)

    println(contaCorrente.proprietario)

    contaCorrente.saldo()

    contaCorrente.saldo = 2500.00
    contaCorrente.tipo = 2

    println(contaCorrente.tipo)
    println(contaCorrente.proprietario)
    contaCorrente.saldo()
    contaCorrente.saque(200.00)
    contaCorrente.saldo()
    contaCorrente.deposito(1000.00)
    contaCorrente.saldo()

    val contaPoupanca = ContaBanco("Henrique", 2500.00)

    contaPoupanca.saldo = 3200.00
    contaPoupanca.tipo = 2
     */

    val contaCorrente1 = ContaBanco("Henrique",
        2500.00)

    val contaCorrente = ContaBanco("Rogério",
        3600.00,
        1)

    val contaCorrente2 = ContaBanco("Rosnei",
        3800.00,
        2,
        3600.00)

    ListaContas.addContas(contaCorrente1)
    ListaContas.addContas(contaCorrente)
    ListaContas.addContas(contaCorrente2)

    for(item in ListaContas.listaContas){
        println(item)
    }

    val maria = Pessoa.create("Maria", 18, 1.75)

    /*
    Repassando os conceitos:

    Classes - Estrutura de dados que vai armazenar os atributos e os métodos
    de um objeto que será criado a partir dele
    Por exemplo, molde de um bombom

    Objetos - Instâncias derivadas de uma classe (ou seja, representações de uma classe)
    Cada objeto vai ter os seus próprios valores de atributos
    Cada objeto é único, por mais que os valores dos atributos sejam iguais:
    Ex:
    val pessoa1 = Pessoa("Henrique")
    val pessoa2 = Pessoa("Henrique")
    Objetos eles são divididos entre atributos (estados) e os métodos (comportamentos)
    Atributos - Variáveis que a gente cria dentro da classe (ex: nome, idade, etc)
    Métodos - Funções que declaramos dentro da classe (saque, deposito, saldo)

    Quando falamos de atributos eles podem ser obrigatórios na criação do objeto ou
    não. Caso não seja obrigatório, todos os atributos deverão ter valores padrões
    Se for obrigatório, obrigatoriamente a classe precisará de um construtor

    Construtores - Vão servir para instanciarmos o objeto com as informações que
    ele precisa
    Os construtores não se limitam em apenas 1, ou seja, uma classe pode ter
    infinitos construtores, para dar a opção para instanciarmos o objeto de
    várias maneiras diferentes

    Objeto Anômimo (objetc) - É um objeto que só pode ser instânciado uma vez e
    ele não é derivado de uma classe

    companion object - Serve para gerar métodos estáticos (ou seja, que podem ser
    chamados sem necessariamente instanciar a classe) e um dos seus propósitos
    é a criação de um objeto usando um construtor privado
     */


}

object ListaContas{
    val listaContas = mutableListOf<ContaBanco>()

    fun addContas(contas: ContaBanco){
        listaContas.add(contas)
    }

}

