package uk.org.windswept.awsplaypen.lambda.handler;

import java.util.List;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldResponse
{
    private String       value;

    public HelloWorldResponse(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
