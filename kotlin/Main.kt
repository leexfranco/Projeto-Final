fun main() {
    println("Cartela de vacinação obrigatória\n")
    print("Olá! O seu pet é um gato ou um cachorro?\nR: ")
    val animalEscolhido = readLine()!!.lowercase()
    println("Ok! O seu pet é um $animalEscolhido")

    print("\nPor favor, digite o nome do seu pet: ")
    val nome = readLine()!!

    /*
    print("Digite a idade: ")
    var idade = readLine()!!.toInt()
     */

    print("Digite o peso: ")
    val peso = readLine()!!

    print("Certo, qual o sexo do animal? ")
    val sexo = readLine()!!

    print("Okay! Estamos quase terminando. Digite a raça: ")
    val raca = readLine()!!

    if (animalEscolhido == "gato") {
        val cat = Gato(nome, 0, peso, sexo, raca)

        cat.age()

        cat.obrig()


    } else if (animalEscolhido == "cachorro" || animalEscolhido == "cão") {
        val dog = Cachorro(nome, 0, peso, sexo, raca)

        dog.age()

        dog.obrig()
    }

}