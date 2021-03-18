fun main(){
    val idade = (1..100).random() ?: 0

    println("Idade: $idade")
    verificaEleitor(idade)

}

fun verificaEleitor(idade:Int){
    if (idade < 16) println("Você não pode votar")
    else if(idade >= 16 && idade < 18) println("Voto facultativo")
    else if(idade >= 18 && idade <= 60) println("voto obrigatório")
}