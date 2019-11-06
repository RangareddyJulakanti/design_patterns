# design_patterns

interface

all methods are default public abstract methods

abstract:

it may contains abstract methods and concrete methods




if logic is common for all child classes and some methods are vary  

//differ logic declare abstract methods
//common logic keep the same method



if logic is vary for all methods in all child classes then you can declare all methods are abstrcat in interface

and implement that interface in your classes



abstract class Country{
 m1(int i){
     //logic same
  }
  abstract int tax(int basic);
}
class A extends Country{
 int tax(int basic){
     //logic differ
  }
  
}


class B extends Country{
  int tax(int basic){
     //logic differ
  }

}
 class C extends Country{
 int tax(int basic){
     //logic differ
  }
}


//method name always tells about policy or functionality how we can is dependns on class

A a=new A();
a.tax(2000);

B b=new B();
b.tax(2000);

Country c=new A();
c.tax();
c.m1();

//parent class reference can hold parent/child object
//by using that reference we can call parent/child methods

List l=new LinkedList<>();
   //  l=new LinkedList();
	 
	 l.add(20);
