public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter = 5;

        // - Gunakan pre-increment (++counter) dan print hasilnya
        ++counter;
        System.out.println("Pre-increment: " + counter);

        // - Gunakan post-increment (counter++) dan print hasilnya
        counter++;
        System.out.println("Post-increment: " + counter);

        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter = 5;
        --counter;
        System.out.println("Pre-decrement: " + counter);

        // - Gunakan post-decrement (counter--) dan print hasilnya
        counter--;
        System.out.println("Post-decrement: " + counter);

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10;
        int b = 10;

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya
        int result1 = ++a;
        System.out.println("a = " + a + "; result1 = " + result1);

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya
        int result2 = b++;
        System.out.println("b = " + b + "; result2 = " + result2);

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya
        /* Jawaban:
        *  Pre-increment (++a):
        *   - a naik dulu (dari 10 jadi 11), baru nilainya ditampilkan.
        *  Post-increment (b++):
        *   - Nilai b ditampilkan dulu (10), baru setelah itu dinaikkan.
        */

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x = 8;
        int y = 8;

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("--x = " + --x + "; x = " + x);

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("y-- = " + y-- + "; y = " + y);

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus
        /* Jawaban:
        *  Kasus 1
        *   - Decrement terjadi karena nilai x dikurangi dulu sebelum variabelnya ditampilkan.
        *  Kasus 2
        *   - Decrement hanya terjadi pada saat y dipakai kedua kali, karena nilai y ditampilkan dulu baru dikurangi.
        */

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive = 42;

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -42;

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backToPositive = -negative;

        // - Print ketiga variabel tersebut
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int plusPositive = +positive;
        int plusNegative = +negative;

        System.out.println("plusPositive: " + plusPositive); // tetap 42
        System.out.println("plusNegative: " + plusNegative); // tetap -42

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true
        boolean isReady = true;

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady
        boolean isNotReady = !isReady;

        // - Print kedua variabel
        System.out.println("isReady = " + isReady);
        System.out.println("isNotReady = " + isNotReady);

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
        // Gunakan angka apapun dan print hasilnya
        boolean notZero = 1 != 0;
        System.out.println("notZero = " + notZero);

        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya
        boolean isReady2 = !!isReady;
        System.out.println("isReady2 = " + isReady2);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0
        int attempts = 0;

        // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
        // Print "Attempt: " + attempts setelah setiap increment
        for (int i = 0; i < 3; i++) {
            attempts++;
            System.out.println("Attempt: " + attempts);
        }

        // - Buat variabel 'lives' dimulai dari 3
        int lives = 3;

        // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
        // Print "Lives remaining: " + lives setelah setiap decrement
        for (int i = 0; i < 3; i++) {
            lives--;
            System.out.println("Lives remaining: " + lives);
        }

        // Latihan 7: Loop counters dengan increment/decrement
        // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
        // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
        // Print loop counter setiap iterasi
        int i = 1;
        while (i <= 5) {
            System.out.println("Counter [i]: " + i);
            i++;
        }

        // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
        // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
        // Print "Countdown: " + countdown setiap iterasi
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5
        int value = 5;

        // - Hitung dan simpan hasil dari: value++ + ++value
        // Print kedua hasil dan nilai akhir dari 'value'
        System.out.println("Value (value++ + ++value): " + (value++ + ++value));

        // - Reset value ke 5, lalu hitung: --value + value--
        // Print kedua hasil dan nilai akhir dari 'value'
        value = 5;
        System.out.println("Value (--value + value--): " + (--value + value--));

        // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda
        // Prediksi: 13 & 8
        // Hasil asli: 12 & 8

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        // - Buat variabel 'score' dengan nilai 10
        int score = 10;

        // - Print hasil dari Math.max(++score, 12)
        // Kemudian print nilai score saat ini
        System.out.println(Math.max(++score, 12));
        System.out.println("Score: " + score);

        // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
        // Kemudian print nilai score saat ini
        score = 10;
        System.out.println(Math.max(score++, 12));
        System.out.println("Score: " + score);

        // - Komentari perbedaan perilaku yang Anda amati
        // Perbedaan utama:
        // - Pre-increment (++x / --x): nilai diubah dulu, baru dipakai.
        // - Post-increment (x++ / x--): nilai lama dipakai dulu, baru diubah.
        // - Contoh: result1 = ++a → langsung dapat nilai baru;
        //           result2 = b++ → pakai nilai lama, lalu b bertambah.
        // - Pada ekspresi gabungan (value++ + ++value), hasil tergantung urutan evaluasi kiri → kanan.

    }
}
