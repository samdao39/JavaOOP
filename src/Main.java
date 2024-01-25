// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);


                // Khởi tạo mảng để lưu các số chẵn từ 0 đến 50
                int[] evenNumbers = new int[26]; // Vì có 26 số chẵn từ 0 đến 50
                int arr = 0; // Biến này sẽ giúp chúng ta đặt giá trị vào mảng

                // Vòng lặp để in ra các số chẵn và lưu chúng vào mảng
                for (int i = 0; i <= 50; i++) {
                    if (i % 2 == 0) { // Kiểm tra xem i có phải là số chẵn hay không
                        System.out.println(i); // In ra số chẵn
                        evenNumbers[arr] = i; // Lưu số chẵn vào mảng
                        arr++; // Tăng chỉ số để lưu vào vị trí tiếp theo của mảng
                    }
                }

                // Duyệt mảng và in ra kết quả
                System.out.println("\nCác số chẵn trong mảng:");
                for (int number : evenNumbers) {
                    System.out.println(number);
                }
            }
        }


