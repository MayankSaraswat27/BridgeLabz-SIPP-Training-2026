public class EmployeeBonus {

    static double[][] generateData() {

        double[][] data = new double[10][2];

        for(int i = 0; i < 10; i++) {

            data[i][0] =
                    10000 + (int)(Math.random() * 90000);

            data[i][1] =
                    1 + (int)(Math.random() * 10);
        }

        return data;
    }

    static double[][] calculateBonus(
            double[][] data) {

        double[][] result = new double[10][2];

        for(int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if(years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }

        return result;
    }

    static void display(
            double[][] oldData,
            double[][] newData) {

        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.println(
                "Salary\tYears\tBonus\tNew Salary");

        for(int i = 0; i < oldData.length; i++) {

            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f%n",
                    oldData[i][0],
                    oldData[i][1],
                    newData[i][1],
                    newData[i][0]);

            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("\nTotal Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
        System.out.println("Total Bonus = " + totalBonus);
    }

    public static void main(String[] args) {

        double[][] employees = generateData();

        double[][] updated =
                calculateBonus(employees);

        display(employees, updated);
    }
}