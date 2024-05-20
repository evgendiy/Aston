import baseEntities.RequestSpecificationCreator;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import post.PostRequest;
import post.Root;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;


public class PostTest {

    private static RequestSpecification specification;

    @BeforeMethod
    static void setUp() {

        specification = RequestSpecificationCreator
                .getReqSpec("post");
    }

    @Test
    public void postMethod() {
        PostRequest postRequest = new PostRequest("value");
        Root roots = given()
                .spec(specification).body(postRequest)
                .when().log().all()
                .post()
                .then().statusCode(HTTP_OK).log().all()
                .extract().body().as(Root.class);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("value", roots.getData().getTest(), "Test не соответствует ожидаемому");
        softAssert.assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому");
        softAssert.assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому");
        softAssert.assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому");
        softAssert.assertNotNull(roots.getHeaders().getXAmznTraceId(), "x-amzn-trace-i не должен быть null");
        softAssert.assertNotNull(roots.getHeaders().getContentLength(), "ContentLength не должен быть null");
        softAssert.assertEquals("Apache-HttpClient/4.5.13 (Java/17.0.10)", roots.getHeaders().getUserAgent(), "UserAgent не соответствует ожидаемому");
        softAssert.assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому");
        softAssert.assertNotNull(roots.getHeaders().getAcceptEncoding(), "AcceptEncoding не должен быть null");
        softAssert.assertEquals("https://postman-echo.com/post", roots.getUrl(), "url не соответствует ожидаемому");

        softAssert.assertAll();
    }
}
