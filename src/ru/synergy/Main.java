package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
    }

}
