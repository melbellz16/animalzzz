package com.korovai.animal;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // В основной программе:
        //Создайте ArrayList Animal
        List<Animal> animals = new ArrayList<>();
        //##Создайте в консоли меню, при входе в приложение на экран выводится запрос команды add/list/exit
        Scanner sc = new Scanner(System.in);
        Commands chose;
        //При вводе команды она должна быть регистронезависимой и обрезать пробелы в начале и конце
        //Команды оформить в enum
       boolean isNotExit = true;
        while (isNotExit){
            System.out.println("Выберите команду add/list/exit" );
             chose = Commands.valueOf(sc.next().toUpperCase(Locale.ROOT));
            switch (chose){
                //##Если add
                //спросить какое животное(cat/dog/duck)
                //Спросить имя, возраст, вес, цвет
                //Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
                case ADD:
                    System.out.println("Какое животное хочешь? cat / dog/ duck");
                    String animalType = sc.next();
                    Animal newAnimal = null; //Инициализировать класс
                    if (animalType.equals("cat")){
                        newAnimal = new Cat();
                     generateAnimal(newAnimal,sc);
                    } else if (animalType.equals("dog")) {
                        newAnimal = new Dog();
                        generateAnimal(newAnimal,sc);
                    }else if (animalType.equals("duck")){
                        newAnimal = new Duck();
                        generateAnimal(newAnimal,sc);
                    }
                    animals.add(newAnimal);
                    newAnimal.say();
                   // System.out.println("add");
                    break;
                case LIST:
                    //##Если list
                    //Вывести на экран метод toString() для всех элементов массива
                    for (Animal a: animals){
                        a.say();
                    }
                    //System.out.println("list");
                    break;
                case EXIT:
                  //  ##Если exit
                  //  выйти из программы
                    isNotExit = false;
                    break;
            }
        }
        System.out.println("Adios");
       }
       private static void generateAnimal(Animal newAnimal, Scanner scanner){
           System.out.println("Выберите имя");
           newAnimal.setName(scanner.next());
           System.out.println("Выберите цвет");
           newAnimal.setColor(scanner.nextInt());
           System.out.println("Выберите возраст");
           newAnimal.setAge(scanner.nextInt());
           System.out.println("Выберите вес");
           newAnimal.setWeight(scanner.nextInt());
       }
}





