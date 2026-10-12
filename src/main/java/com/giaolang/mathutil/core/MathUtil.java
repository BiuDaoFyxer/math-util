package com.giaolang.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        long resutl = 1;
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        //n đang ổn làm vòng for mà tính dần, nhận dần vào result
        for (int i = 1; i <= n; i++) {
            resutl *= i;
        }
        return resutl;
    }
}
// CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM
