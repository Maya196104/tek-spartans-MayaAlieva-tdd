package playground;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MoreAboutDataTable {

    @Test(dataProvider = "testingData1")
    public void someTesting(String name, Integer expectedLength) {

        Assert.assertEquals(name.length(), expectedLength, "Name length should match");

    }

    @DataProvider(name = "testingData1")
    public Object[][] testDataWithObject() {
        return new Object[][] {
                {"Alijon", 6},
                {"Salomat", 7},
                {"Mariela", 7}
        };

    }

    @DataProvider
    public Person[] testWithCustomPOJO() {
        return new Person[] {
                new Person("Alijon", 6),
                new Person("Salomat", 7)
        };
    }

    @Test(dataProvider = "testWithCustomPOJO")
    public void someTestingCustomObject(Person person) {

        Assert.assertEquals(person.getName().length(), person.getLength(), "Name length should match");
    }
}