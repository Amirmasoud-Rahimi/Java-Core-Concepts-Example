package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        Country country1 = new Country(80000L, "Iran", 16.2D);
        Country country2 = new Country(55000L, "Armenia", 15.4D);
        Country country3 = new Country(100000L, "Turkey", 20.0D);
        Country country4 = new Country(7000L, "Germany", 18.8D);

        List<Country> countryList = new ArrayList<Country>() {{
            add(country1);
            add(country2);
            add(country3);
            add(country4);
        }};

        System.out.println("Before Sort");
        System.out.println(countryList);

        countryList.sort(new compareByName());
        System.out.println("After Sort by name");
        System.out.println(countryList);

        System.out.println("define compareByPopulation using functional Interface(Method reference)");
        countryList.sort(Comparator.comparingLong(Country::getPopulation));
        System.out.println("After Sort by population");
        System.out.println(countryList);

        System.out.println("define compareByArea using functional Interface(Lambda expression)");
        countryList.sort((o1, o2) -> Double.compare(o1.getArea(), o2.getArea()));
        System.out.println("After Sort by area");
        System.out.println(countryList);
    }
}