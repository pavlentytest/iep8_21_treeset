package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       // Collections.sort()
       // Arrays.sort()
               // Object -merge sort
               // simple data -quick sort (modif)

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 5,3,3,4,5,2,5,7,565,875,67);
        Collections.sort(arrayList);
        System.out.println(Collections.binarySearch(arrayList,5));

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Max");
        names.add("Max");
        names.add("Max");
        names.add("Oleg");
        names.add("Olga");
        names.add("Maria");

        TreeSet<String> treeSet = new TreeSet<>(names);
        for(String s: treeSet) {
            System.out.println(s);
        }

        class Person implements Comparable<Person>{
            String name;
            int mark;

            public Person(String name, int mark) {
                this.name = name;
                this.mark = mark;
            }

            @Override
            public int compareTo(Person o) {
                //return this.mark-o.mark;
                return this.name.compareTo(o.name);
            }
        }
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Ivan",40));
        personTreeSet.add(new Person("Maria",40));
        personTreeSet.add(new Person("Petr",17));
        personTreeSet.add(new Person("Maria",23));
        personTreeSet.add(new Person("Max",23));
        personTreeSet.add(new Person("Natalia",56));
        for(Person p: personTreeSet) {
            System.out.println(p.mark + " => "+p.name);
        }

        SortedSet<Person> result = personTreeSet.tailSet(new Person("",40));
        for(Person p: result) {
            System.out.println(p.mark+"-"+p.name);
        }

        personTreeSet.subSet(new Person("",18),new Person("",40));


    }
}
