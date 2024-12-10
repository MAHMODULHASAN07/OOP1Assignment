package Assignment;

import java.util.*;

class HashCodeEqualsExample {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public void demonstrate() {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 hashCode: " + p1.hashCode() + ", p2 hashCode: " + p2.hashCode());
    }
}
