package org.example

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

//membuat kelas calculator test
class CalculatorTest {

    //Membuat method dan menggunakan assertEquals untuk membandingkan 2 data
    @Test
    fun add() {
        val calculator = Calculator()
        val expected = 10
        assertEquals(expected, calculator.add(5, 5))

    }

    //membuat method sub untuk memperbaiki sub method calculator
    @Test
    fun `Test calculator can subtract two numbers`(){
        val calculator = Calculator()
        assertEquals(5, calculator.sub(15, 10))
    }
}