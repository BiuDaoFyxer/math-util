import com.giaolang.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilTest {
    //test case 4: test hàm với đầu vào ko hợp lệ
    //n = -1, hy vọng hàm: TRẢ VỀ NGOẠI LỆ!!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial( -1);});
    }
    @Test
    public  void testFactorialGivenValid5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    // so sáng tự đôngnj giúp tui expected có == actual hay không
    // nếu == thì quất màu xanh
    // nếu != quất màu đỏ !!!!
    @Test
    public  void testFactorialGivenValid5ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    @Test
    public  void testFactorialGivenValid5ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
}
