package com.korovai.animal;
// Создайте класс Duck унаследуйте его от Animal, реализуйте интерфейс Flying
public class Duck extends Animal implements Flying {
    @Override
    //Переопределить метод Say(Вывод на экран: "Кря")
    public void say() {
        System.out.println("Вывод на экран: Кря");
    }
      //Реализовать метод Fly(Вывод на экран: "Я лечу")
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}