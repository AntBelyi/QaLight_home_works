package java_lecture_4;

public class Team {

    private Person[] persons;

    public void addPersonToTeam(Person person) {
        // functionality for adding person to team
    }

    public void displayWholeTeam() {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

}
