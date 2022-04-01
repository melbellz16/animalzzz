package com.korovai.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // В основной программе:
        //Создайте ArrayList Animal
        //##Создайте в консоли меню, при входе в приложение на экран выводится запрос команды add/list/exit

}

    // Создайте родительский класс  Animal
        public class Animal {
        //Свойства: name, age, weight, color
        private String name;
        private int age;
        private int weight;
        private int color;
    }
             //Методы:
               //Getter and Setter

        public privat getString() {
            return String;
        }

        public void setString(privat string) {
            //String = string;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getColor() {
            return color;
        }

       public void setColor(int color) {
            this.color = color;
        }
    }

     //Say(Вывод на экран: "Я говорю"),
       public void say () {
          System.out.println("Я говорю");
}
    //Go(Вывод на экран: "Я иду"),
            public void go () {
        System.out.println("Я иду");
   }
    //Drink(Вывод на экран: "Я пью"),
          public void drink () {
           System.out.println("Я иду");
    }
    //Eat(Вывод на экран: "Я ем"),
          public void eat () {
              System.out.println("Я иду");
    }
    }
    //Переопределите метод toString (Возврат строки: "Привет! меня зовут name, мне age лет(/год/года),
    // я вешу - weight кг, мой цвет - color") лет или год, или года должно быть выбрано в зависимости от числа
    //Примеры:
    //Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
    //Привет! меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
    //Привет! меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный

    //Создайте интерфейс Flying
       // ##Методы:Fly
    public interface Flying {
        // methods
       void  Fly();
   // }


    //Команды оформить в enum
    //При вводе команды она должна быть регистронезависимой и обрезать пробелы в начале и конце
    //##Если add
    //спросить какое животное(cat/dog/duck)
    //Спросить имя, возраст, вес, цвет
    //Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
    //Вернуться к главному меню
    //##Если list
    //Вывести на экран метод toString() для всех елементов массива
    //##Если exit
    //выйти из программы


