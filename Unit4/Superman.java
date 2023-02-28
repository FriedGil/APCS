package Unit4;
//Subclass
public class Superman extends Man{
    protected String power;
    public Superman(String p, int a){
        power = p;
    }
    public String toString(){
        return "Superman: age " + getAge() + " power " + power;
    }

    public String getPower(){
        return power;
    }


    
}
