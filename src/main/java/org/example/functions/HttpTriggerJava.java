package org.example.functions;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import org.example.functions.data.DataProvider;
import org.example.functions.model.ResponseData;

/**
 * Azure Functions with HTTP Trigger.
 */
public class HttpTriggerJava {
    /**
     * This function listens at endpoint "/api/HttpTriggerJava". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/HttpTriggerJava
     * 2. curl {your host}/api/HttpTriggerJava?name=HTTP%20Query
     */
    @FunctionName("HttpTriggerJava")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        String query = request.getQueryParameters().get("id");
        String id = request.getBody().orElse(query);

//        ResponseData responseData = new ResponseData();
//        responseData.setId(name);
//        responseData.setName("john Doe");
//        responseData.setActive(true);
//        responseData.setLocations("Novi, MI");
//
//        List<Certification> certifications = new ArrayList<>();
//        for (int i = 0; i < 4; i++) {
//            Certification certification = new Certification();
//            certification.setId("12343");
//            certification.setName("GCP Cloud Engineer");
//            certification.setCompletedOn("");
//            certifications.add(certification);
//        }
//        responseData.setCertifications(certifications);

        if (id == null) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Please provide an 'id' query parameter.").build();
        }

        // Get data from the DataProvider
        ResponseData responseData = DataProvider.getData(id);

        return request.createResponseBuilder(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body(responseData)
                .build();

//        return request.createResponseBuilder(HttpStatus.OK)
//                .header("Content-Type", "application/json")
//                .body(responseData)
//                .build();
    }

    // Helper method to load static data from a JSON file
//    private static List<ResponseData> loadStaticData() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<ResponseData> data = new ArrayList<>();
//        try {
//            InputStream inputStream = Function.class.getResourceAsStream("../../data/data.json");
//            String json = IOUtils.toString(inputStream, "UTF-8");
//            data = objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, ResponseData.class));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return data;
//    }
}
