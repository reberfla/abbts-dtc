import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    val aDie = Random

    val playerScore = aDie.nextInt(1..6)
    val computerScore = aDie.nextInt(1..6)
    print("Please enter your player name:")
    val username: String = readln()
    var userinput = "j"
    var userTotalScore = 0
    var computerTotalScore = 0

    while (userinput == "j") {
        println("$username würfelt: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> {println("$username gewinnt"); userTotalScore++}
            playerScore < computerScore -> {println("Der Computer gewinnt"); computerTotalScore++}
            else -> println("Unentschieden")
        }
        print("Möchten Sie noch einmal spielen? (j/n)")
        userinput = readln()
    }
    println("Endstand: $username: $userTotalScore  --  Computer: $computerTotalScore")
    println("Spiel beendet")

}
