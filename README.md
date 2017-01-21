# aws-playpen

## Create function

`aws lambda create-function
--function-name LambdaHandler
--runtime java8
--description "Generic Lambda Handler"
--role arn:aws:iam::885989190310:role/service-role/HelloWorldRole
--handler uk.org.windswept.awsplaypen.lambda.handler.LambdaFunctionHandler::handleRequest
--zip-file fileb://lambda-handler/target/aws-playpen-lambda-handler-1.0-SNAPSHOT-shaded.jar`

## Delete function
`aws lambda delete-function --function-name LambdaHandler`

## Update function code

`aws lambda update-function-code
--function-name LambdaHandler
--zip-file fileb://lambda-handler/target/aws-playpen-lambda-handler-1.0-SNAPSHOT-shaded.jar`

## Create API

`aws apigateway create-rest-api
--name LambdaHandler
--description "Generic Lambda Handler"`

`aws apigateway create-deployment
--rest-api-id yk3em0ont8
--stage-name prod `

