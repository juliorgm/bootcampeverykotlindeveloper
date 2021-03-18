public fun main(){
    println(getFullName("Julio", "Gomes"))

    //Funções de ordem superior
    val x = calculate(12,4,::sum)
    val y = calculate(12,4){a,b -> a*b}

    println(x)
    println(y)
}

private fun getFullName(name:String, lastName:String):String{
    val fullName = "${name} ${lastName}"

    return "$name $lastName"


}



//Função com inferencia de tipo, para execuções de uma linha
private fun getFullNameTwo(name:String, lastName:String) = "$name $lastName"



fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}