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

    public MetalAndColorsTestData(int[] summary, String[] elements, String color, String metals, String[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public int[] getSummary() {
        return summary;
    }

    public String[] getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public void setSummary(int[] summary) {
        this.summary = summary;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetals(String metals) {
        this.metals = metals;
    }

    public void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }


}

