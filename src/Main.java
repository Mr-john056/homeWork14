public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Griffindor("Гарри", "Поттер", "99", "98", "94", "97", "96"),
        new Griffindor("Гермиона", "Грейнджер", "86", "91", "88", "81", "80"),
        new Griffindor("Рон", "Уизли", "87", "90", "93", "87", "92"),
        new Slizerin("Драко", "Малфой", "98", "98", "99", "97", "96", "94", "96"),
        new Slizerin("Грэхэм", "Монтегю", "91", "83", "89", "96", "87", "91", "88"),
        new Slizerin("Грегори", "Гойл", "98", "98", "99", "97", "96", "94", "96"),
        new Puffenduy("Захария", "Смит", "93", "90", "88", "85", "93"),
        new Puffenduy("Седрик", "Диггори", "95", "89", "81", "83", "90"),
        new Puffenduy("Джастин", "Финч-Флетчли", "86", "92", "84", "87", "88"),
        new Kogtevran("Чжоу", "Чанг", "82", "88", "89", "85", "86"),
        new Kogtevran("Падма", "Патил", "96", "84", "86", "84", "83"),
        new Kogtevran("Маркус", "Белби", "89", "93", "86", "87", "88"),
};
        Griffindor hogwart = (Griffindor) hogwarts[0];
        Hogwarts hogwarts1 = hogwarts[1];
        hogwart.compare(hogwarts1);
        hogwart.compare(hogwarts1);

        System.out.println("Вывод всех учеников Хогвартса\n");
        for (Hogwarts griffindorStudent : hogwarts) {
            System.out.println(griffindorStudent);
        }
        System.out.println("Сравнение учеников из одного факультета по параметрам факультета");
        System.out.println(hogwarts[0].compare(hogwarts[1]));
        System.out.println(hogwarts[3].compare(hogwarts[5]));
        }
    }