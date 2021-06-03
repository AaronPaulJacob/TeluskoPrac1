package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {
    @Test
    public void bookingsCountAPI()
    {
        int status_code=404;
        int i=0;
        while(i<5) {
            Response resp = RestAssured.get("https://0efab469-7adf-41c6-9031-568523679be3.mock.pstmn.io/v1/bookings/count");
            status_code = resp.getStatusCode();
            System.out.println("v1/bookings/count");
            System.out.println("\t=> Status code:" + status_code);
            System.out.println("\t=> Response Time:" + resp.getTime() + "ms");

//            String data=resp.asString();
//        System.out.println("\t=> Data Received:"+data);
            i++;
        }
// Get put delete will not create additional looad on server while making multiple calls
// Post -> This can create load on server if made multiple calls

//
        Assert.assertEquals(status_code,200);
    }
}
