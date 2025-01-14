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

    /**
     * Single Responsibility (單一職責): A class should have one, and only one, responsibility and reason to change.
     * 一個類別應該只有一個職責，即只有一個引起它變化的原因。
     * 如何應用：
     * - 將大型類別拆分成多個小型、功能單一的類別。
     * - 每個類別只負責一件事情。
     */
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

    /**
     * Open-Closed (開閉): A class should be open for extension, but closed for modification.
     * 軟體實體（類別、模組、函數）應該對擴展開放，但對修改封閉。
     * 如何應用：
     * - 使用抽象（介面或抽象類別）來擴展行為，而不是修改現有程式碼。
     * - 新增功能時，避免修改現有的類別。
     */
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

    /**
     * Liskov Substitution (里氏替換): Subtypes should be replaceable by their base types.
     * 子類別應該可以替換掉父類別，並且不會影響程式的正確性。
     * 如何應用：
     * - 確保子類別遵守父類別的契約（行為規範）。
     * - 避免在子類別中覆寫父類別的方法時，改變預期的行為。
     */
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

    /**
     * Interface Segregation (接口隔離): Many specific interfaces are better than a general interface.
     * 客戶端不應該依賴於它們不需要的介面。
     * 如何應用：
     * - 建立小而具體的介面，而不是大而全的介面。
     * - 避免讓類別實作它們不需要的方法。
     */
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

    /**
     * Dependency Inversion (依賴倒置): We must depend on abstractions and not concrete classes.
     * 高層模組不應該依賴低層模組，兩者都應該依賴於抽象。
     * - 如何應用：
     * - 使用依賴注入來解耦類別。
     * - 依賴於介面或抽象類別，而不是具體的實現。
     */
    public static void dependencyInversion() {
        Database mySQLDatabase = new MySQLDatabase();
        GoodUser goodUser = new GoodUser(mySQLDatabase, "Anthony");
        goodUser.save();
    }

    public static void main(String[] args) {
        dependencyInversion();
    }
}
