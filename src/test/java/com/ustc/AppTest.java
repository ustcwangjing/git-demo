package com.ustc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
		//变更2
        System.out.println("test info");

        assertTrue( true );  //注释1

		
		//变更1
    }

    //变更4
    @Test
    public void  test2(){
        System.out.println("test info");
        //变更5
        assertTrue( true );
		//git reset 测试1
    }

}
