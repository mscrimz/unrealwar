/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.unrealwar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0533886
 */
public class CSD4464Assignment1UnrealWarTest {
    
    public CSD4464Assignment1UnrealWarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of testEmptyStringShouldReturnEmptyString method, 
     * of class CSD4464Assignment1UnrealWar.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String str = "";
        int i = 2;
        String expResult = "";
        String result = CSD4464Assignment1UnrealWar.stringPower(str, i);
        assertEquals(expResult, result);
    }
    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("stringPower");
        String str = "";
        int i = 0;
        String expResult = null;
        String result = CSD4464Assignment1UnrealWar.stringPower(str, i);
        assertEquals(expResult, result);
    }
    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("stringPower");
        String str = "abc";
        int i = 1;
        String expResult = str;
        String result = CSD4464Assignment1UnrealWar.stringPower(str, i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("stringPower");
        String str = "abc";
        int i = 2;
        String expResult = "abcabc";
        String result = CSD4464Assignment1UnrealWar.stringPower(str, i);
        assertEquals(expResult, result);
    }
    
    
    
       }

