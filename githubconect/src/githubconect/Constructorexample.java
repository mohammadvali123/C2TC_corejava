package githubconect;

public class Constructorexample {
    private String name;
    private int age;
    
    // Default constructor
    public Constructorexample() {
        name = "";
        age = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
