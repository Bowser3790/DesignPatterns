package structuralDP.compositeDP;

import java.util.Arrays;

/*
In this example:

The Department interface defines the common operations that departments should implement, such as printDepartmentName().
The Finance and Sales classes represent leaf nodes in the composite structure. They implement the Department interface
and provide the specific implementation for printing the department names.

The HumanResource class represents a composite node. It implements the Department interface and contains a list of
sub-departments. It can add or remove sub-departments and also provides an implementation for printing the department
name by recursively calling the printDepartmentName() method on each sub-department.

The CompositeRunner class demonstrates the usage of the composite pattern by creating instances of the leaf nodes
(Finance and Sales) and the composite node (HumanResource). It adds the leaf nodes as sub-departments to the composite
node and calls the printDepartmentName() method on the composite node.
 */

public class CompositeRunner {



    public static void main(String[] args) {
        CompositeRunner runner = new CompositeRunner();
        runner.compositeDemo();


    }

    private void compositeDemo() {
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();

        Department hrDepartment =
                new HumanResource(Arrays.asList(salesDepartment,financeDepartment));

        System.out.println(hrDepartment.getName());
        System.out.println("*************");
        System.out.println(hrDepartment.getEmployee());

    }
}
