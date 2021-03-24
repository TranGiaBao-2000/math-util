package com.giabao.mathutil.test;

import com.giabao.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 9550
 */
public class MathUltilityTest {

    //DAT TEN THIE CHUAN QA/QC
    @Test // bien ham nay thanh main(). Shift F6 de chay
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6)); // 6! == 720 ?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        // màu đỏ đến theo 2 nghĩa:
        //  -Hàm tính đúng kì vọng sai
        //  -Hàm tính sai kì vọng đúng
        //mỗi tình huống test hàm, với 1 đầu vào và nhận đầu ra
    }

    //test ngoại lệ thì như thế nào??
    //vì khi ngoại lệ xảy ra app dừng liên, màu đỏ
    //thêm nữa ngoại lệ ko phải là 1 value để so sánh
    //ngoại lệ chỉ có thể ước lượng khi nó xảy ra
    //test ngoại lệ nên đc diễn giải như sau:
    //tui đưa vào các tính huống dữ liệu cà chớn
    //vd 22,40
    //tui muốn xm ngoại lệ có xảy ra hay ko,nếu có thì mừng vi hàm chạy đúng
    // tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    //IllegalArgumentException, có nghĩa là hàm đúng -> xanh
    // xanh vì -5 phai có ngoại lệ
    // và nếu ngoại lệ xh, thì hàm đúng
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5); // chạy hàm
        MathUtility.getFactorial(21);   // biết thừa hàm ném ra Ex
        MathUtility.getFactorial(-1);   //nên ta phải bắt lại
        MathUtility.getFactorial(40);   // nếu có thật -> ham đúng
    }
}

// việc test dùng màu sắc, dùng thư viện Unit test có quy ước
// nếu tất cả cặp giá trị bằng nhau thì coi như hàm chạy đúng mọi tình huống -> xanh
// nếu trong tất cả các cặp mà ta test có ít nhất 1 cặp ko khớp nhau (ít nhất 1 màu đỏ) -> đỏ
// điều này đảm bảo rằng hàm đã test các tình huống thì phải đúng hết các tình huống đã test
// nói cách khác những gì t liệt kê ra phải đúng.
