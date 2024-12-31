package com.test;

import com.non.solid.dependency.inversion.BadUser;
import com.non.solid.interfaces.segregation.BadProgrammer;
import com.non.solid.interfaces.segregation.Worker;
import com.non.solid.liskov.substitution.BadBird;
import com.non.solid.liskov.substitution.BadPenguin;
import com.non.solid.liskov.substitution.Bird;
import com.non.solid.open.closed.BadCircle;
import com.non.solid.open.closed.BadRectangle;
import com.non.solid.open.closed.BadShapeCalculator;
import com.non.solid.single.responsibility.BadEmployee;
import com.solid.dependency.inversion.Database;
import com.solid.dependency.inversion.GoodUser;
import com.solid.dependency.inversion.MySQLDatabase;
import com.solid.interfaces.segregation.GoodMother;
import com.solid.interfaces.segregation.GoodProgrammer;
import com.solid.liskov.substitution.GoodBird;
import com.solid.liskov.substitution.GoodPenguin;
import com.solid.open.closed.GoodCircle;
import com.solid.open.closed.GoodRectangle;
import com.solid.open.closed.GoodShapeCalculator;
import com.solid.open.closed.Shape;
import com.solid.single.responsibility.EmployeeProfile;
import com.solid.single.responsibility.EmployeeStorage;
import com.solid.single.responsibility.GoodEmployee;
import com.solid.single.responsibility.SalaryCalculator;

/**
 * @author anthonylee
 */
public class Main {
    public static void violateSingleResponsibility() {
        BadEmployee employee = new BadEmployee();
        employee.calculateSalary();
        employee.saveToDatabase();
        employee.displayProfile();
    }

    // Single Responsibility: A class should have one, and only one, responsibility and reason to change.
    public static void singleResponsibility() {
        GoodEmployee employee = new GoodEmployee();
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeStorage employeeStorage = new EmployeeStorage();
        EmployeeProfile employeeProfile = new EmployeeProfile();

        salaryCalculator.calculate(employee);
        employeeStorage.save(employee);
        employeeProfile.displayProfile(employee);
    }

    public static void violateOpenClosed() {
        BadRectangle badRectangle = new BadRectangle(5, 10);
        BadCircle badCircle = new BadCircle(5);
        BadShapeCalculator shapeCalculator = new BadShapeCalculator();

        System.out.println("Rectangle Area: " + shapeCalculator.calculateArea(badRectangle));
        System.out.println("Circle Area: " + shapeCalculator.calculateArea(badCircle));
    }

    // Open-Closed: A class should be open for extension, but closed for modification.
    public static void openClosed() {
        Shape goodRectangle = new GoodRectangle(5, 10);
        Shape goodCircle = new GoodCircle(5);
        GoodShapeCalculator shapeCalculator = new GoodShapeCalculator();

        System.out.println("Rectangle Area: " + shapeCalculator.calculateArea(goodRectangle));
        System.out.println("Circle Area: " + shapeCalculator.calculateArea(goodCircle));
    }

    public static void violateLiskovSubstitution() {
        Bird badBird = new BadBird();
        Bird badPenguin = new BadPenguin();

        badBird.eat();
        badPenguin.eat();
        badBird.fly();
        badPenguin.fly();
    }

    // Liskov Substitution: Subtypes should be replaceable by their base types.
    public static void liskovSubstitution() {
        GoodBird goodBird = new GoodBird();
        GoodPenguin goodPenguin = new GoodPenguin();

        goodBird.eat();
        goodPenguin.eat();
        goodBird.fly();
    }

    public static void violateInterfaceSegregation() {
        Worker badProgrammer = new BadProgrammer();
        badProgrammer.code();
        badProgrammer.test();
        badProgrammer.cook();
        badProgrammer.clean();
    }

    // Interface Segregation: Many specific interfaces are better than a general interface.
    public static void interfaceSegregation() {
        GoodProgrammer goodProgrammer = new GoodProgrammer();
        goodProgrammer.code();
        goodProgrammer.test();

        GoodMother goodMother = new GoodMother();
        goodMother.cook();
        goodMother.clean();
    }

    public static void violateDependencyInversion() {
        BadUser badUser = new BadUser("Anthony");
        badUser.save();
    }

    // Dependency Inversion: We must depend on abstractions and not concrete classes.
    public static void dependencyInversion() {
        Database mySQLDatabase = new MySQLDatabase();
        GoodUser goodUser = new GoodUser(mySQLDatabase, "Anthony");
        goodUser.save();
    }

    public static void main(String[] args) {
        dependencyInversion();
    }
}
