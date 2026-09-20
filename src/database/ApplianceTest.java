//package database;
//
//import model.Appliance;
//import java.util.List;
//
//public class ApplianceTest {
//
//    public static void main(String[] args) {
//
//        ApplianceDAO dao = new ApplianceDAO();
//
//        List<Appliance> appliances = dao.getAllAppliances();
//
//        for (Appliance appliance : appliances) {
//
//            System.out.println(
//                    appliance.getId() + " | " +
//                            appliance.getName() + " | " +
//                            appliance.getPowerRating() + " W | " +
//                            appliance.getUsageHours() + " Hours"
//            );
//        }
//    }
//}
package database;

import model.Appliance;
import java.util.List;

public class ApplianceTest {

    public static void main(String[] args) {

        ApplianceDAO dao = new ApplianceDAO();

        List<Appliance> appliances =
                dao.getAllAppliances();

        for (Appliance appliance : appliances) {

            System.out.println(
                    appliance.getId()
                            + " | "
                            + appliance.getName()
                            + " | "
                            + appliance.getPowerRating()
                            + " | "
                            + appliance.getUsageHours()
            );
        }
    }
}
