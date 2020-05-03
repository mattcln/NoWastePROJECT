package com.example.nowasteping;

<<<<<<< Updated upstream
import com.example.nowasteping.vue.MainActivity;
=======
>>>>>>> Stashed changes

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLogin {
    private MainActivity mainA;
    @Before
    public void SetUp(){
        mainA = new MainActivity();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void LoginOK(){
        assertEquals(true, mainA.LoginCorrect("nowaste@gmail.com", "1234"));
    }
}
