package Unit4;
//Superclass
public class Man {
    private int age;
    public Man(){
        age = 5;
    }
    public String toString(){
        return "Man: age " + age;
    }

    public int getAge(){
        return age;
    }
}
