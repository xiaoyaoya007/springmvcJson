import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestI18n {

    @Test
    public void test(){
        //加载语言文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", Locale.ENGLISH);
        System.out.println(resourceBundle.getString("hello"));
    }
}
