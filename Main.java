public class Main {
    public static void main(String[] args) {
        HealthRecord Beth = new HealthRecord(150, 70);
        HealthRecord Bobby = new HealthRecord(170, 65);
        HealthRecord Bryan = new HealthRecord(150,50);
        HealthRecord Bosh = new HealthRecord(100, 40);

        System.out.println("Min Height: " + HealthRecord.minHeight);
        System.out.println("Max Height: " + HealthRecord.maxHeight);
        System.out.println("Min Weight: " + HealthRecord.minWeight);
        System.out.println("Max Weight: " + HealthRecord.maxWeight);
    }
}
