package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan: String = "Ahmad"
    val namaBelakang: String = "Solakhuddin"
    var umur: Int = 21
    val single: Boolean = true

    println("Nama depan: $namaDepan")
    println("Nama belakang: $namaBelakang")
    println("Umur Saya: $umur")
    println("Single atau Tidak : $single")


    /**
     *  Latihan 2
     *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
     */

    fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
        println("Group ID: $groupId")
        println("Group Member: $groupMember")
        println("Session: $session")

        return arrayOf(groupId, groupMember, session)
    }

// pemanggilan fungsi groupDetail
    val groupId = 123
    val groupMember = listOf("Ahmad Solakhuddin", "Annysa Syarah", "Devita Kumala")
    val session = "Afternoon"

    groupDetail(groupId, groupMember, session)
    /**
     * Latihan 3
     * Buat variable yang berisi daftar anggota group kamu,
     * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
     *
     */

    fun myGroup(): String {
        val groupMembers = listOf("Fathan hanafi", "Reza karisma", "yudha yuwandha", "Ahmad Solakhuddin")

        val myName = groupMembers[3]

        return myName
    }

// Contoh pemanggilan fungsi myGroup
    val myName = myGroup()
    println("Ahmad Solakhuddin: $myName")

    /**
     * Latihan 4
     * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
     *
     *      total mentor + jumlah anggota group
     *
     */
    fun totalMember(): Int {
        val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
        val countOfGroup = 5

        return mentor.size + countOfGroup
    }

    fun main() {
        myProfile()

        val myGroup = myGroup()
        println("My Group is: $myGroup")

        val totalMember = totalMember()
        println("Total Member group + Mentor: $totalMember")

        /**
         *  Latihan 5
         *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
         *
         */
        groupDetail(
            5,
            listOf(
                "Haikal Al Ghifari",
                "Devita Krisnawati",
                "Angela Febrianti Putri",
                "Annisyah Ariesa Zahra",
                "Ahmad Solakhuddin"
            ),
            "Afternoon"
        )
    }
}
