public class Dog {

    private int age;
    private String name;
    private String color;
    private Owner owner;

    public Dog(int a, String n, String c, Owner o){
        age = a;
        name = n;
        color = c;
        owner = o;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner o){
        owner = o;
    }

    public void addOneAge(){
        age++;
    }
    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. This dog is " + color;
    }

}
