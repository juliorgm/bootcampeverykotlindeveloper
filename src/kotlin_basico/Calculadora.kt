var calcOn = true
var currentOperation = 0
var currentResult = 0
var number1 = 0
var number2 = 0

const val sum = 1
const val subtraction = 2
const val multiplication = 3
const val division = 4

fun main(){
    loopCaculator()
}

fun loopCaculator() {
    while(calcOn){
        Runtime.getRuntime().exec("clear")
        printMenu()
        getInputOperation()

        if (currentOperation==0) break;

        getInputNumbers()
        doCalculate()
        println(currentResult)
        restartValues()
    }
}

fun restartValues() {
    currentOperation = 0
    currentResult = 0
    number1 = 0
    number2 = 0
}

fun doCalculate() {
    when(currentOperation){
        sum -> currentResult = number1+number2
        subtraction -> currentResult = number1 - number2
        multiplication -> currentResult = number1 * number2
        division -> doDivision()
    }
}

fun doDivision() {
    if (number2==0) {
        println("Não é possível realizar divisão por zero")
        return
    }

    currentResult = number1 / number2
}

fun getInputNumbers() {
    println("Informe número 1")
    number1 = readLine()?.toInt() ?: 0

    println("Informe número 2")
    number2 = readLine()?.toInt() ?: 0
}

fun getInputOperation() {
    currentOperation = readLine()!!.toInt()
}

fun printMenu() {
    println("=======================")
    println("Escolha a operação deseja")
    println("1 - Para adição")
    println("2 - Para subtração")
    println("3 - Para multiplicação")
    println("4 - Para divisão")
    println("0 - Para sair")
    println("=======================")
}
