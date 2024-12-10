package Assignment;


import java.util.*;

class ComparatorComparableExample {
    static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.marks, other.marks);
        }

        @Override
        public String toString() {
            return name + ": " + marks;
        }
    }

    public void demonstrate() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 95));

        System.out.println("Before sorting: " + students);
        Collections.sort(students);
        System.out.println("After sorting by marks: " + students);

        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("After sorting by name: " + students);
    }
}
