package uk.org.windswept.awsplaypen.lambda.handler;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class HelloWorldHandler implements RequestHandler<HelloWorldRequest, HelloWorldResponse>
{
    static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldHandler.class);

    public HelloWorldResponse handleRequest(HelloWorldRequest input, Context context)
    {
        LOGGER.info("handleRequest input:{} context:{}", input, context);
        return new HelloWorldResponse("Hello " + input);
    }
}
