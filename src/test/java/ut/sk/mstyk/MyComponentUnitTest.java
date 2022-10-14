package ut.sk.mstyk;

import org.junit.Test;
import sk.mstyk.api.MyPluginComponent;
import sk.mstyk.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}