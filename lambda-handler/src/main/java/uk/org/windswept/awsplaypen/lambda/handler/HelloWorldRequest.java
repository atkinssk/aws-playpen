package uk.org.windswept.awsplaypen.lambda.handler;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldRequest
{
    private String value;

    public HelloWorldRequest()
    {
    }

    public HelloWorldRequest(String value)
    {
        this.value = value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}
