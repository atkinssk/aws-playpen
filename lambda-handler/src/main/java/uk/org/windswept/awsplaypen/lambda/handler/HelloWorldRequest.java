package uk.org.windswept.awsplaypen.lambda.handler;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldRequest
{
    // TODO need to make this be like teh HTTP request structure https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-set-up-simple-proxy.html#api-gateway-simple-proxy-for-lambda-output-format
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
