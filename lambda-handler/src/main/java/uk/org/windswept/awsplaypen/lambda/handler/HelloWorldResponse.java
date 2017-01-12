package uk.org.windswept.awsplaypen.lambda.handler;

import java.util.List;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldResponse
{
    private int          statusCode;
    private List<Header> headers;
    private String       body;


    public HelloWorldResponse(int statusCode, String body)
    {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(int statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    @Override
    public String toString()
    {
        return body;
    }

}
