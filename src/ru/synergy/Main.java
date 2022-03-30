package ru.synergy;

import java.util.*;

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
        for (Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Филя"));

        //catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("залетный"));

        //catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

        //MethodList - LinkedList
        String str1 = new String("Hello World");
        String str2 = new String("My name Evgenu");
        String str3 = new String("java start");

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


        //ArrayList vs LinkedList

/*        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5000000; i++) {
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) ;
        {
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для LinkedList в (милесекундах)" + (System.currentTimeMillis() - start));


        list = new ArrayList<>();

        for (int i = 0; i < 5000000; i++) {
            list.add(new Integer(i));
        }
        start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) ;
        {
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для ArrayList в (милесекундах)" + (System.currentTimeMillis() - start));*/

        //Set
        Set<String> states = new HashSet<>();
        states.add("Germany");
        states.add("Francia");
        states.add("Italy");

        boolean isAdded = states.add("Italy");
        System.out.println("Italy is added: "+ isAdded);
        System.out.println("Set contains:" + states.size());

        System.out.println(states);

        states.remove("Germany");

        System.out.println(states);

        HashSet<Cat> catHashSet = new HashSet<>(catsList);

        System.out.println(catHashSet);


        TreeSet<Cat> catTreeSet = new TreeSet<>(catsList);

        System.out.println(catTreeSet);


        // Map
    }
}
