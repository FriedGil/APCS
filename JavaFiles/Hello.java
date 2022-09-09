public class Hello {

    public static void main(String[] args) {
        Person gil = new Person("Gil",16);
        System.out.println(String.format("My name is %s and my age is %d", gil.myName, gil.myAge));

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
