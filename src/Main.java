public class Main {
    public static void main(String[] args) {
        System.out.println("     Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("     Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("     Задача 3");
        var x = 3.5;
        var y = 1.6;
        var z = 7639;
        System.out.println(dog - x);
        System.out.println(cat - y);
        System.out.println(paper - z);
        System.out.println("     Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("     Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("     Задача 6");
        var massa1 = 78.2;
        var massa2 = 82.7;
        System.out.println("общая масса бойцов  " + (massa2 + massa1));
        System.out.println("разница масс  " + (massa2 - massa1));
        System.out.println("     Задача 7");
        var ostat = (massa2 % massa1);
        System.out.println("остаток деления   " + ostat);
        System.out.println("     Задача 8");
        var sotrudnic = (640 / 8);
        System.out.println("Всего сотрудников в компани  " + sotrudnic);
        sotrudnic = sotrudnic + 94;
        var allTime = (sotrudnic * 8);
        System.out.println("если в компании работает  " + sotrudnic +
                " человек, то всего  " + allTime + " часов работы может быть " +
                "поделено между сотрудниками");

    }
}