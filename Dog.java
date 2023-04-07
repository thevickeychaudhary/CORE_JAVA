import java.util.Scanner;
 class Animal{
    void eat(){
        System.out.println(" animal is eating");

    }
}
 class Dog extends Animal{

void bark(){
    System.out.println("the dog is barking");
   }

//public testInhritance{
public static void main(String args[]){
    Dog d=new Dog();
d.bark();
d.eat();
    

}
}