package org.example.functions.data;

import org.example.functions.model.ResponseData;

public class DataProvider {
    public static ResponseData getData(String id) {
        // Implement logic to provide data based on the ID
        // You can use switch or if-else statements here to return different data sets
        if ("1343".equals(id)) {
            return SampleData.getDataForId1();
        } else if ("2123".equals(id)) {
            return SampleData.getDataForId2();
        }else if ("3345".equals(id)) {
            return SampleData.getDataForId3();
        }else if ("4563".equals(id)) {
            return SampleData.getDataForId4();
        } else
        {
            return SampleData.getDefaultData();
        }
    }
}
