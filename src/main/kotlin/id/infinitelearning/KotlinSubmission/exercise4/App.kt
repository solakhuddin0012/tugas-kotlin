package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun divideNumbers(a: Int, b: Int): Int {
        var result = 0

        try {
            result = a / b
        } catch (e: ArithmeticException) {
            println("Terjadi error: ${e.message}")
        }

        return result
    }

    fun main() {
        val num1 = 10
        val num2 = 0

        val divisionResult = divideNumbers(num1, num2)
        println("Hasil pembagian: $divisionResult")
    }



}