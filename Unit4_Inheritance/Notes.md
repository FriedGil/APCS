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