# Core-Programming

The four pillars of OOPS are :

1) Encapsulation : Putting together all the methods and attributes to a single unit is called Encapsulation.
   
3) Inheritance :  when a child class inherits the properties from the parent class is called as inheritance...

3) Polymorphism  : poly : many ; morphism : forms
   
    There are two types of Polymorphism :
   
   i) Static ploymorphism : It includes overloading concepts.: If i have created the fucntions of the same name, they should have different parameters..
   ii) Dynamic Polymorphism : It includes overriding concepts : Overriding means to redefine the properties of the parent class..

For function overriding , we need to have a parent-child relationship... , in overriding everything is same , function name and its signature,.. but in Function Overloading, in this function name is same but the signature is different...
   
5) Abstraction : Hiding the complicated details of the program   ..

   When we use inheritance, we use extends keyword BUT when we use interface, we use Implements keyword..

   PRIVATE AND PROTECTED ACCESS MODIFIERS CAN'T BE ACCESS AT TOP LEVEL IN JAVA CLASSES
   default and public can be access at top level in java classes..

   THE OTHER NAME OF default is package private.

   (jaroori nahi haike jab hum kuj mat likhe to default he aye, har case mei aisa jaroori nahi hai !)

   ACCESS MODIFIERS : (RESTRICTIONS LAGA SAKTE HAI VISIBILITY KE LIYE , KON ACCESS KRRA H AUR KAHA SE ACCESS KRRAA HAI !)
   
 specifiers and modifiers are the same.

   There are 4 access modifiers :
   1) public : CAN ACCESS ANYWHERE 
   2) private : ONLY KHUD KI CLASS ! SAME CLASS
   3) protected : CHILD CLASS KAHI SE BHI ACCESS KR SAKTI HAI ! (NON CHILD CLASS HAI TOH SIRF WITHIN THE PACKAGE HE KAR SAKTI HAI !) NON CHILD CLASS
    PACKAGE KE ANDAR EH HONI CHAHIYE..
   5) default / friendly / package-private! : SIRF PACKAGE KE ANDAR SE, DEFAULT PACKAGE KE BAHAR JANE HE NAHI DETA! PACKAGE SE BAHAR KOI BHI ACCESS NAHI KAR SAKTA

      PACKAGE : It is a file directory in the system. in which we can make grouping of classes so that we can easily differentiate the files and folders

      syntax of making packages in java :
      (package movies;) (package java;) 

      desktop --- > folder (this folder is a kind of package in java!)---> level 1 ( this level 1 is a sub package in folder)

      IN LAW OF INHERITANCE, EVERYTHING IS ACCESSIBLE BUT NOT PRIVATE.
      PROTECTED SAME PACKAGE SE ACCESS KAR SAKTA HAI AUR DEFAULT BHI...
       (different package se nahi kar sakta!)
      PUBLIC ANYWHHERE ACCESS KAR SAKTA HAI!

      (PACKAGE KA NAAM NAHI LIKHOGE TO WOH DEFAULT PACKAGE HE HAI!)
      
      
  
      NON ACCESS SPECIFIERS :
      1) STATIC
      2) fiNAL
      3) TRANSIENT
      4) VOLATILE
      5) SYNCHRONIZED
  
      this keyword is used to access the current object or class..
  
      OBJECTS ALWAYS CREATE AT RUNTIME!!!! 

      final keyword

      PARENT CLASS CAN BE STORE THE REFERNCE OF THE CHILD CLASS.
      ya child --- child (khud ka!) ya ancestor ka refernce store krega!
      
      child class can'be be store the refernce of parent!
      siblings can't be store the refernce of parent !
  
      ONLY parent ---- child relationship!
  
      if CHILD REFERNCE IS BEING STORED BY PARENT OBJECT VARIABLE , THIS CONCECPT IS CALLED AS UPCASTING : CHILD KA REFERNCE PARENT NE STORE KARLIAAAA!
  
      DOWNCASTING : IF CHILD IS ASKING BACK HIS REFERNCE FROM PARENT CLASS, IS CALLED DOWNCASTING.
      wE CANT'T WRITE IT IMPLICITLY, WE HAVE TO PERFORM IT EXPLICITLY OR MANUALLY :
      example : Mango p = (Mango)a; (downcasting)
  
      INSTANCE OF OPERATOR 
  
      APPLE IS FATHER AND BANAANA AND KIWI ARE THEIR OBJECTS.
  
      SIBLINGS CAN'T STORE THEIR REFERNCE..

      Apple x=new Apple();
      Banana y=new banana();
      Apple z=new Banana();
      Apple a = new kiwi();

      CLASSCAST EXCEPTION OCCURS WHEN WE TRY TO CONVERT THE WRONG DATA TYPE.
      TO PREVENT FROM CLASSCAST EXCEPTION, USE INSTANCE OF KEYWORD!!!

      if(x instanceof Kiwi) : means jo x ne store kiya hai , kya woh kiwi ek descentdents mein ata hai??

      A ClassCastException in Java is a RuntimeException that occurs when an attempt is made to cast an object to a type (class or interface) of which it is not an instance.       This means the object does not inherently possess the characteristics or methods of the target type. 

      When we inherit any specific property from our parent class,

      Dynamic Binding (Run-time Binding)

Binding means linking a method call to the method code.

Dynamic Binding happens at run-time, not compile-time.

It is also called late binding.

Mainly comes into play with method overriding in inheritance + polymorphism.

 Overriding

Method overriding means:

A child class provides its own implementation of a method that is already defined in the parent class.

The method name, return type, and parameters must be the same.

Decided at run-time (which version of the method runs depends on the actual object).

 How Dynamic Binding Works with Overriding

If a parent class reference points to a child class object,

the child’s overridden method will be called at run-time (not the parent’s version).

 Example in Java:

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // parent reference, child object
        a.sound();              // Output: Dog barks
    }
}

🔹 Explanation

At compile-time, Java sees a as type Animal.

At run-time, a actually refers to a Dog object.

So Dog’s version of sound() is called.

This is dynamic binding (run-time polymorphism).

✅ Key Point:
Dynamic binding ensures flexibility and extensibility. You can write code that works on parent references but actually executes child implementations depending on the object at runtime.

override means we can't redefine! 

if i declare any class final, we can't extends it , if we declare any method final, then we can't override it, if i declare any variable final, we can't change it!
WE CAN'T DECLARE ANY CONSTRUCTOR FINAL !!




