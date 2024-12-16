package Assignment2

fun main() {
    var age: Int = 19;
    var height: Double = 185.4;
    var isStudent: Boolean = true;
    val name: String = "Dias";

    if (age > 18 && isStudent){
        println("You are an adult student.");
    } else if (age < 18 && isStudent) {
        println("You are a student, but not adult.");
    } else if (age > 18 && !isStudent) {
        println("You are an adult, but not student");
    } else if (age < 18 || !isStudent) {
        println("You are not an adult");
    } else {
        println("Invalid data");
    }
}