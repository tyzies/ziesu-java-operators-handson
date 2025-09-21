import java.sql.SQLOutput;

public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        // - Buat variabel boolean: isLoggedIn = true, hasPermission = false
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)
        System.out.println("User bisa akses admin panel? " + (isLoggedIn && hasPermission == true));

        // - Test keempat kombinasi operator AND:
        // true && true, true && false, false && true, false && false
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));

        // Latihan 2: Berlatih operator OR (||)
        // - Buat variabel boolean: isWeekend = false, isHoliday = true
        boolean isWeekend = false;
        boolean isHoliday = true;

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)
        System.out.println("Apakah hari libur? " + (isWeekend == true || isHoliday == true));

        // - Test keempat kombinasi operator OR:
        // true || true, true || false, false || true, false || false
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        // Latihan 3: Berlatih operator NOT (!)
        // - Buat variabel boolean: isRaining = true
        boolean isRaining = true;

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'
        boolean isSunny = !isRaining;

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya
        System.out.println("(!(!isRaining)): " + (!(!isRaining)));

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya
        System.out.println("!(5 > 3): " + (!(5 > 3)));
            // Hasil dari 5 > 3 adalah true, namun karena ada NOT, maka menjadi false.

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        // - Buat variabel untuk evaluasi siswa
        // attendanceGood = true, gradesHigh = false, behaviorGood = true
        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood
        boolean outstanding = attendanceGood && gradesHigh &&  behaviorGood;

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)
        boolean memuaskan = attendanceGood && (gradesHigh || behaviorGood);

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood
        boolean perbaikan = !attendanceGood || !behaviorGood;

        System.out.println("Outstanding? " + outstanding);
        System.out.println("Memuaskan? " + memuaskan);
        System.out.println("Perlu perbaikan? " + perbaikan);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        // - Buat variabel untuk sistem keamanan
        // hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime
        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)
        boolean daruratAccess = isEmergency || (hasKeyCard && isAuthorizedTime);

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)
        boolean deniedAccess = !(normalAccess || daruratAccess);

        System.out.println("Akses normal? " +  normalAccess);
        System.out.println("Akses darurat? " + daruratAccess);
        System.out.println("Akses ditolak? " + deniedAccess);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        // isRaining = false, isSnowing = true, temperature = -5, isCloudy = true

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        // - Buat variabel: a = 5, b = 0
        int a = 5;
        int b = 0;

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortAND = (b != 0) && (a / b > 2);

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortOR = (b == 0) || (a / b > 2);

        System.out.println("ShortAND = " + shortAND);
        System.out.println("ShortOR = " + shortOR);

        // - Jelaskan dalam komentar mengapa ekspresi ini aman
        /* Jawaban:
        *  - shortAND
        *    (b != 0) bernilai false karena pakai &&, bagian kanan tidak dicek
        *    sehingga tidak terjadi pembagian dengan nol.
        *  - shortOR
        *    (b == 0) bernilai true karena pakai ||, bagian kanan tidak dicek
        *    sehingga juga tidak terjadi pembagian dengan nol.
        */

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        // - Buat variabel untuk simulasi operasi mahal
        // expensiveCheck1 = false, expensiveCheck2 = true
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        // - Simulasikan AND short-circuit: expensiveCheck1 && expensiveCheck2
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        boolean shortAND2 = expensiveCheck1 && expensiveCheck2;
            /* Karena expensiveCheck1 == false, Java tidak akan mengevaluasi operand kanan.
            *  Jadi "expensiveCheck2" tidak dipanggil.
            */

        // - Simulasikan OR short-circuit: expensiveCheck2 || expensiveCheck1
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        boolean shortOR2 = expensiveCheck2 || expensiveCheck1;
            /* Karena expensiveCheck2 == true, Java tidak akan mengevaluasi operand kanan.
            *  Jadi "expensiveCheck1" tidak dipanggil.
            */

        System.out.println("ShortAND2 = " + shortAND2);
        System.out.println("ShortOR2 = " + shortOR2);
    }
}