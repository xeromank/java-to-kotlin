package com.group.libraryapp.calculator

import java.lang.Exception

fun main(){
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {

    fun addTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if(calculator.number != 8){
            throw IllegalArgumentException()
        }
//        val expectedCalculator = Calculator(8)
//        if(calculator != expectedCalculator){
//            throw IllegalArgumentException()
//        }
    }

    fun minusTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if(calculator.number != 2){
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if(calculator.number != 15){
            throw IllegalArgumentException()
        }
    }

    fun divideTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if(calculator.number != 2){
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest(){
        // given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0) // expect exception
        }catch (e: IllegalArgumentException){
            if(e.message != "0으로 나눌 수 없습니다."){
                throw throw IllegalArgumentException()
            }
            return
        } catch (e: Exception){
            throw throw IllegalArgumentException()
        }

        throw throw IllegalArgumentException("기대하는 예외가 발생하지 않았습니다.")
    }
}
