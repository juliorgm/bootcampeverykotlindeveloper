public fun main(){
    println("julio ricardo gomes mota".randomCapilizedLetter())
}

fun String.randomCapilizedLetter() = this[(0..this.length-1).random()].toUpperCase();

