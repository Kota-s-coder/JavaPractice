import java.util.Scanner;

public class Hungry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isHungry = -1;

        while (true) {
            System.out.print("満腹の場合:0、空腹の場合:1を指定してください > ");
            
            // 数字が入力されたかチェック
            if (scanner.hasNextInt()) {
                isHungry = scanner.nextInt();

                // 0 または 1 ならループ終了
                if (isHungry == 0 || isHungry == 1) {
                    System.out.println("こんにちは");
                    if(isHungry == 0){
                        System.out.println("お腹いっぱいです");
                    } else {
                        String food = "オムライス";
                        System.out.println("はらぺこです");
                        System.out.println(food + "をいただきます");
                    }
                    System.out.println("ごちそうさまでした");
                    break;
                } else {
                    System.out.println("エラー: 0 か 1 を入力してください。");
                }
            } else {
                // 数字でない場合（例：文字列）
                System.out.println("エラー: 数字を入力してください。");
                scanner.next(); // 無効な入力を読み飛ばす
            }
        }
    }
}
