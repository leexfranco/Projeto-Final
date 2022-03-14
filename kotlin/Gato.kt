class Gato(
    nome: String,
    idade: Int,
    peso: String,
    sexo: String,
    private val raca: String
) :
    Animal(nome, idade, peso, sexo) {

    val listaGato = mutableListOf<String>(
        "V3: previne rinotraqueíte, calicivirose e panleucopenia",
        "V4: previne as doenças contempladas pela V3 mais a Clamidiose",
        "V5: previne as doenças contempladas pela V4 mais a Leucemia viral felina"
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
                listaGato.forEach {
                    println(it)
                }


            } else if (idade in 4..12) {
                println("\n$nome deve tomar:\n")
                listaGato.add(
                    "Antirrábica: essa vacina é obrigatória no território nacional. " +
                            "A vacina contra a raiva protege seu pet de uma infecção viral grave " +
                            "e sem tratamento para gatos."
                )

                listaGato.forEach {
                    println(it)
                }


            } else {
                println("\nSe o seu bichinho ainda não se vacinou, ele está com déficit de vacinação, será necessário:\n")
                listaGato.add(
                    "Antirrábica: essa vacina é obrigatória no território nacional. " +
                            "A vacina contra a raiva protege seu pet de uma infecção viral grave " +
                            "e sem tratamento para gatos."
                )

                listaGato.forEach {
                    println(it)
                }
            }
        } else {
            println("\nSe o seu bichinho ainda não se vacinou, ele está com déficit de vacinação, será necessário:\n")
            listaGato.add(
                "Antirrábica: essa vacina é obrigatória no território nacional. " +
                        "A vacina contra a raiva protege seu pet de uma infecção viral grave " +
                        "e sem tratamento para gatos."
            )

            listaGato.forEach {
                println(it)
            }
        }
    }

    /*
    //transforma os valores da classe em String
    override fun toString(): String {
        return "\nNome - $nome" +
                "\nIdade - $idade" +
                "\nPeso - $peso kg"
    }
     */

}