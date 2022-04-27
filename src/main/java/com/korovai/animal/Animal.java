package com.korovai.animal;
// Создайте родительский класс Animal
public class Animal {
        //Свойства: name, age, weight, color
        private String name;
        private int age;
        private int weight;
        private String color;

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
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
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
    //Переопределите метод toString (Возврат строки: "Привет! меня зовут name, мне age лет(/год/года),
    //я вешу - weight кг, мой цвет - color") лет или год, или года должно быть выбрано в зависимости от числа
    //Примеры:
    //Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
    //Привет! меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
    //Привет! меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный
    @Override
    public String toString() {
        return "Animal{" +
                "Привет! меня зовут='" + name + '\'' +
                ", мне=" + age + createAge(age)+
                ", я вешу=" + weight +
                ", мой цвет=" + color +
                '}';
    }
         public String createAge (int age) {
             if (age == 0) {
                 return "лет";
             } else if (age == 1) {
                     return "год";
                 }
             else if  (age >= 5 && age <= 20) {
                 return "лет";
             }
             else if (age >= 2 && age <= 4) {
                 return "года";
             } else {
                 return "Чуток староват мохнатый";
             }
         }
}