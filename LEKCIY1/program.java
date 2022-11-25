package LEKCIY1;
public class program {
    public static void main(String[] args) {
        String s = "2";
        float f = 2f;
        double d = 2;
        char ch = 123; // неявное преобразование(мы не указываем тип данных) одного типа данных в другой тип данных

        int aa = 4;
        double dd = aa;

        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(dd);
    }
}