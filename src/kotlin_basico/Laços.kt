fun main(){
   letters()
}

fun letters(){
    val sArray = "Teste de texto"

    for(l in sArray){
        println(l.toUpperCase())
    }
}

fun whileTest(){
    var count = 10
    while (count > 0){
        println("contador $count")
        count--
    }
}