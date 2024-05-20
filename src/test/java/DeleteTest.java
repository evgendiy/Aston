import baseEntities.RequestSpecificationCreator;
import delete.Root;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class DeleteTest{

    private static RequestSpecification specification;

    @BeforeMethod
    public void setUp() {
        specification = RequestSpecificationCreator
                .getReqSpec("delete");
    }

    @Test
    public void deleteMethod() {
        Root roots = given()
                .spec(specification)
                .when().log().all()
                .delete()
                .then().statusCode(HTTP_OK).log().all()
                .extract().body().as(Root.class);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому");
        softAssert.assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому");
        softAssert.assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому");
        softAssert.assertNotNull(roots.getHeaders().getXAmznTraceId(), "x-amzn-trace-i не должен быть null");
        softAssert.assertEquals(roots.getHeaders().getUserAgent(), "Apache-HttpClient/4.5.13 (Java/17.0.10)", "UserAgent не соответствует ожидаемому");
        softAssert.assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому");
        softAssert.assertNotNull(roots.getHeaders().getAcceptEncoding(), "AcceptEncoding не должен быть null");
        softAssert.assertEquals("application/json", roots.getHeaders().getContentType(), "ContentType не соответствует ожидаемому");
        softAssert.assertEquals("https://postman-echo.com/delete", roots.getUrl(), "url не соответствует ожидаемому");

        softAssert.assertAll();
    }
}
