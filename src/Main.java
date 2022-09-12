public class Main {
    public static void main(String[] args) {
        var dog = 8.0; //Задача 1
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4; //Задача 2
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5; //Задача 3
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19; //Задача 4
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5; //Задача 5
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2; //Задача 6
        var weightSecondBoxer = 82.7;
        var weightTotal = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух бойцов " + weightTotal);
        var weightDifferent = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весами бойцов(вычитание) " + weightDifferent);

        weightDifferent = weightSecondBoxer % weightFirstBoxer; //Задача 7
        System.out.println("Разница между весами бойцов(остаток от деления) " + weightDifferent);

        var workHours = 640; //Задача 8
        var eachWorkerHours = 8;
        var totalWorkers = workHours / eachWorkerHours;
        System.out.println("Всего работников в компании – " + totalWorkers + " человек");

        var totalWorkersMore = totalWorkers + 94;
        var workHoursMore = totalWorkersMore * eachWorkerHours;
        System.out.println("Если в компании работает " + totalWorkersMore + " человек, то всего " + workHoursMore + " часов работы может быть поделено между сотрудниками");
    }
}