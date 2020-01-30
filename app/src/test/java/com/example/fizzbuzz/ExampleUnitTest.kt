package com.example.fizzbuzz

import com.example.fizzbuzz.viewModel.UseCase
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    /**
     *
     *  This config should output the following for numbers:
        1 = 1
        2 = 2
        3 = Fizzy
        4 = 4
        5 = Buzzy
        6 = Fizzy
        7 = Foo
        8 = 8
        9 = Fizzy
        ...
        15 = FizzyBuzzy
        21 = FizzyFoo
        35 = BuzzyFoo
        105 = FizzyBuzzyFoo
     *
     **/


    @Test
    fun useCaseOne() {
        assertEquals( "1", UseCase.calc(1))
    }
    @Test
    fun useCaseTwo() {
        assertEquals( "2", UseCase.calc(2))

    }
    @Test
    fun useCaseThree() {
        assertEquals( "Fizzy", UseCase.calc(3))

    }
    @Test
    fun useCaseFour() {
        assertEquals( "4", UseCase.calc(4))

    }
    @Test
    fun useCaseFive() {
        assertEquals( "Buzzy", UseCase.calc(5))

    }
    @Test
    fun useCaseSix() {
        assertEquals( "Fizzy", UseCase.calc(6))

    }
    @Test
    fun useCaseSeven() {
        assertEquals( "Foo", UseCase.calc(7))

    }

    @Test
    fun useCaseEight() {
        assertEquals( "8", UseCase.calc(8))

    }

    @Test
    fun useCaseNine() {
        assertEquals( "Fizzy", UseCase.calc(9))

    }

    @Test
    fun useCaseFifteen() {
        assertEquals( "FizzyBuzzy", UseCase.calc(15))

    }

    @Test
    fun useCaseTwentyOne() {
        assertEquals( "FizzyFoo", UseCase.calc(21))

    }

    @Test
    fun useCaseThirtyFive() {
        assertEquals( "BuzzyFoo", UseCase.calc(35))

    }

    @Test
    fun useCaseOneOhFive() {
        assertEquals( "FizzyBuzzyFoo", UseCase.calc(105))
    }


}
