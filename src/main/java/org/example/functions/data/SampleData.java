package org.example.functions.data;

import org.example.functions.model.Certification;
import org.example.functions.model.ResponseData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleData {
    public static ResponseData getDataForId1() {
        ResponseData responseData = new ResponseData();
        responseData.setId("1343");
        responseData.setName("John Doe");
        responseData.setActive(true);
        responseData.setLocations("Novi, MI");

        List<Certification> certifications1 = new ArrayList<>();
        // Add certifications specific to ID 1
        Certification certification1 = new Certification();
        certification1.setId("12345");
        certification1.setName("AWS Practitioner");
        certification1.setCompletedOn("2023-01-01");
        certifications1.add(certification1);

        Certification certification2 = new Certification();
        certification2.setId("67890");
        certification2.setName("AWS Solution Architect");
        certification2.setCompletedOn("2023-02-15");
        certifications1.add(certification2);

        Certification certification3 = new Certification();
        certification3.setId("23423");
        certification3.setName("AWS DevOps Engineer");
        certification3.setCompletedOn("2023-03-20");
        certifications1.add(certification3);
        responseData.setCertifications(certifications1);

        Certification certification4 = new Certification();
        certification3.setId("54321");
        certification3.setName("Google Cloud Associate Cloud Engineer");
        certification3.setCompletedOn("2023-03-20");
        certifications1.add(certification4);
        responseData.setCertifications(certifications1);

        return responseData;
    }

    public static ResponseData getDataForId2() {
        ResponseData responseData = new ResponseData();
        responseData.setId("2123");
        responseData.setName("Jane Smith");
        responseData.setActive(true);
        responseData.setLocations("Seattle, WA");

        List<Certification> certifications2 = new ArrayList<>();
        // Add certifications specific to ID 2
        Certification certification1 = new Certification();
        certification1.setId("12345");
        certification1.setName("AWS Practitioner");
        certification1.setCompletedOn("2023-01-01");
        certifications2.add(certification1);

        Certification certification2 = new Certification();
        certification2.setId("23234");
        certification2.setName("Google Cloud Data Engineer");
        certification2.setCompletedOn("2023-02-15");
        certifications2.add(certification2);

        Certification certification3 = new Certification();
        certification3.setId("54321");
        certification3.setName("Google Cloud Associate Cloud Engineer");
        certification3.setCompletedOn("2023-03-20");
        certifications2.add(certification3);
        // ...
        responseData.setCertifications(certifications2);

        return responseData;
    }
    public static ResponseData getDataForId3() {
        ResponseData responseData = new ResponseData();
        responseData.setId("3345");
        responseData.setName("Claire Dunphy");
        responseData.setActive(true);
        responseData.setLocations("Pasadena, CA");

        List<Certification> certifications3 = new ArrayList<>();
        // Add certifications specific to ID 2
        Certification certification1 = new Certification();
        certification1.setId("12345");
        certification1.setName("AWS Practitioner");
        certification1.setCompletedOn("2023-01-01");
        certifications3.add(certification1);

        Certification certification2 = new Certification();
        certification2.setId("67890");
        certification2.setName("AWS Solution Architect");
        certification2.setCompletedOn("2022-04-15");
        certifications3.add(certification2);

        Certification certification3 = new Certification();
        certification3.setId("54321");
        certification3.setName("Google Cloud Associate Cloud Engineer");
        certification3.setCompletedOn("2023-04-13");
        certifications3.add(certification3);
        Certification certification4 = new Certification();
        certification3.setId("83474");
        certification3.setName("Oracle Cloud Marketing Professional");
        certification3.setCompletedOn("2023-04-13");
        certifications3.add(certification4);
        // ...
        responseData.setCertifications(certifications3);

        return responseData;
    }
    public static ResponseData getDataForId4() {
        ResponseData responseData = new ResponseData();
        responseData.setId("4563");
        responseData.setName("Jay Prichett");
        responseData.setActive(false);
        responseData.setLocations("LosAngeles, CA");

        List<Certification> certifications4 = new ArrayList<>();
        // Add certifications specific to ID 2
        Certification certification1 = new Certification();
        certification1.setId("12345");
        certification1.setName("AWS Practitioner");
        certification1.setCompletedOn("2021-01-01");
        certifications4.add(certification1);
        // ...
        responseData.setCertifications(certifications4);

        return responseData;
    }

    public static ResponseData getDefaultData() {
        ResponseData responseData = new ResponseData();
        responseData.setId("Unknown");
        responseData.setName("Unknown");
        responseData.setActive(false);
        responseData.setLocations("Unknown");
        responseData.setCertifications(Collections.emptyList());

        return responseData;
    }
}
