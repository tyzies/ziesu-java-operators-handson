public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10, b = 5, c = 2;

        // - Hitung hasil dari: a + b * c
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        System.out.println("a + b * c = " + (a + b * c));
            // Prediksi: 20, Hasil aktual: 20

        // - Hitung hasil dari: (a + b) * c
        // - Bandingkan dengan hasil sebelumnya
        System.out.println("(a + b) * c = " + ((a + b) * c));
            // Karena yang di dalam kurung dihitung dulu baru dikalikan.

        // - Hitung hasil dari: a * b + c / 2
        // - Jelaskan urutan operasi dalam komentar
        System.out.println("a * b + c / 2 = " + (a * b + c / 2));
            // Dikali dulu, lalu dibagi, baru ditambahkan.
            // (10 * 5) + (2 / 2) = 50 + 1 = 51

        // - Hitung hasil dari: a / b + c * 2
        // - Tunjukkan evaluasi step-by-step dalam komentar
        System.out.println("a / b + c * 2 = " + (a / b + c * 2));
            // Dibagi dulu, dikali, baru ditambahkan.
            // (10 / 5) + (2 * 2) = 2 + 4 = 6.

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15, y = 10, z = 20;

        // - Evaluasi: x + y > z - 5
        // - Uraikan urutan evaluasi dalam komentar
        boolean result1 = x + y > z - 5;
        System.out.println("x + y > z - 5 = " + result1);
            /* (x + y) -> 15 + 10 = 25
            *  (z - 5) -> 20 - 5 = 15
            *  (25 > 15) -> true.
            */

        // - Evaluasi: x > y + z / 4
        // - Jelaskan operasi mana yang terjadi lebih dulu
        boolean result2 = x > y + z / 4;
        System.out.println("x > y + z / 4 = " + result2);
            /* (z / 4) -> 20 / 4 = 5
            *  (y + (z / 4)) -> 10 + 5 = 15
            *  (x > 15) -> 15 > 15 -> false.
            */

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        boolean result3 = (x + y) > (z - 5) && x < z;
        System.out.println("(x + y) > (z - 5) && x < z = " + result3);
            /* Karena ada tanda kurung:
            *  (x + y) -> 25
            *  (z - 5) -> 15
            *  (25 > 15) -> true
            *  (x < z) -> (15 < 20) -> true
            *  (true && true) -> true.
            */

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // - Prediksi hasilnya, lalu verifikasi
        boolean result4 = x * 2 + y > z && y < x + 5;
            /* Prediksi:
            *  perkalian dulu: (x * 2) -> (15 * 2) = 30
            *  penjumlahan: (30 + y) -> 30 + 10 = 40
            *  perbandingan: (40 > z) -> (40 > 20) -> true
            *  kanan: (x + 5) -> (15 + 5) = 20 -> (y < 20) -> (10 < 20) -> true
            *  gabungan: true && true -> true.
            */
        System.out.println("x * 2 + y > z && y < x + 5 = " + result4);

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true, q = false, r = true;

        // - Evaluasi: p && q || r
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        boolean res1 = p && q || r;
        System.out.println("p && q || r = " + res1);
            /* && dihitung dulu, lalu hasilnya digabung dengan ||
            *  (p && q) -> (true && false) = false
            *  (false || r) -> (false || true) = true
            */

        // - Evaluasi: p || q && r
        // - Bandingkan dengan hasil sebelumnya
        boolean res2 = p || q && r;
        System.out.println("p || q && r = " + res2);
            /* && dihitung dulu (q && r), lalu p || hasil
            *  (q && r) -> (false && true) = false
            *  (p || false) -> (true || false) = true
            */

        // - Evaluasi: !p && q || r
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        boolean res3 = !p && q || r;
        System.out.println("!p && q || r = " + res3);
            /* ! (NOT) punya precedence tertinggi, jadi !p dihitung dulu
            *  !p -> !true = false
            *  (false && q) -> false && false = false
            *  (false || r) -> (false || true) = true
            */

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        // - Bandingkan dengan p && q || r
        boolean res4 = p && (q || r);
        System.out.println("p && q || r = " + res1);
        System.out.println("p && (q || r) = " + res4);
            /* Dengan memakai kurung, (q || r) dihitung dulu
            *  (q || r) -> (false || true) = true
            *  (p && true) -> (true && true) = true
            */

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25, num2 = 15, num3 = 30;

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        // - Uraikan urutan evaluasi lengkap
        boolean r1 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("num1 > num2 + 5 && num3 / 2 = " + r1);
            /* (num2 + 5) -> 15 + 5 = 20
            *  (num3 / 2) -> 30 / 2 = 15
            *  (num1 > 20) -> 25 > 20 = true
            *  (15 < 25) = true
            *  true && true = true
            */

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // - Tunjukkan evaluasi step-by-step
        boolean r2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 = " + r2);
            /* (num1 + num2) -> 25 + 15 = 40 -> 40 > 30 = true
            *  (num3 - num1) -> 30 - 25 = 5 -> 5 < 10 = true
            *  num2 > 10 -> 15 > 10 = true
            *  (5 < 10) && (15 > 10) -> true && true = true
            *  true || true = true
            */

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // - Bandingkan hasil dan jelaskan perbedaannya
        boolean r3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 = " + r3);
            /* (num1 + num2) -> 40 -> 40 > 30 = true
            *  (num3 - num1) -> 5 -> 5 < 10 = true
            *  true || true = true
            *  num2 > 10 = true
            *  true && true = true
            */

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value = 8;

        // - Evaluasi: ++value * 2
        // - Jelaskan operasi mana yang terjadi lebih dulu
        int rr1 = ++value * 2;
        System.out.println("++value * 2 = " + rr1);
            // ++value dihitung dulu (value = 9) lalu dikalikan 2 -> 9 * 2 = 18

        // - Reset value ke 8, lalu evaluasi: value++ * 2
        // - Bandingkan dengan hasil sebelumnya
        value = 8;
        int rr2 = value++ * 2;
        System.out.println("value++ * 2 = " + rr2);
            // value++ tetap mengembalikan nilai lama (value = 8) jadi 8 * 2 = 16,
            // lalu value baru menjadi 9 setelah operasi.

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        // - Amati urutan evaluasi
        value = 8;
        int rr3 = 2 * ++value;
        System.out.println("2 * ++value = " + rr3);
            // ++value dieksekusi dulu (value = 9), lalu 2 * 9 = 18.

        // - Reset value ke 8, lalu evaluasi: -value + 10
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        value = 8;
        int rr4 = -value + 10;
        System.out.println("-value + 10 = " + rr4);
            // unary minus diaplikasikan dulu (value = -8), lalu -8 + 10 = 2.

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        int a2 = 5, b2 = 10;

        // - Evaluasi dan jelaskan: a += b * 2
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        System.out.println("a += b * 2 = " + (a2 += 2 * 2));
            // b * 2 dihitung dulu, lalu hasilnya ditambah ke a.

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        // - Jelaskan urutan evaluasi
        System.out.println("a *= b + 3 = " + (a2 *= b2 + 3));
            // b + 3 dihitung dulu, lalu a dikalikan dengan hasil.

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        System.out.println("a = b > 5 ? b * 2 : b / 2 = " + (a2 = b2 > 5 ? b2 * 2 : b2 / 2));
            // (b > 5) dihitung dulu.
            // Jika true -> hasil = b * 2; jika false -> hasil = b / 2. Lalu hasil di-assign ke a.

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        int a3 = 8, b3 = 4, c3 = 2, d3 = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        // - Tunjukkan langkah kalkulasi untuk keduanya
        System.out.println("a + b * c - d = " + (a3 + b3 * c3 - d3));
            /* b * c = 4 * 2 = 8
            *  a + (b * c) = 8 + 8 = 16
            *  16 - d = 16 - 6 = 10
            */
        System.out.println("(a + b) * (c - d) = " + ((a3 + b3) * (c3 - d3)));
            /* (a + b) = 8 + 4 = 12
            *  (c - d) = 2 - 6 = -4
            *  12 * -4 = -48
            */

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        // - Jelaskan bagaimana tanda kurung mengubah logika
        System.out.println("a > b && c < d || a == b = " + (a3 > b3 && c3 < d3 || a3 == b3));
            /* (a > b && c < d) dihitung dulu
            *  true && true = true
            *  (true || a == b) -> true || false = true
            */
        System.out.println("a > b && (c < d || a == b) = " + (a3 > b3 && (c3 < d3 || a3 == b3)));
            /* (c < d || a == b) dihitung dulu
            *  true || false = true
            *  (a > b && true) -> true && true = true
            */

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // - Tunjukkan evaluasi step-by-step
        boolean nested = ((a3 + b3) * c3) / (d3 - 2) > (a3 - b3);
        System.out.println("((a + b) * c) / (d - 2) > (a - b) = " + nested);
            /* (a + b) = 12
            *  (a + b) * c = 12 * 2 = 24
            *  (d - 2) = 6 - 2 = 4
            *  24 / 4  = 6
            *  (a - b) = 8 - 4 = 4
            *  6 > 4 = true
            */
    }
}