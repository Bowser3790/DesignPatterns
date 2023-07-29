package structuralDP.compositeDP;

// Interview question what is the difference between abstract class and Interface.
// the biggest difference is that with Interface class you are able to extend more than 1 class
// abstract class you are not able to.




import java.util.List;

public abstract class Department {

    // method to return name of department
    abstract String getName();

    // method to return name of Employee
    abstract List<String> getEmployee();
}

/*
notes:

does composite design require the use of an abstract class?

No, the Composite design pattern does not require the use of an abstract class. In fact, the pattern can be
implemented using either abstract classes or interfaces, depending on the specific requirements and design decisions.

The key concept in the Composite pattern is the ability to treat individual objects and compositions of objects
uniformly. This means that both leaf objects (individual objects) and composite objects (compositions of objects)
must adhere to a common interface or abstract class.

Here are two common approaches for implementing the Composite pattern:

1. Abstract Class Approach:
   - Create an abstract class that represents the common interface for both leaf and composite objects.
   - Define common operations and attributes in the abstract class.
   - Leaf objects and composite objects inherit from the abstract class and provide their own implementations.

2. Interface Approach:
   - Define an interface that declares the common operations for leaf and composite objects.
   - Leaf objects and composite objects implement the interface and provide their own implementations.

Both approaches allow you to treat individual objects and compositions of objects uniformly, enabling you to work
with complex structures as if they were individual objects. The choice between using an abstract class or an interface
depends on the specific needs and design considerations of your application.
 */