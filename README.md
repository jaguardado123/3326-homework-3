# Homework 3

In this homework you will practice working with **composition**, **simple inheritance**, **multiple inheritance**, **chain inheritance**, and **super**.

## Before you start

### Composition

Composition allows one class to access the members of another class by simply having an object of the inner-class as an attribute in the outer-class. Composition can have multiple instances of the inner-class within and this can offer us better control over another class in comparison to inheritance. 

<img src='img/composition.png' width="180px">

Composition only gives the **outer-class** (Car) access to the *public members only* of the **inner-class** (Engine).

**Example:**

```java
public class Engine {
    public String fuel;
    public int cylinders;
}
```

```java
public class Car {
    public String make;
    public Engine engine = new Engine();

    public void about() {
        System.out.println("Make: " + this.make);
        // Has access to Engine public members through engine.
        System.out.println("Fuel: " + engine.fuel);
        System.out.println("Cylinders: " + engine.cylinders);
    }
}
```

To learn more about composition in Java visit: https://dev.to/mohamad_mhana/composition-in-java-building-objects-the-smart-way-3ahm

### Simple Inheritance

Inheritance can be defined as the process where one class can access the members (methods and fields) of another. With the use of inheritance, the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as **subclass** (child class) and the class whose properties are inherited is known as **superclass** (parent class). The subclass can *only access public and protected member*.

<img src="img/simple_inheritance.png" width="300px">

**Example:**

```java
public class Car {
    public String make;
    public String model;
}
```

```java
public class MiniVan extends Car {
    public float seats;
    
    public void about() {
        System.out.println("Seats: " + this.seats);
        // Has access to public & protected members from Car
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
    }
}
```


In simple inheritance, multiple classes can extend to a single class.

<img src="img/simple_inheritance2.png" width="400px">

**Example:**

```java
public class SportsCar extends Car {
    public float max_speed;

    public void about() {
        System.out.println("Max Speed: " + this.max_speed);
        // Also has access to public & protected members from Car
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
    }
}
```

To learn moare about simple inheritance in Java visit: https://www.w3schools.com/java/java_inheritance.asp

### Chain Inheritance 

Chain inheritance follows the same properties as simple inheritance, where one class (subclass) extends to another (superclass), however now we may have that superclass extend to another class to form a chain structure. 

<img src="img/chain_inheritance.png" width="500px">

In this example the child-most class Roadster will inherit both the public & members of SportsCar and Car.

**Example:**

```java
public class Car {
    public String make;
    public String model;
}
```

```java
public class SportsCar extends Car {
    public float max_speed;

    public void about() {
        System.out.println("Max Speed: " + this.max_speed);
        // Has access to public & protected members from Car
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
    }
}
```

```java
public class Roadster extends SportsCar {
    public boolean all_terrain;

    public void about() {
        System.out.println("All Terrain: " + this.all_terrain);
        // Has access to public & protected members from Car & SportsCar
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
        System.out.println("Max Speed: " + super.max_speed);
    }
}
```

### Super Constructor

Definition

**Example:**

```java
public class Car {
    public String make;
    public String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
```

```java
public class Truck extends Car {
    public float bed_size;

    public Truck() {
        // super() calls the parent constructor
        super("n/a", "n/a");
        this.bed_size = 0;
    }
}
```

<br>


### Let's begin!

## Problem 1

### Car Dealership



<br>

## Problem 2

### Student Manager



<br>

## Problem 3

### Custom Vector Class


<br>

## Problem 4

### Something


<br>

## Grading Criteria
| Criteria | Points |
|---|---|
| Problem 1 Car class missing or not packaged | -10 |
| Problem 1 Buyer class missing or not packaged | -10 |
| Problem 2 Student class missing or not packaged | -10 |
| Problem 2 student_id is not static | -20 |
| Problem 3 IntVector class is missing or not packaged | -20 |
| Problem 3 IntVector class methods don't work or have incorrect access modifiers | -30 |
| Problem 4 IntVector class is missing or not packaged | -20 |
| Problem 4 IntVector class methods don't work or have incorrect access modifiers | -30 |

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
