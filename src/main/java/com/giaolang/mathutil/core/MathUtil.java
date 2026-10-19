package com.giaolang.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        // Đổi hàm tính theo đệ quy - Recursion
        if (n < 0|| n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if( n == 0 || n == 1){
            return 1; // điểm dừng đệ quy ko lùi nữa lùi đến 1 là tính được
        }
        // tính được n! = (n - 1)! * n
        return n * getFactorial(n - 1);
        //Tối ưu tinh chỉnh code cho nó hay hơn, ổn hơn (thuật toán chạy nhanh hơn)
        //Việc chính code để tốt hơn gọi là Refractor/ Rẻactoring
        //long resutl = 1;
        //if(n < 0 || n > 20){
            //throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        //}
        //n đang ổn làm vòng for mà tính dần, nhận dần vào result
        //for (int i = 1; i <= n; i++) {
            //resutl *= i;
        //}
        //return resutl;
    }
}
// CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM
