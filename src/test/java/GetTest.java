import baseEntities.RequestSpecificationCreator;
import get.Root;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;


public class GetTest {    //через раз
    private static RequestSpecification specification;

    @BeforeMethod
    public void setUp() {
        specification = RequestSpecificationCreator
                .getReqSpec("get");
    }

    @Test
    public void getMethod() {
        Root roots = given()
                .params(Map.of("foo1", "bar1", "foo2", "bar2"))
                .spec(specification)
                .when()
                .get()
                .then().log().all().statusCode(HTTP_OK)
                .extract().body().as(Root.class);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(roots.getArgs().getFoo1(), "bar1", "foo1 не соответствует ожидаемому");
        softAssert.assertEquals(roots.getArgs().getFoo2(), "bar2", "foo2 не соответствует ожидаемому");
        softAssert.assertEquals(roots.getHeaders().getXForwardedProto(), "https", "XForwardedProto не соответствует ожидаемому");
        softAssert.assertEquals(roots.getHeaders().getXForwardedPort(), "443", "XForwardedPort не соответствует ожидаемому");
        softAssert.assertEquals(roots.getHeaders().getHost(), "postman-echo.com", "Host не соответствует ожидаемому");
        softAssert.assertNotNull(roots.getHeaders().getXAmznTraceId(), "x-amzn-trace-id не должен быть null");
        softAssert.assertEquals(roots.getHeaders().getUserAgent(), "Apache-HttpClient/4.5.13 (Java/17.0.10)", "UserAgent не соответствует ожидаемому");
        softAssert.assertEquals(roots.getHeaders().getAccept(), "*/*", "Accept не соответствует ожидаемому");
        softAssert.assertEquals(roots.getUrl(), "https://postman-echo.com/get?foo1=bar1&foo2=bar2", "url не соответствует ожидаемому");

        softAssert.assertAll();
    }
}
