package testprojecs;


class Person {
 private String name;
 private int age;
 

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 

 public String getName() {
     return name;
 }
 
 public int getAge() {
     return age;
 }

 public void setName(String name) {
     this.name = name;
 }
 
 public void setAge(int age) {
     this.age = age;
 }
}

public class CarclassExample {
 public static void main(String[] args) {
 
     Person person1 = new Person("John", 25);

     System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
   
     Person person2 = new Person("Mary", 30);
     
     System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
  
     person2.setName("Jane");
     person2.setAge(35);
     System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
 }
}

