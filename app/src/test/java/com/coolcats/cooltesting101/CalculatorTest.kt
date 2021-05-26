package com.coolcats.cooltesting101

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }


    @Test
    fun `test code to make sure addition works`(){

        assertEquals(10.0, calculator?.addition(7,3))
        assertEquals(19.0, calculator?.addition(7,12))
    }

    @Test
    fun testMultiplication(){

        assertEquals(20.0, calculator?.multiplication(5,4))

    }

    @After
    fun tearDown() {
        calculator = null
    }
}