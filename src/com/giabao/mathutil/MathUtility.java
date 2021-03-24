package com.giabao.mathutil;

/**
 *
 * @author 9550
 */
public class MathUtility {
    // ta se tao cac ham trong class nay fake y chang class Math
    //cac ham xai chung nhieu noi , tien ich dung chung 
    //pham cai gi dung chung thi ta suy nghi den STATIC

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

}
