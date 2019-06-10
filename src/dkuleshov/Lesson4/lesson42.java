package Lesson4;

public class lesson42 {
    public static void main(String[] args) {
        String str = "kak dela, kak     kakpozhivaesh?";
        System.out.println(str);
        int chi = str.split("\\s+").length;
        System.out.println("koli4estvo slov ravno " + chi);
    }
}



