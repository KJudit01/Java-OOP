import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CsvParser parser = new CsvParser("c:/docs/people-and-occupations.csv", CsvSeparator.SEMICOLON);
        List<List<String>> csvData = parser.parse();
        List<Employee> validEmployees = new ArrayList<>();
        Validator validator = new Validator();
        for (List<String> entry : csvData) {
            String name = entry.get(0);
            int age = Integer.parseInt(entry.get(1));
            String occupationString = entry.get(2);
            if (validator.isSafe(name) && validator.isSafe(occupationString)) {
                Occupation occupation = getOccupation(occupationString);
                if (occupation != Occupation.UNKNOWN) {
                    validEmployees.add(new Employee(name, age, occupation));
                } else {
                    System.out.println("Unknown occupation: " + occupationString);
                }
            } else {
                System.out.println("Invalid entry " + name + ", " + occupationString);
            }
        }
        for (Employee employee : validEmployees) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Occupation: " + employee.getOccupation());
        }
    }

    private static Occupation getOccupation(String job) {
        switch (job.toLowerCase()) {
            case "carpenter":
                return Occupation.CARPENTER;
            case "singer":
                return Occupation.SINGER;
            case "unemployed":
                return Occupation.UNEMPLOYED;
            case "guard":
                return Occupation.GUARD;
            case "programmer":
                return Occupation.PROGRAMMER;
            case "lawyer":
                return Occupation.LAWYER;
            case "sailor":
                return Occupation.SAILOR;
            case "student":
                return Occupation.STUDENT;
            case "teacher":
                return Occupation.TEACHER;
            case "shoemaker":
                return Occupation.SHOEMAKER;
            case "human resource manager":
                return Occupation.HUMAN_RESOURCE_MANAGER;
            case "nanny":
                return Occupation.NANNY;
            default:
                return Occupation.UNKNOWN;
        }
    }
}
