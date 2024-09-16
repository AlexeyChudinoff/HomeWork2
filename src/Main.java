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
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
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
        var sum = massa1 + massa2;
        var raznica = massa2 - massa1;
        System.out.println("общая масса бойцов  " + sum);
        System.out.println("разница масс  " + raznica);
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