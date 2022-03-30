package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томмас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филлип");
        cats[3] = new Cat("Котэ");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        //ArrayList
        ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats){
            catsList.add(cat);
        }

        catsList.add(new Cat("Филя"));

        catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("залетный"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

        //MethodList - LinkedList
        String str1 = new String("Hello World");
        String str2 = new String("My name Evgenu");
        String str3 = new String("java start" );

        LinkedList<String> EvgenuBio = new LinkedList<>();
        EvgenuBio.add(str1);
        EvgenuBio.add(str2);
        EvgenuBio.add(str3);


        System.out.println(EvgenuBio);

        EvgenuBio.remove(1);
        System.out.println(EvgenuBio);

        //LinkedList on practice
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari");
        Car bugati = new Car("Veyron");
        Car mercedes = new Car("Mercedes Benz");

        cars.addAll(Arrays.asList(ferrari, bugati, mercedes));
        System.out.println(cars);

        cars.addFirst(new Car("Ford GT300"));
        cars.addLast(new Car("Fiat"));

        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);


    }

}
