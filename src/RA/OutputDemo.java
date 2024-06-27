package RA;

import java.rmi.ServerError;

public class OutputDemo {
    public static void main(String[] args) {
        //1. in chuỗi và xuống dòng
        System.out.println("Rikkei academy chào đón các bạn ");
        //2. in chuỗi và không xuống dòng
        System.out.print("chúc các bạn thành công");
        //3 System.out.printf("Control String", value1, value2...)
        String studentName = "huy";
        int age = 26;
        float md1Mark = 4.9F;
        // in ra thông tin sinh viên với 1 câu lệnh
        System.out.printf("\nSinh viên %s với tuổi %d\t có điểm md1 là: %.1f\n", studentName, age, md1Mark);
        //\n xuống dòng
        //\t lùi vào 1 tab
        //4 System.err.println("String"): in nội dung lỗi
        System.err.println("Đã có lỗi xảy ra ");
    }
}
