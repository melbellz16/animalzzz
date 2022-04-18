package com.korovai.animal;
// Создайте класс Duck унаследуйте его от Animal, реализуйте интерфейс Flying

public class Duck extends Animal {
    @Override
    //Переопределить метод Say(Вывод на экран: "Кря")
    public void say() {
        System.out.println("Вывод на экран: Кря");
    }
    //  реализуйте интерфейс Flying
    public interface Flying {
        // methods
        void flying();
    }
      //Реализовать метод Fly(Вывод на экран: "Я лечу")
    public void fly() {
        System.out.println("Я лечу");
    }
}


