package uk.org.windswept.awsplaypen.lambda.handler;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by 802998369 on 12/01/2017.
 */
public class LambdaFunctionHandler implements RequestHandler<LambdaFunctionRequest, LambdaFunctionResponse>
{
    static final Logger LOGGER = LoggerFactory.getLogger(LambdaFunctionHandler.class);

    public LambdaFunctionResponse handleRequest(LambdaFunctionRequest input, Context context)
    {
        LOGGER.info("handleRequest input:{} context:{}", input, context);
        return new LambdaFunctionResponse(200, new Date().toString());
    }
}
