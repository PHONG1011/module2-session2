import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên có 3 chữ số (100-999): ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        String[] numWords = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        String result = "";

        // Đọc hàng trăm
        result += numWords[hundreds] + " trăm ";

        // Đọc hàng chục
        if (tens == 0 && units != 0) {
            result += "lẻ ";
        } else if (tens > 0) {
            if (tens == 1) {
                result += "mười ";
            } else {
                result += numWords[tens] + " mươi ";
            }
        }

        // Đọc hàng đơn vị
        if (units > 0) {
            if (tens > 1 && units == 1) {
                result += "mốt";
            } else if (units == 5 && tens > 0) {
                result += "lăm";
            } else {
                result += numWords[units];
            }
        }

        System.out.println("Cách đọc: " + result.trim());
    }
}