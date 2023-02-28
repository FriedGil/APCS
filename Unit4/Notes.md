# Inheritance is an OOP paradigm to improve code reusability and structure.

In the following example, A is a parent/super class and B is a child/sub class.

```java 
public class A{
    public A(){
        ...
    }
}

public class B extends A{
    public B(){
        super(); // must match at least one constructor for A
        ...
    }
}
```

B inherits A's methods, but must use a getter to access private values of the parent

# Abstract classes are uninstantiable. They can have abstract methods which aren't defined but most be defined by non-abstract children.

```java
public abstract class Person{
    private int age;
    private String gender
    public Person(int a, String g){
        age = a;
        gender = n;
    }
    public abstract void talk();

}

public Man extends Person{
    public Person(int a){
        super(a,"MALE");
    }
    public void talk(){
            System.out.println("Yo");
    }
}

```

# Interfaces are a collection of constants and abstract methods that an object can implement. Interfaces have no no constructors or instance variables. All interfaced methods are public and abstract.


```java
public interface canJump{
    void jump();
    // Interfaces can overload methods.
    void jump(int height);
}

public Person implements canJump {
...
}
```

Interfaces can also implement generic methods.

```java
public interface Huggable<T>{
    void hug(T other); //hug can be implemented for any type.
}
```