package com.company;

import java.util.*;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        // ДЗ 4-й урок (Дэдлайн 3 дня)
        //a) Используйте цикл или итератор
        //Сделано

        //b) Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        //Сделано

        //c) Затем программа должна отобразить этот список
        //Сделано

        //d) Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
        // После также отображает его в консоли
        //Сделано

        //e) Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1} (0.9.1.8.2.7.3.6.4.5)
        //Сделано

        //f) После объединения отобразить в консоли список С
        //Сделано

        //g) В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
        // и распечатать отсортированный список С.
        // Сделано

            
        Scanner addNameScanner = new Scanner(System.in);

        ArrayList<String> namesThatEnteredA = new ArrayList<>();
        ArrayList<String> namesThatEnteredB = new ArrayList<>();
        ArrayList<String> namesThatEnteredC = new ArrayList<>();

        for (int i = 0; i < 5; i++) namesThatEnteredA.add(addNameScanner.next());
        System.out.println("Список А: " + namesThatEnteredA);
        for (int i = 0; i < 5; i++) namesThatEnteredB.add(addNameScanner.next());
        System.out.println("Список Б: " + namesThatEnteredB);

        namesThatEnteredC.addAll(namesThatEnteredA);
        namesThatEnteredC.addAll(namesThatEnteredB);
        ArrayList<String> namesThatEnteredEx = new ArrayList<>(namesThatEnteredC);
        System.out.println("Список проверки слияния: " + namesThatEnteredC);

        namesThatEnteredC.set(0, namesThatEnteredEx.get(0));
        namesThatEnteredC.set(1, namesThatEnteredEx.get(9));
        namesThatEnteredC.set(2, namesThatEnteredEx.get(1));
        namesThatEnteredC.set(3, namesThatEnteredEx.get(8));
        namesThatEnteredC.set(4, namesThatEnteredEx.get(2));
        namesThatEnteredC.set(5, namesThatEnteredEx.get(7));
        namesThatEnteredC.set(6, namesThatEnteredEx.get(3));
        namesThatEnteredC.set(7, namesThatEnteredEx.get(6));
        namesThatEnteredC.set(8, namesThatEnteredEx.get(4));
        namesThatEnteredC.set(9, namesThatEnteredEx.get(5));
        System.out.println("Выполнение условия задачи: " + namesThatEnteredC);

        String[] arrayOfStrings  = namesThatEnteredC.toArray(new String[0]);
        System.out.println("Исходный массив: " + Arrays.toString(arrayOfStrings));
        Arrays.sort(arrayOfStrings, Comparator.comparing(String::length));
        System.out.println("Сортированный массив: " + Arrays.toString(arrayOfStrings));
    }
}
