1.Why do we need static keyword in java Explain with an Example.
Ans.In Java, static keyword is mainly used for memory management. 
It can be used with variables, methods, blocks and nested classes. 
It is a keyword which is used to share the same variable or method of a given class
Ex:class StaticDemo{
    static int a=10;
    static void display()
    {
      system.out.println("STATIC METHOD");
    }
    public static void main(String() args)
    {
     system.out.println(a);
      display();
     }
     }

2.What is class loading and how does the java program actually executes?
Ans.Class loaders are responsible for loading Java classes dynamically to the JVM (Java Virtual Machine) during runtime.
 They're also part of the JRE (Java Runtime Environment).
 Therefore, the JVM doesn't need to know about the underlying files or file systems in order to run Java programs. 

3.Can we mark a local variable as static.
Ans.Java does not allow static local variables. 

4.Why is the static block executed before the main method in java?
Ans.The static blocks always execute first before the main() method in Java because the compiler stores them in memory at the time of class loading and before the object creation.
 Here, the compiler executes all the static blocks first, and after finishing the static block execution, it invokes the main() method.

5.Why is a static method also called A Class method in java?
Ans.A static method is a method that belongs to a class rather than an instance of a class. This means you can call a static method without creating an object of the class. Static methods are sometimes called class methods.

6.What is the use of static blocks in java?
Ans.Static block in java is used for changing the default value of static variables, initializing static variables of the class, write a set of codes that you want to execute during the class loading in memory.

7.Difference between static and non static variables.
Ans.    STATIC VARIABLE                                                                        NON STATIC VARIABLE
 --Static variables can be accessed using class                             --Non static variables can be accessed using 
     instance of a class                                                            name
 --Static variables can be accessed by static                               --Non static variables cannot be accessed
     inside a static method.                                                         and non static methods
 --Static variables reduce the amount of                                    --Non static variables do not reduce the
     amount of memory used by a program                                               memory used by a program.
 --Static variables are shared among all                                    --Non static variables are specific to that
     instance of a class.                                                           instances of a class.

8.Difference between static and instance members.
Ans. Instance variables	                                                                 Static (class) variables
--Instance variables are declared in a class,                                --Class variables also known as static variables are declared with the static keyword in a class,
 but outside a method, constructor or a block.                                but outside a method, constructor or any block.
--Instance variables are created when an object is created with              --Static variables are created when the program starts and destroyed when the program stops.
the use of the keyword 'new' and destroyed when the object is destroyed.
--Instance variables can be accessed directly by calling the                  --Static variables can be accessed by calling with the class name ClassName.VariableName.
variable name inside the class.However, within static methods 
they should be called using the fully qualified name. 
--Instance variables hold values that must be referenced                     --There would only be one copy of each class variable per class, 
by more than one method,constructor or block, or essential                       regardless of how many objects are created from it.
parts of an object's state that must be present throughout the class.















