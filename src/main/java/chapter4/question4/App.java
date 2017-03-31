package chapter4.question4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GrandChild g = new GrandChild();

        System.out.println( "my mom told me this story: '" + g.getStory() + "'.");
        System.out.println( "my granma told me this story: '" + g.getStory2() + "'.");
    }
}

class Parent
{
    final private String story = "once apon a time.....something happened";

    public String getStory()
    {

        return story;
    }
}

class Child extends Parent
{
    final private String story2 = "once apon a time.....something else happaned";
    private String story_1 ;

    Child()
    {
        setStory_1();
    }

    public void setStory_1()
    {
        story_1 = getStory();
    }

    public String getStory2()
    {
        return (story2);
    }
    public String getStory_1()
    {
        return (story_1);
    }
}

class GrandChild extends Child
{
    private String story[] = new String[2];

    GrandChild()
    {
        setStories();
    }

    public void tellStories()
    {
        System.out.println(story[0]);
        System.out.println(story[1]);
    }

    public void setStories()
    {
        story[0] = getStory_1();
        story[1] = getStory2();
    }
}