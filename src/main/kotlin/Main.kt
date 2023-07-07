import kotlin.random.Random

fun main() {
 val passwordLength = 8
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"
    val password = (1..passwordLength)
        .map { chars[Random.nextInt(0,chars.length)] }
        .joinToString("")

    println("Senha gerada: $password")
}