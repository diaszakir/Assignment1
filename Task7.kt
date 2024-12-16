package Assignment2
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`);
    var count: Int = 0;
    do {
        var n: Int = sc.nextInt();
        println("Number is $n");
        count++;
    } while (n != 0)

    println("Number of attempts: $count");
}