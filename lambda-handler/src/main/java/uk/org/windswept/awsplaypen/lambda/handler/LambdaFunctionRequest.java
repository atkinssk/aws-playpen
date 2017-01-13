package uk.org.windswept.awsplaypen.lambda.handler;

/**
 * Created by 802998369 on 13/01/2017.
 */
public class LambdaFunctionRequest
{
    private String resource;
    private String path;
    private String httpMethod;
    private String body;
    private boolean isBase64Encoded;

    public String getResource()
    {
        return resource;
    }

    public void setResource(String resource)
    {
        this.resource = resource;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String getHttpMethod()
    {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod)
    {
        this.httpMethod = httpMethod;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public boolean isBase64Encoded()
    {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded)
    {
        isBase64Encoded = base64Encoded;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("LambdaFunctionRequest{");
        sb.append("resource='").append(resource).append('\'');
        sb.append(", path='").append(path).append('\'');
        sb.append(", httpMethod='").append(httpMethod).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", isBase64Encoded=").append(isBase64Encoded);
        sb.append('}');
        return sb.toString();
    }
}
