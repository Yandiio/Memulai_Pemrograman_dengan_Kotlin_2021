fun main() {
//    println("Factorial 3 is: ${factorial(3)}")
//    var numberOfFibonacci = 0..4;
//
//    for (i in numberOfFibonacci) {
//        if (i == numberOfFibonacci.last){
//            print("$i => ${fibonacci(i)} ")
//        }else {
//            print("$i => ${fibonacci(i)}, ")
//        }
//    }
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

fun fibonacci(n: Int) : Int {
    return if (n <= 0) {
         0
    } else if (n == 1 || n == 2){
         1
    } else {
//        print("${n - 1}ha - ${n - 2}")
        fibonacci(n - 1) + fibonacci(n - 2)
    }


}