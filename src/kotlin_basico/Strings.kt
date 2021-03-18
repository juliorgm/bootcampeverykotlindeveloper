
    fun main(){
        val texto = "Olá mundo!"

        println(texto[0])
        println(texto[texto.length -1])
        println(texto.first())
        println(texto.last())


        println("${texto}, eu sou o Julio")
        println(texto + " " + "testando concatenação")

        // CAIXA ALTA E BAIXA
        println("julio".capitalize())
        println("JULIO".decapitalize())
        println("julio".toUpperCase())
        println("JULIO".toLowerCase())

        // removendo espaços

        println("    teste     ".trim())
        println("    teste     ".trimEnd())
        println("    teste     ".trimStart())

        println("O julio é legal".replace("julio","Julio Gomes"))

        //Para formatar usar a função format

        // Comparação de strings - Empty e blank

        val string1 = ""
        val string2 = "        "

        println(string1.isBlank())
        println(string1.isEmpty())
        println(string1.isNullOrBlank())

        println(string2.isBlank())
        println(string2.isEmpty())
        println(string2.isNullOrBlank())

    }
