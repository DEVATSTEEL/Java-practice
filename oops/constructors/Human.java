public class Human {
 String name;
 @SuppressWarnings("unused")
 int age;
 @SuppressWarnings("unused")
 double weight;

 Human(String name , int age, double weight){

    this.name = name;
    this.age = age;
    this.weight = weight;

 }

 void eat (){
    System.out.println(this.name+" is eating");
 }

  void drink (){
    System.out.println(this.name+" is drinking *burp* ");
 }
}
