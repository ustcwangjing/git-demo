package com.ustc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
//更改4
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
	//变更3
    public void shouldAnswerWithTrue()
    {
		//变更2
        System.out.println("test info");
        assertTrue( true );
		
		//变更1
    }

    //变更4
    @Test
    public void  test2(){
        System.out.println("test info");
        //变更5
    }

}
