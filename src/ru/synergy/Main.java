package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томмас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филлип");
        cats[3] = new Cat("Котэ");

        cats[1] = null;

        System.out.println(Arrays.toString(cats));
    }
}
