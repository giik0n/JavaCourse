import Interfaces.IGeometry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IGeometry rectangularBox = AbstractFactory.create(10,10,0);
        System.out.println(rectangularBox);

        Student student = new Student.StudentBuilder()
                .setFirstName("Alex")
                .setLastName("Panishchev")
                .setPatronymic("Vadimovich")
                .setHomeAddress("Chop")
                .setLocalAddress("Uzh")
                .setParentsName("Vadim")
                .setParentsAddress("Chop")
                .setCurrentDegree("Bachelor")
                .setForeignLanguage("English")
                .setNativeLanguage("Ukrainian")
                .setGender("Male")
                .setGroup("IPZ")
                .setNationality("Ukrainian")
                .setCountry("Ukraine")
                .setStudentAge(22)
                .setUniversityYear(5)
                .setPhoneNumber(838384775)
                .setParentsPhoneNumber(57676776)
                .setStudentCardNumber(23323243)
                .setHeight(182)
                .setWeight(90)
                .setBirthday(LocalDate.of(1998,06,01))
                .setSpeciality(Speciality.SOFTWARE_ENGINEER)
                .setAverageRating(4.8)
                .setPrivilege(false)
                .setGrants(true)
                .build();
        System.out.printf(student.toString());
    }
}
