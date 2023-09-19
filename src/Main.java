import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 1. get cost -> pounds, shillings, pennies
         * 2. get insert -> pounds, shillings, pennies
         * 3. All to pennies
         * if cost > insert -> err
         * if cost = insert -> haven't change
         * if cost < insert -> 4. output change in po, sh, pe,
         *
         * 3. po * 12 * 20 + sh * 20 + pe
         * 4.
         * n_pe = pe % 20
         * n_sh = pe / 20 % 12
         * n_po = pe / 20 / 12
         */

        Scanner sc = new Scanner(System.in);
        int
                cost_po = sc.nextInt(),
                cost_sh = sc.nextInt(),
                cost_pe = sc.nextInt(),
                insert_po = sc.nextInt(),
                insert_sh = sc.nextInt(),
                insert_pe = sc.nextInt();
        String result;

        cost_pe = cost_po * 12 * 20 + cost_sh * 20 + cost_pe;
        insert_pe = insert_po * 12 * 20 + insert_sh * 20 + insert_pe;

        if (cost_pe < insert_pe)
            result = "Сдача > pounds: " + ((insert_pe - cost_pe) / 20 / 12)
                    + " shillings: " + ((insert_pe - cost_pe) / 20 % 12)
                    + " pennies: " + ((insert_pe - cost_pe) % 20);
        else
            result = cost_pe > insert_pe ? "> Ошибка!!!" : "> Сдачи нет!!!";

        System.out.println(result);
    }
}