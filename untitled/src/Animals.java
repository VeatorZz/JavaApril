public class Animals {
    int age;
    String name;

    public Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

   public void eat(){
       System.out.println("吃");
   }
   public void speak(){
       System.out.println("叫");
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class cat extends Animals {

    public cat(int age, String name) {
        super(age, name);
    }
    String color;

    public cat(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Dog extends Animals{

    public Dog(int age, String name) {
        super(age, name);
    }
    String breed;

    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}