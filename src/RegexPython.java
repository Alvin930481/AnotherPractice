import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPython {
    public static void main(String[] args) {
        String rs = "我來測試一下，我的電話號碼0912345678，電子郵件信箱是:alvin@gmail.com，我要來測試爬蟲，爬取裡面我的電子信箱和電話，另外一隻0987654321";

        String regex = "((\\w)+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+)|(09\\d{8})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
