import java.util.Scanner;

public class Bai9 {
    // Hàm kiểm tra số Armstrong
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Nhập N hợp lệ
        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = scanner.nextInt();
            if (N < 0) {
                System.out.println("Số nhập vào không hợp lệ");
            }
        } while (N < 0);

        System.out.println("Các số Armstrong từ 0 đến " + N + ":");
        for (int i = 0; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}