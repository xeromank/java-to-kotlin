package com.group.libraryapp.calculator

import org.junit.jupiter.api.*

class JUnitTest {

    companion object{

        @JvmStatic
        @BeforeAll
        fun beforeAll(){
            println("before all run")
        }

        @JvmStatic
        @AfterAll
        fun afterAll(){
            println("after all run")
        }
    }



    @BeforeEach
    fun beforeEach(){
        println("before run")
    }

    @AfterEach
    fun afterEach(){
        println("after run")
    }

    @Test
    fun test1(){
        println("test 1")
    }

    @Test
    fun test2(){
        println("test 2")
    }
}
