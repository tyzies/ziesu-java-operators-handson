public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum = 25;
        int secondNum = 25;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " > " + secondNum + " = " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " < " + secondNum + " = " + (firstNum < secondNum));

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " >= " + secondNum + " = " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " <= " + secondNum + " = " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " == " + secondNum + " = " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println(firstNum + " != " + secondNum + " = " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        System.out.println("Harga lebih murah: " + (price1 < price2 ? price1 : price2));

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        double perbedaan = price2 - price1;
        System.out.println("Selisih harga: " + perbedaan);
        System.out.println("Apakah selisih < 1.0? " + (perbedaan < 1.0));

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        double sama = 0.1 + 0.2;
        double banding = 0.3;
        System.out.println("0.1 + 0.2 = " + sama);
        System.out.println("Apakah 0.1 + 0.2 == 0.3? " + (sama == banding));

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A';
        char letter2 = 'B';

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("'" + letter1 + "' < '" + letter2 + "'? " + (letter1 < letter2));
            // Masuk akal karena kode ASCII A (65) lebih kecil dari kode ASCII B (66)

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        char lowerCaseLetter = 'a';
        System.out.println("'" + lowerCaseLetter + "' > '" + letter1 + "'? " + (lowerCaseLetter > letter1));

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char digit1 = '5';
        char digit2 = 'x';

        System.out.println("'" + digit1 + "' adalah digit? " + (digit1 >= '0' && digit1 <= '9'));
        System.out.println("'" + digit2 + "' adalah digit? " + (digit2 >= '0' && digit2 <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("\"" + name1 + "\" == \"" + name2 + "\"? " + (name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("\"" + name1 + "\" == new String(\"Java\") ? " + (name1 == name3));
            // false karena name3 adalah objek baru di heap (reference berbeda)

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("\"" + name1 + "\".equals(name3)? " + name1.equals(name3));

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        String nameLower = "java";
        System.out.println("\"" + name1 + "\".equals(\"" + nameLower + "\")? " + name1.equals(nameLower));
            // false karena berbeda huruf besar/kecil

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("\"" + name1 + "\".equalsIgnoreCase(\"" + nameLower + "\")? " + name1.equalsIgnoreCase(nameLower));
            // true karena mengabaikan perbedaan case

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;

        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        System.out.println("Status Kelulusan Siswa: " + (grade > passingGrade ? "Lulus" : "Tidak Lulus"));

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        System.out.println("Status Honor Roll Siswa: " + (grade > honorRoll ? "Honor Roll" : "Tidak Honor Roll"));

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("Umur: " + age);
        System.out.println("Layak mengemudi? (minimum: " + drivingAge + ") " + (age > drivingAge));
        System.out.println("Layak voting? (minimum: " + votingAge + ") " + (age > votingAge));
        System.out.println("Layak minum? (minimum: " + drinkingAge + ") " + (age > drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior

        // - Gabungkan kondisi untuk menentukan kelayakan akhir

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        System.out.println("Score (1 - 100)? " + (score >= 0 && score <= 100));

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        score = 0;
        System.out.println("Score = 0 [Valid?]: " + (score >= 0 && score <= 100));
        score = 100;
        System.out.println("Score = 100 [Valid?]: " + (score >= 0 && score <= 100));
        score = -1;
        System.out.println("Score = -1 [Valid?]: " + (score >= 0 && score <= 100));
        score = 101;
        System.out.println("Score = 101 [Valid?]: " + (score >= 0 && score <= 100));

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int suhu = 30;
        System.out.println("Suhu (-10 -> 40)? " + (suhu >= -10 && suhu <= 40));

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175;
        int minHeight = 160;
        int maxHeight = 200;

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        System.out.println("Tinggi (" + minHeight + " - " + maxHeight + ")? " + (height >= minHeight && height <= maxHeight));

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        score = 96;
        System.out.println("Score: " + score + " = " + (score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F")))));
        score = 85;
        System.out.println("Score: " + score + " = " + (score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F")))));
        score = 69;
        System.out.println("Score: " + score + " = " + (score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F")))));
        score = 40;
        System.out.println("Score: " + score + " = " + (score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F")))));
    }
}