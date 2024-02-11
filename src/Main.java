import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueExecution = true;

        while (continueExecution) {
            System.out.println("Виберіть завдання (1, 2, 3) або введiть 'pam' для виходу:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Завдання 1");
                    Task.task1();
                    break;
                case "2":
                    System.out.println("Завдання 2");
                    Task.task2();
                    break;
                case "3":
                    System.out.println("Завдання 3");
                    Task.task3();
                    break;
                case "pam":
                    continueExecution = false;
                    break;
                default:
                    System.out.println("Невірний ввід. Спробуйте ще раз.");
            }
        }
    }


    static class Task {
        public static void task3(){

            int a1 = -10314;
            int a2 = -22;
            int a3 = -12345678;

            String b1 = Integer.toBinaryString(a1);
            String b2 = Integer.toBinaryString(a2);
            String b3 = Integer.toBinaryString(a3);

            String paddedBinary1 = String.format("%32s", b1).replace(' ', '0');
            String paddedBinary2 = String.format("%32s", b2).replace(' ', '0');
            String paddedBinary3 = String.format("%32s", b3).replace(' ', '0');

            System.out.println("Десяткове: " + a1 + " Двійкове: " + paddedBinary1);
            System.out.println("Десяткове: " + a2 + " Двійкове: " + paddedBinary2);
            System.out.println("Десяткове: " + a3 + " Двійкове: " + paddedBinary3);
        }

        public static void task1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть число К(десяткове): ");
            int kDec = scanner.nextInt();

            System.out.println("Введіть число L(Шістнадцяткове): ");
            String lHex = scanner.next();

            System.out.println("Введіть число M(Двійкове): ");
            String mBin = scanner.next();

            String kBin = Integer.toBinaryString(kDec);
            String kHex = Integer.toHexString(kDec).toUpperCase();

            int lDec = Integer.parseInt(lHex, 16);
            String lBin = Integer.toBinaryString(lDec);

            int mDec = Integer.parseInt(mBin, 2);
            String mHex = Integer.toHexString(mDec).toUpperCase();

            System.out.println("K десяткове = " + kDec );
            System.out.println("K шістнадцяткове = " + kHex );
            System.out.println("K двійкове = " + kBin );
            System.out.println();

            System.out.println("L десяткове = " + lDec );
            System.out.println("L шістнадцяткове = " + lHex );
            System.out.println("L двійкове = " + lBin );
            System.out.println();

            System.out.println("M десяткове = " + mDec );
            System.out.println("M шістнадцяткове = " + mHex );
            System.out.println("M двійкове = " + mBin );
            System.out.println();


        }
        public static void task2(){
            int K_dec = 3009;
            int L_hex = 0x2AB;
            int M_bin = 0b101111110;

            int L_dec = Integer.parseInt(Integer.toString(L_hex), 16);

            int KL_sum = K_dec + L_dec;
            int KM_sum = K_dec + M_bin;
            int LM_sum = L_dec + M_bin;

            System.out.println("K + L = " + KL_sum);
            System.out.println("K + M = " + KM_sum);
            System.out.println("L + M = " + LM_sum);

        }
    }

}