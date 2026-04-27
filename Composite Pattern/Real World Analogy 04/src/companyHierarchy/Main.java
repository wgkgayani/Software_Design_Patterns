package companyHierarchy;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer("Alice");
        Developer d2 = new Developer("Bob");
        Manager m = new Manager("John");
        m.add(d1);
        m.add(d2);
        m.showDetails();
    }
}