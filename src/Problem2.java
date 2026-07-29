// Import your classes here

public class Problem2 {

    public static void main(String[] args) {

        // This could be written better...
        // Refactor this code ASAP!

        // The school_id will be the same for all students.
        String school_id = "utrgv@ut_systems";

        // Student 1
        String student1_name = "Bob Bobbert";
        String student1_email = "bob@utrgv.edu";
        String student1_school_id = school_id;
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student1_name, student1_email, student1_school_id);

        // Student 2
        String student2_name = "Carl Carlton";
        String student2_email = "carl@utrgv.edu";
        String student2_school_id = school_id;
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student2_name, student2_email, student2_school_id);

        // Student 3
        String student3_name = "Jane Janeson";
        String student3_email = "jane@utrgv.edu";
        String student3_school_id = school_id;
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student3_name, student3_email, student3_school_id);

        // School ID Update!!! Texas A&M says UTRGV is theirs!
        school_id = "utrgv@tam_systems";

        // Reprint Student info!
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student1_name, student1_email, student1_school_id);
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student2_name, student2_email, student2_school_id);
        System.out.printf("Name: %s, Email: %s, School ID: %s \n", student3_name, student3_email, student3_school_id);
    }
}