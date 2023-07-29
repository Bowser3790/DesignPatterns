package structuralDP.compositeDP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HumanResource extends Department{

    List<Department> childDepartments;

    public HumanResource(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().
                map(Department::getName).
                collect(Collectors.joining(", "));


    }

    @Override
    List<String> getEmployee() {
        return childDepartments.stream().
                flatMap(d->d.getEmployee().stream()).collect(Collectors.toList());
    }
}

/*
Certainly! Let's break down the method step by step:

```java
String getName() {
    return childDepartments.stream()
            .map(Department::getName)
            .collect(Collectors.joining(", "));
}
```

1. `childDepartments` is assumed to be a collection (e.g., List) of child departments within the current department.

2. `.stream()` creates a stream of elements from the `childDepartments` collection.

3. `.map(Department::getName)` applies the `getName()` method on each department in the stream.
It transforms each department object into its corresponding name. The result is a stream of department names.

4. `.collect(Collectors.joining(", "))` collects the department names from the stream and joins them into a single
string, separated by a comma and a space (", ").

5. The final result is the concatenated string of department names.

In summary, the `getName()` method retrieves the names of the child departments, transforms them into a stream of
names using `.map()`, collects the names into a single string using `.collect()`, and returns the concatenated string.
The names are separated by a comma and a space.


 --------------------------------------------
 Certainly! Let's break down the method step by step:

```java
List<String> getEmployee() {
    return childDepartments.stream()
            .flatMap(d -> d.getEmployee().stream())
            .collect(Collectors.toList());
}
```

1. `childDepartments` is assumed to be a collection (e.g., List) of child departments within the current department.

2. `.stream()` creates a stream of elements from the `childDepartments` collection.

3. `.flatMap(d -> d.getEmployee().stream())` applies the `getEmployee()` method on each department in the stream.
It transforms each department object into a stream of employee names within that department. The `flatMap` operation
flattens these streams into a single stream of employee names.

4. `.collect(Collectors.toList())` collects the employee names from the stream and stores them in a List.

5. The final result is a List of all the employee names from the child departments.

In summary, the `getEmployee()` method retrieves the employee names from the child departments. It applies the
`getEmployee()` method on each department, flattens the resulting streams of employee names into a single stream using
`flatMap()`, collects the employee names into a List using `.collect()`, and returns the List of employee names.
 */
