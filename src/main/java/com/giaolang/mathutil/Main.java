package com.giaolang.mathutil;

import com.giaolang.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        //TDD - VIẾT CODE BẮT ĐẦU TỪ VIẾT TEST
    }

    public static void testFactorialGivenValid5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);


        //sout tab
        System.out.println("Check 5! | expected: "
                + expected + " | actual: " + actual);

    }
// CODE NÀY DÙNG ĐỂ TEST CODE CHÍNH TEST CODE BASE THỬ CODE NÀY GỌI LÀ TEST SCRIPT


}
