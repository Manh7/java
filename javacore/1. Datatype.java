public class ObjectComparison {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = new Integer(5);
        
        // So sánh địa chỉ tham chiếu
        System.out.println("So sánh kiểu object (==): " + (a == b)); // Kết quả: false
        
        // So sánh giá trị thực
        System.out.println("So sánh kiểu object (equals): " + a.equals(b)); // Kết quả: true
    }
}

