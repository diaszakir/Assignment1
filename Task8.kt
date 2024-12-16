package Assignment2
import java.util.Scanner;


fun main() {
    val sc = Scanner(System.`in`);
    println("******Calculator******");
    do {
        println("Type operation: +, -, *, / \nFor exit type 0")
        var ch: Char? = sc.next()[0];
        if (ch == '0'){
            break;
        }
        println("Write a: ")
        var a = sc.nextInt();
        println("Write b: ")
        var b = sc.nextInt();
        when (ch) {
            '+' -> println(a + b);
            '-' -> println(a - b);
            '*' -> println(a * b);
            '/' -> println(a / b);
            else -> println("Write +, -, *, / or 0 to exit");
        }
    } while (true)
}