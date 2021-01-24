package hw6.entities;

import com.epam.jdi.tools.DataClass;
import lombok.Data;

@Data
public class MetalAndColorsTestData extends DataClass<MetalAndColorsTestData> {


    public int[] summary;

    public String[] elements;

    public String color;

    public String metals;

    public String[] vegetables;


}
