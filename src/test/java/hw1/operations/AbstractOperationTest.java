package hw1.operations;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class AbstractOperationTest {

    protected Calculator calculator;

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("before method");
        calculator = new Calculator();
    }

    @AfterMethod
   public void tearDown() {
        System.out.println("after method");
        calculator = null;
   }

    @AfterTest
 public void afterTest() {
        System.out.println("after test");
   }
}