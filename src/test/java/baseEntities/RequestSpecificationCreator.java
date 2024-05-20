package baseEntities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationCreator {

    public static RequestSpecification getReqSpec(String path) {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://postman-echo.com/")
                .setBasePath(path)
                .setContentType(ContentType.JSON)
                .build();
        return requestSpecification;
    }
}
