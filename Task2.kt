package Assignment2

fun main() {
    var age: Int = 19;
    var height: Double = 185.4;
    var isStudent: Boolean = true;
    val name: String = "Dias";

    // if
    if (age < 18) {
        println("You are minor");
    } else if (age > 18 && age < 65) {
        println("You are an adult");
    } else {
        println("You are a senior.");
    }
}