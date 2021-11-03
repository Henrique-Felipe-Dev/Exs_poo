class Pessoa private constructor(val nome: String,
                                 var idade: Int,
                                 altura: Double) {

    companion object{
        fun create(nome: String, idade: Int, altura: Double): Pessoa{
            return Pessoa(nome, idade, altura)
        }
    }


}