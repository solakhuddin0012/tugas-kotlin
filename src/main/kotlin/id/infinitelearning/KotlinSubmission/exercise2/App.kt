package id.infinitelearning.KotlinSubmission.exercise2

/** Latihan 1 List
Buatlah sebuah variabel bertipe list dengan ketentuan:
- List tersebut menampung bilangan genap dari 1 hingga 100
Optional:
- Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
 */
fun main() {
    // Membuat list kosong untuk menampung bilangan genap
    val listGenap = mutableListOf<Int>()

    // Mengisi list dengan bilangan genap dari 1 hingga 100
    for (i in 1..100) {
        if (i % 2 == 0) {
            listGenap.add(i)
        }
    }

    // Menampilkan isi listGenap
    println(listGenap)
}

/** Latihan 2 Map
Buatlah variabel bertipe Map dengan kriteria:
Daftar nama bulan dalam setahun,
- Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
- key "Jan", value January
- key "Feb", value February
- dst...
Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
- Jan -> January
- Feb -> February
- Dst...

Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
- "It's {$monthNow} now, I was born in {$birthMonth}"
 */
fun main() {
    val bulan: Map<String, String> = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    bulan.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "June"
    val birthMonth = "October"

    println("It's $monthNow now, I was born in $birthMonth")
}
