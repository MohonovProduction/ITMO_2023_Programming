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
                insert = 1;

        insert *= 100 - cost;

        cost >= 100 ?
                (cost == 100) ? "Сдачи нет!!!" : "Ошибка!!!"
                : "> Сдача:\n50C - " + (insert / 50 )
                + "\n25C - " + (insert % 50 / 25)
                + "\n10C - " + (insert % 50 % 25 / 10 )
                + "\n5C - " + (insert % 50 % 25 % 10 / 5 )
                + "\n1C - " + (insert % 50 % 25 % 10 % 5 )

        System.out.println(
        );

    }
}
