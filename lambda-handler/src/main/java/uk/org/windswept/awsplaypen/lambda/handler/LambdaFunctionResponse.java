package uk.org.windswept.awsplaypen.lambda.handler;

import java.util.List;

/**
 * Created by 802998369 on 13/01/2017.
 */
public class LambdaFunctionResponse
{
    private int          statusCode;
    private List<Header> headers;
    private String       body;

    public LambdaFunctionResponse(int statusCode, String body)
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

    public List<Header> getHeaders()
    {
        return headers;
    }

    public void setHeaders(List<Header> headers)
    {
        this.headers = headers;
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
        final StringBuilder sb = new StringBuilder("LambdaFunctionResponse{");
        sb.append("statusCode=").append(statusCode);
        sb.append(", headers=").append(headers);
        sb.append(", body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
