package Lesson4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class lesson41 {
    public static void main(String[] Args) {
        String stroka = ".,!. .   sdf,?";
        Pattern p = Pattern.compile("\\.|\\,|\\?|\\!");
        Matcher m = p.matcher(stroka);
        int chislo=0;
        while (m.find()) {
            chislo++;
        }
        System.out.println(chislo);
    }
}
