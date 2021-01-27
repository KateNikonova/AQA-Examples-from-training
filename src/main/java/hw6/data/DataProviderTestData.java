package hw6.data;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import hw6.entities.MetalAndColorsTestData;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class DataProviderTestData {


    private MetalAndColorsTestData[] getMetalsAndColorsTestDataJson(String filepath) throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader(filepath));
        GsonBuilder builder = new GsonBuilder();
        Map<String, MetalAndColorsTestData> map = builder.create().fromJson(reader,
                new TypeToken<Map<String, MetalAndColorsTestData>>() {
                }.getType());

        return map.values().toArray(new MetalAndColorsTestData[0]);
    }

    @DataProvider
    public Object[][] getMetalsAndColorsTestData() throws FileNotFoundException {

        String filepath = "src/test/resources/hw6/JDI_ex8_metalsColorsDataSet.json";

        List<Object[]> result = new ArrayList<>();

        MetalAndColorsTestData[] metalsAndColorsData = getMetalsAndColorsTestDataJson(filepath);

        for (MetalAndColorsTestData item : metalsAndColorsData) {
            String[] expected = new String[]{
                    "Summary: " + Arrays.stream(item.summary),
                    "Elements: " + Arrays.toString(item.elements)
                            .replaceAll("\\[", "")
                            .replaceAll("]", ""),
                    "Color: " + item.color,
                    "Metal: " + item.metals,
                    "Vegetables: " + Arrays.toString(item.vegetables)
                            .replaceAll("\\[", "")
                            .replaceAll("]", "")
            };
            result.add(new Object[]{item});
        }

        return result.toArray(new Object[0][0]);
    }


}
