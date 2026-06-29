interface Trackable {

    void logActivity();

    // Default method
    default void resetData() {
        System.out.println("Activity data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    String userName;

    FitnessDevice(String userName) {
        this.userName = userName;
    }

    @Override
    public void logActivity() {
        System.out.println(userName + " logged today's workout.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report:");
        System.out.println("Steps: 10,000");
        System.out.println("Calories Burned: 550");
        System.out.println("Workout Time: 60 minutes");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice("Mayank");

        device.logActivity();
        device.generateReport();
        device.sendAlert();

        // Calling default method from interface
        device.resetData();

        System.out.println();

        // Demonstrating interface references
        Trackable t = device;
        Reportable r = device;
        Notifiable n = device;

        t.logActivity();
        r.generateReport();
        n.sendAlert();
    }
}