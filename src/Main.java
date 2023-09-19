import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int
                cost_po = 1, //sc.nextInt(),
                cost_sh = 6, //sc.nextInt(),
                cost_pe = 12, //sc.nextInt(),
                insert_po = 2, //sc.nextInt(),
                insert_sh = 0, //sc.nextInt(),
                insert_pe = 0; //sc.nextInt();
        String result;

        cost_pe = cost_po * 12 * 20 + cost_sh * 20 + cost_pe;
        insert_pe = insert_po * 12 * 20 + insert_sh * 20 + insert_pe;

        System.out.println( (cost_pe < insert_pe) ?
            "Сдача > pounds: " + ((insert_pe - cost_pe) / 20 / 12)
                    + " shillings: " + ((insert_pe - cost_pe) / 20 % 12)
                    + " pennies: " + ((insert_pe - cost_pe) % 20)
        :
            cost_pe > insert_pe ? "> Ошибка!!!" : "> Сдачи нет!!!");
    }
}