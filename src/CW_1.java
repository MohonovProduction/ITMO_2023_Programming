public class CW_1 {
    public static void main(String[] args) {
        /*
        * 1. All to cents
        * 2. Check the biggest num, etc
        * 3. insert / 50
        *
        *
        * //50 25 10 5 1 - nums
        * */

        int
                cost = 27,
                insert = 1,
                n = 0;

        insert *= 100 - cost;

        System.out.println(
                cost >= 100 ? (cost == 100) ? "Сдачи нет!!!" : "Ошибка!!!" : ""
        );
        n = insert / 50;
        System.out.println(
                n != 0 ? "> Сдача:\n50C - " + n : ""
        );
        insert %= 50;
        n = insert / 25;
        System.out.println(
                n != 0 ? "\n25C - " + n : ""
        );
        insert %= 25;
        n = insert / 10;
        System.out.println(
                n != 0 ? "\n10C - " + n : ""
        );
        insert %= 10;
        n = insert / 5;
        System.out.println(
                n != 0 ? "\n5C - " + n : ""
        );
        insert %= 5;
        System.out.println(
                insert != 0 ? "\n1C - " + insert : ""
        );
    }
}
