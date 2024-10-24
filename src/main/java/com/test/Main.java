package com.test;

import com.non.solid.dependency.inversion.BadUser;
import com.non.solid.interfaces.segregation.BadProgrammer;
import com.non.solid.liskov.substitution.BadBird;
import com.non.solid.liskov.substitution.BadPenguin;
import com.non.solid.open.closed.BadCircle;
import com.non.solid.open.closed.BadRectangle;
import com.non.solid.open.closed.BadShapeCalculator;
import com.non.solid.single.responsibility.BadEmployee;
import com.solid.dependency.inversion.GoodUser;
import com.solid.dependency.inversion.MySQLDatabase;
import com.solid.interfaces.segregation.GoodMother;
import com.solid.interfaces.segregation.GoodProgrammer;
import com.solid.liskov.substitution.GoodBird;
import com.solid.liskov.substitution.GoodPenguin;
import com.solid.open.closed.GoodCircle;
import com.solid.open.closed.GoodRectangle;
import com.solid.open.closed.GoodShapeCalculator;
import com.solid.single.responsibility.EmployeeProfile;
import com.solid.single.responsibility.EmployeeStorage;
import com.solid.single.responsibility.GoodEmployee;
import com.solid.single.responsibility.SalaryCalculator;

/**
 * @author anthonylee
 */
public class Main {
    public static void violateSingleResponsibility() {
        var employee = new BadEmployee();
        employee.calculateSalary();
        employee.saveToDatabase();
        employee.displayProfile();
    }

    public static void singleResponsibility() {
        var employee = new GoodEmployee();
        var salaryCalculator = new SalaryCalculator();
        var employeeStorage = new EmployeeStorage();
        var employeeProfile = new EmployeeProfile();

        salaryCalculator.calculate(employee);
        employeeStorage.save(employee);
        employeeProfile.displayProfile(employee);
    }

    public static void violateOpenClosed() {
        var badRectangle = new BadRectangle(5, 10);
        var badCircle = new BadCircle(5);
        var shapeCalculator = new BadShapeCalculator();

        System.out.println("Rectangle Area: " + shapeCalculator.calculateArea(badRectangle));
        System.out.println("Circle Area: " + shapeCalculator.calculateArea(badCircle));
    }

    public static void openClosed() {
        var goodRectangle = new GoodRectangle(5, 10);
        var goodCircle = new GoodCircle(5);
        var shapeCalculator = new GoodShapeCalculator();

        System.out.println("Rectangle Area: " + shapeCalculator.calculateArea(goodRectangle));
        System.out.println("Circle Area: " + shapeCalculator.calculateArea(goodCircle));
    }

    public static void violateLiskovSubstitution() {
        var badBird = new BadBird();
        var badPenguin = new BadPenguin();

        badBird.eat();
        badPenguin.eat();
        badBird.fly();
        badPenguin.fly();
    }

    public static void liskovSubstitution() {
        var goodBird = new GoodBird();
        var goodPenguin = new GoodPenguin();

        goodBird.eat();
        goodPenguin.eat();
        goodBird.fly();
    }

    public static void violateInterfaceSegregation() {
        var badProgrammer = new BadProgrammer();
        badProgrammer.code();
        badProgrammer.test();
        badProgrammer.cook();
        badProgrammer.clean();
    }

    public static void interfaceSegregation() {
        var goodProgrammer = new GoodProgrammer();
        goodProgrammer.code();
        goodProgrammer.test();

        var goodMother = new GoodMother();
        goodMother.cook();
        goodMother.clean();
    }

    public static void violateDependencyInversion() {
        var badUser = new BadUser("Anthony");
        badUser.save();
    }

    public static void dependencyInversion() {
        var mySQLDatabase = new MySQLDatabase();
        var goodUser = new GoodUser(mySQLDatabase, "Anthony");
        goodUser.save();
    }

    public static void main(String[] args) {
        dependencyInversion();
    }
}
