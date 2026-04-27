package universityCourseStructure;

import java.util.*;

class CourseGroup implements CourseComponent {

    private String name;
    private List<CourseComponent> components = new ArrayList<>();

    public CourseGroup(String name) {
        this.name = name;
    }

    public void add(CourseComponent component) {
        components.add(component);
    }

    public int getCredits() {
        int total = 0;

        for (CourseComponent c : components) {
            total += c.getCredits(); // recursive
        }

        return total;
    }

    public void showDetails() {
        System.out.println("Course Group: " + name);

        for (CourseComponent c : components) {
            c.showDetails();
        }
    }
}