/*
Data Class - É uma classe específica para o armazenamento e a manipulação de dados
 */

data class ContaBanco (val proprietario: String, var saldo: Double){

    var tipo = 0
    var investimentos = 0.0

    constructor(proprietario: String, saldo: Double, tipo: Int):
            this(proprietario, saldo){
                this.tipo = tipo
            }

    constructor(proprietario: String,
                saldo: Double,
                tipo: Int,
                investimentos: Double):
            this(proprietario, saldo, tipo){
                this.investimentos = investimentos
            }

    /*
    var proprietario = ""
        get() = field.uppercase()
    var saldo = 0.0
    var tipo = 1 //Tipo 1 - Conta corrente; Tipo 2 - Conta Poupança
        set(valor) = if (valor <= 0 || valor > 2){
            println("Tipo de conta inválida! Conta definida automaticamente" +
                    " para o tipo 1")
            field = 1
        }else{
            field = valor
        }
     */

    /*

    Comportamentos:

    Saque
    Saldo
    Deposito

     */

    //Método checar o saldo
    fun saldo(){
        println("O saldo da conta é R$$saldo")
    }

    //Método Saque
    fun saque(valor: Double){
        if(valor <= 0){
            println("O valor de R$$valor é impossível de ser sacado")
        }else{
            println("Você realmente quer sacar da sua conta R$$valor?")
            println("1 para sim e 2 para não")
            println("Opção: ")

            val opcao = readLine()!!.toInt()

            when(opcao){
                1 -> {
                    saldo -= valor
                    println("Saque de R$$valor foi realizado com sucesso")
                }
                2 -> println("Operação foi cancelada!!")
                else -> println("Opção inválida!")
            }
        }
    }

    //Método de Depósito
    fun deposito(valor: Double){

        if(valor <= 0){
            println("O valor de R$$valor é impossível de ser depositado")
        }else{
            println("Você realmente quer depositar R$$valor na sua conta?")
            println("1 para sim e 2 para não")
            println("Opção: ")

            val opcao = readLine()!!.toInt()

            when(opcao){
                1 -> {
                    saldo += valor
                    println("Deposito de R$$valor foi realizado com sucesso")
                }
                2 -> println("Operação foi cancelada!!")
                else -> println("Opção inválida!")
            }
        }

    }
}