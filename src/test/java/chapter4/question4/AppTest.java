package chapter4.question4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @org.junit.Test
    public void testParent()
    {
        Parent p = new Parent();

        Assert.assertNotNull(p);
    }

    @org.junit.Test
    public void testChild()
    {
        Child c = new Child();

        Assert.assertNotNull(c);
    }

    @org.junit.Test
    public void testGrandChild()
    {
        GrandChild g = new GrandChild();

        Assert.assertNotNull(g);
    }

    @org.junit.Test
    public void testParentStory()
    {
        Parent p = new Parent();

        Assert.assertEquals("once apon a time.....something happened",p.getStory());
    }

    @org.junit.Test
    public void testChildStory()
    {
        Child c = new Child();

        Assert.assertEquals("once apon a time.....something else happaned",c.getStory2());
    }



}
