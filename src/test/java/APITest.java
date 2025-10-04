import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.*;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertFalse;

public class APITest {
    public static void main(String[] args) {

        File jsonFile=new File(System.getProperty("user.dir")+"/src/test/java/jsonFiles/"+"test.json");
        System.out.println(jsonFile);
//        Response response=given()
//                .when()
//                .get("https://api.restful-api.dev/objects");
//        System.out.println(response.getStatusCode());
//        System.out.println(response.asPrettyString());
//        System.out.println(response.getBody().jsonPath().getString("[1].name"));
//        ValidatableResponse resp = response.then();
//
//        resp.body("[1].name",Matchers.containsString("Apple iPhone 12 Mini, 256GB, Blue"));

        Response resp=given()
                .headers("Content-Type","application/Json")

        .body(jsonFile)
                .when().post("https://api.restful-api.dev/objects");
//                .then().statusCode(200);
        System.out.println(resp.asPrettyString());


//       Response response= given()
//                .when().get("https://api.restful-api.dev/objects");
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getTime());
//        response.then().time(lessThan(2000L));//hamcrest matcher
////        response.then().log().all();
//        System.out.println("----------pretty print------");
//        response.prettyPrint();
//        String lst=response.jsonPath().getString("[2].name");
//        System.out.println("-------namelist------"+lst);
////       response.then().body("$",hasKey("name"));
////        response.then().body("[12].name",equalToIgnoringCase("Google Pixel 6 Pro"));
//
//        JSONArray arr=new JSONArray(response.asPrettyString());
////        for(int i=0;i<=arr.length()-1;i++){
//        Map<String,String> map=new HashMap<>();
////        map.put("name","Apple iPad Air");
//        map.put("name","TestApple iPad Air");
//     Set<Map.Entry<String,String>> mapEntryset=map.entrySet();
//        System.out.println(arr.length());//***************always use () for JSONArray length
////        JSONObject obj=arr.getJSONObject(i);
//        for(Map.Entry<String,String> node:map.entrySet()){
//            String jsonPath=node.getKey();
//            String expjsonValue=node.getValue();
////            Object actualJsonValue=obj.get(jsonPath);
////            if(expjsonValue.contains(actualJsonValue.toString())){
////               assertThat(actualJsonValue.toString(),CoreMatchers.containsString(expjsonValue));
////            }else{
////                assertFalse(false);
////            }
//            String actJsonvalue=response.getBody().jsonPath().get(jsonPath).toString();
//           assertThat(expjsonValue, Matchers.containsString(actJsonvalue));

        }
        }



