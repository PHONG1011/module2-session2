import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai10 {
    // Hàm kiểm tra số Happy
    public static boolean isHappy(int num) {
        Set<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Số nhập vào không hợp lệ");
            }
        } while (N <= 0);

        System.out.println("Các số Happy từ 1 đến " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
