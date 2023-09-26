public class CW_1 {
    public static void main(String[] args) {
        /*
        * 1. All to cents
        * 2. Check the biggest num, etc
        * 3. insert / 50
        *
        * 50 25 10 5 1 - nums
        *
        * conditions:
        * if cost > insert => error
        * if cost = 1 => isn't change
        *
        * если сдачи не осталось, то мы дальше не считаем
        * */

        int cost = 31, insert = 1;

        insert = insert * 100 - cost;

        if (cost > insert)
            System.out.println("Ошибка!!!");
        else {
            if (cost == insert) {
                System.out.println("Сдачи нет!!!");
            } else {
                if (insert / 50 != 0) System.out.println("\n> 50C - " + insert / 50);
                insert %= 50;
                if (insert != 0) {
                    if (insert / 25 != 0) System.out.println("\n> 25C - " + insert / 25);
                    insert %= 25;
                    if (insert != 0) {
                        if (insert / 10 != 0) System.out.println("\n> 10C - " + insert / 10);
                        insert %= 10;
                        if (insert != 0) {
                            if (insert / 5 != 0) System.out.println("\n> 5C - " + insert / 5);
                            insert %= 5;
                            if (insert != 0) {
                                if (insert != 0) System.out.println("\n> 1C - " + insert);
                            }
                        }
                    }
                }
            }
        }
    }
}
