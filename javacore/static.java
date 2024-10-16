public class FinalExample {
    final int finalValue = 10; // Biến final

    void changeValue() {
        // finalValue = 20; // Lỗi biên không thể thay đổi giá trị
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("Giá trị của finalValue: " + example.finalValue); // Kết quả: 10
    }
}

