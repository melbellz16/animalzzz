package com.korovai.animal;
// Создайте родительский класс Animal
public class Animal {

        //Свойства: name, age, weight, color
        private String name;
        private int age;
        private int weight;
        private int color;

        //Методы:
        //Getter and Setter


        public void setName(String name) {
            this.name = name;
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

        // метод Say(Вывод на экран: "Я говорю"),
        public void say() {
            System.out.println("Я говорю");
        }

        //метод Go(Вывод на экран: "Я иду"),
        public void go() {

            System.out.println("Я иду");
        }

        //метод drink(Вывод на экран: "Я пью"),
        public void drink() {

            System.out.println("Я иду");
        }

        //метод eat(Вывод на экран: "Я ем"),
        public void eat() {

            System.out.println("Я иду");
        }

    public String getName() {
        return name;
    }


    }

