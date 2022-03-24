package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.*;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerFalse(){
        assertFalse(false);
    }
    @Test
    public void equalSmth(){
        assertNotEquals("leha", "Alex");
    }
}
