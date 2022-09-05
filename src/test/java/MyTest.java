import com.bjpowernode.utils.MD5Util;
import org.junit.Test;

/**
 * @Author hongxiaobin
 * @Time 2022/9/3-15:37
 */
public class MyTest {
    @Test
    public void testMD5(){
        String mi = MD5Util.getMD5("000000");
        System.out.println(mi);
    }
}
