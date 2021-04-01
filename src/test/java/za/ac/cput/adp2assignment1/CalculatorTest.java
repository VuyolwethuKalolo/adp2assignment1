/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sinazo Gwabeni 216278015
 */
public class CalculatorTest {
    
    private Calculator calculate;
    
    public CalculatorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.calculate= new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }
    @Test
    public void testAddition(){
    
    int result=calculate.addition(3 , 7);
    assertEquals(10, result);

    }
    @Test
     public void testSubraction(){
    int result=calculate.subraction(7, 3);
    assertEquals(10, result);
     }
}
