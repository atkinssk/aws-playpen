package uk.org.windswept.awsplaypen.lambda.handler;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldResponse
{
    private String value;

    public HelloWorldResponse(String value)
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
