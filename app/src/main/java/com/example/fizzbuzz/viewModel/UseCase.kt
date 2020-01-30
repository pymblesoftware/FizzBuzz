package com.example.fizzbuzz.viewModel

object UseCase {

    /***
    When a number is a multiple of 3 the number should be replaced with “Fizz”
    When a number is a multiple of 5 the number should be replaced with “Buzz”
    When a number is a multiple of 3 and 5 the number should be replaced with “FizzBuzz”
    When a number is neither a multiple of 3 nor a multiple of 5 the number should be returned unchanged.

    The numbers and words should be configurable and more than 2 numbers should be possible.
    Example configuration:
    3: Fizzy
    5: Buzzy
    7: Foo

    This config should output the following for numbers:
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
    ***/

    fun calc( i : Int ) : String {
        var result : String = ""

        if( i % 3 == 0 ) {
            result = "Fizzy"
        }
        if( i % 5 == 0 ) {
            result += "Buzzy"
        }
        if( i % 7 == 0 ) {
            result += "Foo"
        }
        if( result == "" ) {
            result = "${i}"
        }

        return result
    }
}