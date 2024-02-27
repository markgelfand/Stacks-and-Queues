public class BathroomChallenge_Gelfand {
    public static void main(String[] args) {
        Bathroom_Gelfand bathroom1 = new Bathroom_Gelfand(3);
        Bathroom_Gelfand bathroom2 = new Bathroom_Gelfand(2);

        Student_Gelfand james = new Student_Gelfand(1, "James", "Washington");
        Student_Gelfand david = new Student_Gelfand(2, "David", "Monte");
        Student_Gelfand charlie = new Student_Gelfand(3, "Charlie", "Jackson");
        Student_Gelfand johnny = new Student_Gelfand(4, "Johnny", "Johnson");
        Student_Gelfand davis = new Student_Gelfand(5, "Davis", "Davidson");
        Student_Gelfand rachel = new Student_Gelfand(6, "Rachel", "Bobson");
        Student_Gelfand chuck = new Student_Gelfand(7, "Chuck", "Gary");
        Student_Gelfand johnSmith = new Student_Gelfand(8, "John", "Smith");
        Student_Gelfand johnDoe = new Student_Gelfand(9, "John", "Doe");
        Student_Gelfand janeDoe = new Student_Gelfand(10, "Jane", "Doe");
        Student_Gelfand janette = new Student_Gelfand(11, "Janette", "Reed");
        Student_Gelfand michele = new Student_Gelfand(12, "Michele", "Mickey");

        bathroom1.addToLine(james);
        bathroom1.addToLine(david);
        bathroom1.addToLine(johnDoe);
        bathroom1.addToLine(johnSmith);
        bathroom1.addToLine(chuck);

        bathroom2.addToLine(janette);
        bathroom2.addToLine(janeDoe);
        bathroom2.addToLine(rachel);
        bathroom2.addToLine(michele);

        System.out.println("Who is in bathroom1: " + (bathroom1.getInBathroom().toString()));
        System.out.println("Who is in bathroom2: " + (bathroom2.getInBathroom().toString()));
        System.out.println("Where is James for bathroom1: " + bathroom1.searchStudent(james));
        System.out.println("Where is Chuck for bathroom1: " + bathroom1.searchStudent(chuck));
        System.out.println("Where is James for bathroom2: " + bathroom2.searchStudent(james));
        System.out.println("Where is Davis for bathroom1: " + bathroom1.searchStudent(davis));

        bathroom1.studentLeaves(james);
        bathroom2.studentLeaves(janeDoe);

        bathroom1.test();
        bathroom2.test();

        bathroom1.clearData();

        bathroom1.test();

        bathroom1.setCapacity(15);
    }


    }

