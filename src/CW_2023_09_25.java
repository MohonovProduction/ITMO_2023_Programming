public class CW_2023_09_25 {
    public static void main(String[] args) {
        int d = 25, m = 9, y = 2023, f = 0, days = 0;
        boolean error = false;

        if (y < 1585) {
            error = true;
        } else {
            f = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (d < 1 || d > 31)
                        error = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d < 1 || d > 31)
                        error = true;
                    break;
                case 2:
                    if (d < 1 || d > 20 + f)
                        error = true;
                default:
                    error= true;
                    break;
            }

            if (error) {
                System.out.printn("Дата не существует!");
            } else {
                days = d;
                switch (m - 1) {
                    case 11:
                        days += 30;
                    case 10:
                        days += 31;
                    case 9:
                        days += 30;
                    case 8:
                        days += 31;
                    case 7:
                        days += 31;
                    case 6:
                        days += 30;
                    case 5:
                        days += 31;
                    case 4:
                        days += 30;
                    case 3:
                        days += 31;
                    case 2:
                        days += 28 + f;
                    case 1:
                        days += 31;
                }
                System.out.println("Количество дней с янворя сего года до вашей даты:" + days);
            }
        }
    }
}
