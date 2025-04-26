// This activity is mainly to understand the concept of inheritance

// Parent Class
class Parent {
    int age, id;
    String name;

    void naming(String name) {
        System.out.println("Name: " + name);
    }
}

// Child Class
class Child extends Parent {
    void ageN(int age) {
        System.out.println("Age of student is: " + age);
    }
}

// Main Class
public class main {
    public static void main(String[] args) {
        Child s = new Child(); // Creating object of child class
        s.naming("Benedicta");
        s.ageN(12);
    }
}
