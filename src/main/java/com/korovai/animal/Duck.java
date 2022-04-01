package com.korovai.Animal;
// Создайте класс Duck унаследуйте его от Animal, реализуйте интерфейс Flying

public class Dug extends Animal {
    @Override
    //Переопределить метод Say(Вывод на экран: "Кря")
    public void Say() {
        System.out.println("Вывод на экран: Кря");
    }

    //  реализуйте интерфейс Flying
    public interface Flying {
        // methods
        void flying();
    }
      //Реализовать метод Fly(Вывод на экран: "Я лечу")

    public void Fly() {
        System.out.println("Я лечу");
    }
}


