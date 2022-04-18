package com.korovai.Animal;

import com.korovai.animal.Animal;

//Создайте класс Cat унаследуйте его от Animal
//Переопределить метод Say(Вывод на экран: "Мяу")
public class Cat extends Animal {
    @Override
    public void say(){
        System.out.println("Мяу");

    }
}
