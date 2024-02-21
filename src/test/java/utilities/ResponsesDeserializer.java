//package utilities;
//
//import io.restassured.response.Response;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class ResponsesDeserializer<MyResponseObject> {
//
//    public MyResponseObject deserialize(Response response) {
//        MyResponseObject responseObject = null;
//        try {
//            // Deserialize JSON response to Java object using Jackson
//            ObjectMapper objectMapper = new ObjectMapper();
//            responseObject = objectMapper.readValue(response.getBody().asString(), MyResponseObject.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return responseObject;
//    }
//}
