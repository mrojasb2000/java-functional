package org.dromader.imperative;

import java.util.List;

import static org.dromader.imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
           new Person("John", MALE),
           new Person("Maria", FEMALE),
           new Person("Aisha", FEMALE),
           new Person("Alex", FEMALE),
           new Person("Alice", MALE)

        );
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
