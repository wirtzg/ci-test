package hu.wirtz.citest;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gergo on 2017. 03. 07..
 */
public class BarTest {

    @Test
    public void anotherTest(){
        Assert.assertThat("foo", CoreMatchers.containsString("bar"));
    }

    @Test
    public void someVeryImportantTest(){

        Assert.assertThat("ACTUAL", CoreMatchers.equalTo("NOTEXISTING"));

    }

    @Test
    public void throwAnException(){

        throw new IllegalArgumentException("Foo error thrown");

    }
}
