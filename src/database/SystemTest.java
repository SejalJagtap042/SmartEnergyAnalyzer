package database;

import model.Appliance;
import service.SmartSuggestion;

import java.util.ArrayList;
import java.util.List;

public class SystemTest {

    public static void main(String[] args) {

        List<Appliance> appliances =
                new ArrayList<>();

        appliances.add(
                new Appliance(
                        1,
                        "AC",
                        1500,
                        8
                )
        );

        SmartSuggestion.generateSuggestions(
                appliances
        );
    }
}