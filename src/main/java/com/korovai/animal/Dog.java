package com.korovai.animal;

//Создайте класс Dog унаследуйте его от Animal
 //Переопределить метод Say(Вывод на экран: "Гав")
public class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("Гав");
    }
}
