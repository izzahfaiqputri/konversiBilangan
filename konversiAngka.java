package TUGAS;

import java.util.Scanner;

public class konversiAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("ANDA INGIN MENGKONVERSI APA?");
        System.out.println("1. Konversi biner ke desimal");
        System.out.println("2. Konversi desimal ke biner");
        System.out.println("3. Konversi biner ke hexadesimal");
        System.out.println("4. Konversi hexadesimal ke biner");
        System.out.println("5. Konversi desimal ke hexadesimal");
        System.out.println("6. Konversi hexadesimal ke desimal");
        System.out.print("PILIH : ");

        int pilihan = input.nextInt();

        switch (pilihan){
            case 1 :
                System.out.println("1. Konversi biner ke desimal");
                System.out.print("Masukkan bilangan biner: ");
                String binary = input.next();

                int decimal = 0;
                int base = 1;

                for (int i = binary.length() - 1; i >= 0; i--) {
                    if (binary.charAt(i) == '1') {
                        decimal += base;
                    }
                    base *= 2;
                }

                System.out.println("Hasil konversi ke desimal: " + decimal);
                break;

            case 2 :
                System.out.println("2. Konversi desimal ke biner");
                int i;
                int[] array = new int[32];

                System.out.print("Input angka desimal: ");
                int n = input.nextInt();

                for(i = 0 ; n > 0 ; i++){
                    array [i] = n%2;
                    n = n/2;
                }
                System.out.print("Angka binernya adalah: ");

                for(i=i-1 ;i>=0 ;i--) {
                    System.out.print(array [i]);
                }
                System.out.println();
                break;

            case 3 :
                System.out.println("3. Konversi biner ke hexadesimal");
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hex = input.next();

                String binerr = "";

                for (int j = 0; j < hex.length(); j++) {
                    char digit = hex.charAt(j);
                    int decimalValue;

                    if (digit >= '0' && digit <= '9') {
                        decimalValue = digit - '0';
                    } else if (digit >= 'A' && digit <= 'F') {
                        decimalValue = 10 + digit - 'A';
                    } else {
                        System.out.println("Input tidak valid. Heksadesimal hanya boleh mengandung digit 0-9 dan huruf A-F.");
                        return;
                    }


                    String binaryDigit = Integer.toBinaryString(decimalValue);
                    if (j == 0 && binaryDigit.length() < 4) {
                        int leadingZeros = 4 - binaryDigit.length();
                        for (int k = 0; k < leadingZeros; k++) {
                            binerr += '0';
                        }
                    }
                    binerr += binaryDigit;
                }

                System.out.println("Hasil konversi ke biner: " + binerr);
                break;

            case 4 :
                System.out.println("4. Konversi hexadesimal ke biner");
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexxx = input.next();
                hex = hexxx.toUpperCase();

                String binrr = "";

                for (int m = 0; m < hexxx.length(); m++) {
                    char hexDigit = hex.charAt(m);
                    int digitValue;

                    if (hexDigit >= '0' && hexDigit <= '9') {
                        digitValue = hexDigit - '0';
                    } else if (hexDigit >= 'A' && hexDigit <= 'F') {
                        digitValue = 10 + hexDigit - 'A';
                    } else {
                        System.out.println("Input tidak valid. Heksadesimal hanya boleh mengandung digit 0-9 dan huruf A-F.");
                        return;
                    }

                    String binaryDigit = Integer.toBinaryString(digitValue);

                    if (m == 0 && binaryDigit.length() < 4) {
                        int leadingZeros = 4 - binaryDigit.length();
                        for (int j = 0; j < leadingZeros; j++) {
                            binrr += '0';
                        }
                    }

                    binrr += binaryDigit;
                }

                System.out.println("Hasil konversi ke biner: " + binrr);
                break;

            case 5 :
                System.out.println("5. Konversi desimal ke hexadesimal");
                System.out.print("Masukkan bilangan desimal: ");
                int decimaal = input.nextInt();

                StringBuilder hexxa = new StringBuilder();

                while (decimaal > 0) {
                    int remainder = decimaal % 16;
                    char hexDigit;

                    if (remainder < 10) {
                        hexDigit = (char) ('0' + remainder);
                    } else {
                        hexDigit = (char) ('A' + (remainder - 10));
                    }

                    hexxa.insert(0, hexDigit);
                    decimaal /= 16;
                }

                if (hexxa.length() == 0) {
                    hexxa.append('0');
                }

                System.out.println("Hasil konversi ke heksadesimal: " + hexxa.toString());
            break;

            case 6 :
                System.out.println("6. Konversi hexadesimal ke desimal");
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexxxx = input.next();
                hexxxx = hexxxx.toUpperCase();

                int decimallll = 0;
                int basee = 1;

                for (int o = hexxxx.length() - 1; o >= 0; o--) {
                    int hexDigitValue = hexxxx.charAt(o) - (hexxxx.charAt(o) >= 'A' ? 'A' - 10 : '0');
                    decimallll += hexDigitValue * basee;
                    basee *= 16;
                }

                System.out.println("Hasil konversi ke desimal: " + decimallll);
                break;

            default :
                System.out.println("TIDAK ADA DI PILIHAN");
                break;


        }


    }
}
