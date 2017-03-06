package hu.wirtz.citest;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FooTest {


    @Test
    public void firstTest(){

    }

    @Test
    public void secondTest(){

        Assert.assertThat("ACTUAL", CoreMatchers.equalTo("NOTEXISTING"));

    }

}
