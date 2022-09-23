public class Hello {

    public static void main(String[] args) {
        Person Gil = new Person("Gil Friedman",16);
        System.out.println(String.format("My name is %s and my age is %d", Gil.myName, Gil.myAge));

    }
}

class Person{
    String myName;
    int myAge;
    public Person(String name, int age){
        myName = name;
        myAge = age;
    }
}