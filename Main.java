public class Main {
    public static void main(String[] args) {
        System.out.println("こんにちは、Java！");
        int age;
        age = 30;
        System.out.println(age);

        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);

        boolean isError = true;
        char kanji = '駆';
        double pie = 3.14;
        long number = 314159265853979L;
        String message = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";

        System.out.println(isError);
        System.out.println(kanji);
        System.out.println(pie);
        System.out.println(number);
        System.out.println(message);
    }
}