class Cachorro(
    nome: String,
    idade: Int,
    peso: String,
    sexo: String,
    private val raca: String
) :
    Animal(nome, idade, peso, sexo) {

    val listaCachorro = mutableListOf<String>(
        "V8: previnem: cinomose, parvovirose, hepatite infecciosa canina," +
                " adenovirose tipo II, parainfluenza, coronavirose, leptospirose.",
        "V10: contempla proteção contra mais dois tipos de cepas causadoras da leptospirose",
        "Gripe: é opcional, mas é recomendada para cachorros que convivem com outros cães," +
                " que frequentam petshops, hospedagens, parques e praças",
        "Giárdia: é opcional e recomendada se o cachorro convive com outros pets, passeia" +
                " ou se vive em um local com saneamento básico precário. "
    )

    fun age() {
        while (true) {
            try {
                print("Digite a idade em anos (em caso de menos de 1 ano, digite 0): ")
                idade = readLine()!!.toInt()
                break

            } catch (e: Exception) {
                println("Valor inválido.")
            }
        }
    }

    override fun obrig() {
        if (idade < 1) {
            //println("Vacinação obrigatória: ")
            print("Como $nome tem menos de 1 ano, digite a idade em meses: ")

            while (true) {
                try {
                    idade = readLine()!!.toInt()
                    break

                } catch (e: Exception) {
                    println("Valor inválido.")

                }
            }
            if (idade in 2..3) {
                println("\n$nome pode tomar a primeira dose das vacinas:\n")
                listaCachorro.forEach {
                    println(it)
                }


            } else if (idade in 4..12) {
                println("\n$nome deve tomar:\n")
                listaCachorro.add(
                    "Antirrábica: obrigatória no território nacional," +
                            " protege seu pet de uma infecção viral grave e sem tratamento para cachorros."
                )

                listaCachorro.forEach {
                    println(it)
                }


            } else {
                println("\nSe o seu bichinho ainda não se vacinou, ele está com déficit de vacinação, será necessário:\n")
                listaCachorro.add(
                    "Antirrábica: obrigatória no território nacional," +
                            " protege seu pet de uma infecção viral grave e sem tratamento para cachorros."
                )

                listaCachorro.forEach {
                    println(it)
                }
            }
        } else {
            println("\nSe o seu bichinho ainda não se vacinou, ele está com déficit de vacinação, será necessário:\n")
            listaCachorro.add(
                "Antirrábica: obrigatória no território nacional," +
                        " protege seu pet de uma infecção viral grave e sem tratamento para cachorros."
            )

            listaCachorro.forEach {
                println(it)
            }
        }
    }

}