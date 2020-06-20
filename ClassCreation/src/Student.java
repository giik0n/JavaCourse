import java.time.LocalDate;

public class Student {

    /*
        * @author Alexander Panishchev
        * @since 10-06-2020
        * @version 1.4
        *Task:
        * Develop for your class
            3. Create a class Student  - 25 fields.
            4. Create a builder for the class Student.
    */

    private String firstName; //Students First Name
    private String lastName; //Students Last Name
    private String patronymic; //Students patronymic
    private String homeAddress; //Students Home Address
    private String localAddress; //Students Local Address
    private String parentsName; //Students Parent Name
    private String parentsAddress; //Students Parent Home Address
    private String currentDegree; //Students Degree
    private String foreignLanguage; //Students Foreign Language
    private String nativeLanguage; //Students Native Language
    private String gender; //Students Gender
    private String group; //Students University Group
    private String nationality; //Students Nationality
    private String country; //Students Native Country

    private int studentAge; //Students Age
    private int universityYear; //Students Study Year
    private int phoneNumber; //Students Mobile Phone Number
    private int parentsPhoneNumber; //Students Parents Mobile Phone Number
    private int studentCardNumber; //Students Card Number
    private int height; //Students Height
    private int weight; //Students Weight

    private LocalDate birthday; //Students Day Of Birth
    private Speciality speciality; //Students University speciality
    private double averageRating; //Students Average Rating
    private boolean isPrivilege; //Is Student Have Privilege
    private  boolean isGrants; //Is Student Have Grants

    //@return Student First Name
    public String getFirstName() {
        return firstName;
    }

    // @param firstName means Students First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //@return Student Last Name
    public String getLastName() {
        return lastName;
    }

    //@param lastName means Students Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //@return Student Patronymic
    public String getPatronymic() {
        return patronymic;
    }

    //@param patronymic means Students patronymic
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    //@return Student Home Address
    public String getHomeAddress() {
        return homeAddress;
    }

    //@param homeAddress means Students Home Address
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    ////@return Student Local Address
    public String getLocalAddress() {
        return localAddress;
    }

    //@param localAddress means Students Local Address
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    //@return Student Parents Name
    public String getParentsName() {
        return parentsName;
    }

    //@param parentsName means Students Parent Name
    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    //@return Student Parents Address
    public String getParentsAddress() {
        return parentsAddress;
    }

    //@param parentsAddress means Students Parent Home Address
    public void setParentsAddress(String parentsAddress) {
        this.parentsAddress = parentsAddress;
    }

    //@return Student Degree
    public String getCurrentDegree() {
        return currentDegree;
    }

    //@param currentDegree means Students Degree
    public void setCurrentDegree(String currentDegree) {
        this.currentDegree = currentDegree;
    }

    //@return Student Foreign Language
    public String getForeignLanguage() {
        return foreignLanguage;
    }

    //@param foreignLanguage means Students Foreign Language
    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    //@return Student Native Language
    public String getNativeLanguage() {
        return nativeLanguage;
    }

    //@param nativeLanguage means Students Native Language
    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    //@return Student Gender
    public String getGender() {
        return gender;
    }

    //@param gender means Students Gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    //@return Student Group
    public String getGroup() {
        return group;
    }

    //@param group means Students University Group
    public void setGroup(String group) {
        this.group = group;
    }

    //@return Student Nationality
    public String getNationality() {
        return nationality;
    }

    //@param nationality means Students Nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //@return Student Country
    public String getCountry() {
        return country;
    }

    //@param country means Students Native Country
    public void setCountry(String country) {
        this.country = country;
    }

    //@return Student Age
    public int getStudentAge() {
        return studentAge;
    }

    //@param studentAge means Students Age
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    //@return Student Studying Year
    public int getUniversityYear() {
        return universityYear;
    }

    //@param universityYear means Students Study Year
    public void setUniversityYear(int universityYear) {
        this.universityYear = universityYear;
    }

    //@return Student Mobile Number
    public int getPhoneNumber() {
        return phoneNumber;
    }

    //@param phoneNumber means Students Mobile Phone Number
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //@return Student Parents Mobile Number
    public int getParentsPhoneNumber() {
        return parentsPhoneNumber;
    }

    //@param parentsPhoneNumber means Students Parents Mobile Phone Number
    public void setParentsPhoneNumber(int parentsPhoneNumber) {
        this.parentsPhoneNumber = parentsPhoneNumber;
    }

    //@return Student Card Number
    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    //@param studentCardNumber means Students Card Number
    public void setStudentCardNumber(int studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    //@return Student Height
    public int getHeight() {
        return height;
    }

    //@param height means Students Height
    public void setHeight(int height) {
        this.height = height;
    }

    //@return Student Weight
    public int getWeight() {
        return weight;
    }

    //@param weight means Students Weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //@return Student Birthday
    public LocalDate getBirthday() {
        return birthday;
    }

    //@param birthday means Students Day Of Birth
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //@return Student Speciality
    public Speciality getSpeciality() {
        return speciality;
    }

    //@param speciality means Students University speciality
    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    //@return Student Average Rating
    public double getAverageRating() {
        return averageRating;
    }

    //@param averageRating means Students Average Rating
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    //@return Student Privilege
    public boolean isPrivilege() {
        return isPrivilege;
    }

    //@param isPrivilege means Is Student Have Privilege
    public void setPrivilege(boolean privilege) {
        isPrivilege = privilege;
    }

    //@return Student Grants
    public boolean isGrants() {
        return isGrants;
    }

    //@param isGrants means  Is Student Have Grants
    public void setGrants(boolean grants) {
        isGrants = grants;
    }


    //@return Student parameters in String
    @Override
    public String toString() {
        return "Student{" +
                "\n firstName='" + firstName + '\'' +
                ", \n   lastName='" + lastName + '\'' +
                ", \n   patronymic='" + patronymic + '\'' +
                ", \n   homeAddress='" + homeAddress + '\'' +
                ", \n   localAddress='" + localAddress + '\'' +
                ", \n   parentsName='" + parentsName + '\'' +
                ", \n   parentsAddress='" + parentsAddress + '\'' +
                ", \n   currentDegree='" + currentDegree + '\'' +
                ", \n   foreignLanguage='" + foreignLanguage + '\'' +
                ", \n   nativeLanguage='" + nativeLanguage + '\'' +
                ", \n   gender='" + gender + '\'' +
                ", \n   group='" + group + '\'' +
                ", \n   nationality='" + nationality + '\'' +
                ", \n   country='" + country + '\'' +
                ", \n   studentAge=" + studentAge +
                ", \n   universityYear=" + universityYear +
                ", \n   phoneNumber=" + phoneNumber +
                ", \n   parentsPhoneNumber=" + parentsPhoneNumber +
                ", \n   studentCardNumber=" + studentCardNumber +
                ", \n   height=" + height +
                ", \n   weight=" + weight +
                ", \n   birthday=" + birthday +
                ", \n   speciality=" + speciality +
                ", \n   averageRating=" + averageRating +
                ", \n   isPrivilege=" + isPrivilege +
                ", \n   isGrants=" + isGrants +
                "\n}";
    }

    public static class StudentBuilder{

        private Student studentToBorn;

        public StudentBuilder(){
            this.studentToBorn = new Student();
        }

        // @param student means object of class Student
        public StudentBuilder setSimilarTo(Student student){
            this.studentToBorn.firstName = student.firstName;
            this.studentToBorn.lastName = student.lastName;
            this.studentToBorn.patronymic = student.patronymic;
            this.studentToBorn.homeAddress = student.homeAddress;
            this.studentToBorn.localAddress = student.localAddress;
            this.studentToBorn.parentsName = student.parentsName;
            this.studentToBorn.parentsAddress = student.parentsAddress;
            this.studentToBorn.currentDegree = student.currentDegree;
            this.studentToBorn.foreignLanguage = student.foreignLanguage;
            this.studentToBorn.nativeLanguage = student.nativeLanguage;
            this.studentToBorn.gender = student.gender;
            this.studentToBorn.group = student.group;
            this.studentToBorn.nationality = student.nationality;
            this.studentToBorn.country = student.country;
            this.studentToBorn.studentAge = student.studentAge;
            this.studentToBorn.universityYear = student.universityYear;
            this.studentToBorn.phoneNumber = student.phoneNumber;
            this.studentToBorn.parentsPhoneNumber = student.parentsPhoneNumber;
            this.studentToBorn.studentCardNumber = student.studentCardNumber;
            this.studentToBorn.birthday = student.birthday;
            this.studentToBorn.speciality = student.speciality;
            this.studentToBorn.averageRating = student.averageRating;
            this.studentToBorn.isPrivilege = student.isPrivilege;
            this.studentToBorn.isGrants = student.isGrants;
            return this;
        }

        // @param firstName means Students First Name
        public StudentBuilder setFirstName(String firstName) {
            studentToBorn.firstName = firstName;
            return this;
        }

        //@param lastName means Students Last Name
        public StudentBuilder setLastName(String lastName) {
            studentToBorn.lastName = lastName;
            return this;
        }

        //@param patronymic means Students patronymic
        public StudentBuilder setPatronymic(String patronymic) {
            studentToBorn.patronymic = patronymic;
            return this;
        }

        //@param homeAddress means Students Home Address
        public StudentBuilder setHomeAddress(String homeAddress) {
            studentToBorn.homeAddress = homeAddress;
            return this;
        }

        //@param localAddress means Students Local Address
        public StudentBuilder setLocalAddress(String localAddress) {
            studentToBorn.localAddress = localAddress;
            return this;
        }

        //@param parentsName means Students Parent Name
        public StudentBuilder setParentsName(String parentsName) {
            studentToBorn.parentsName = parentsName;
            return this;
        }

        //@param parentsAddress means Students Parent Home Address
        public StudentBuilder setParentsAddress(String parentsAddress) {
            studentToBorn.parentsAddress = parentsAddress;
            return this;
        }

        //@param currentDegree means Students Degree
        public StudentBuilder setCurrentDegree(String currentDegree) {
            studentToBorn.currentDegree = currentDegree;
            return this;
        }

        //@param foreignLanguage means Students Foreign Language
        public StudentBuilder setForeignLanguage(String foreignLanguage) {
            studentToBorn.foreignLanguage = foreignLanguage;
            return this;
        }

        //@param nativeLanguage means Students Native Language
        public StudentBuilder setNativeLanguage(String nativeLanguage) {
            studentToBorn.nativeLanguage = nativeLanguage;
            return this;
        }

        //@param gender means Students Gender
        public StudentBuilder setGender(String gender) {
            studentToBorn.gender = gender;
            return this;
        }

        //@param group means Students University Group
        public StudentBuilder setGroup(String group) {
            studentToBorn.group = group;
            return this;
        }

        //@param nationality means Students Nationality
        public StudentBuilder setNationality(String nationality) {
            studentToBorn.nationality = nationality;
            return this;
        }

        //@param country means Students Native Country
        public StudentBuilder setCountry(String country) {
            studentToBorn.country = country;
            return this;
        }

        //@param studentAge means Students Age
        public StudentBuilder setStudentAge(int studentAge) {
            studentToBorn.studentAge = studentAge;
            return this;
        }

        //@param universityYear means Students Study Year
        public StudentBuilder setUniversityYear(int universityYear) {
            studentToBorn.universityYear = universityYear;
            return this;
        }

        //@param phoneNumber means Students Mobile Phone Number
        public StudentBuilder setPhoneNumber(int phoneNumber) {
            studentToBorn.phoneNumber = phoneNumber;
            return this;
        }

        //@param parentsPhoneNumber means Students Parents Mobile Phone Number
        public StudentBuilder setParentsPhoneNumber(int parentsPhoneNumber) {
            studentToBorn.parentsPhoneNumber = parentsPhoneNumber;
            return this;
        }

        //@param studentCardNumber means Students Card Number
        public StudentBuilder setStudentCardNumber(int studentCardNumber) {
            studentToBorn.studentCardNumber = studentCardNumber;
            return this;
        }

        //@param height means Students Height
        public StudentBuilder setHeight(int height) {
            studentToBorn.height = height;
            return this;
        }

        //@param weight means Students Weight
        public StudentBuilder setWeight(int weight) {
            studentToBorn.weight = weight;
            return this;
        }

        //@param birthday means Students Day Of Birth
        public StudentBuilder setBirthday(LocalDate birthday) {
            studentToBorn.birthday = birthday;
            return this;
        }

        //@param speciality means Students University speciality
        public StudentBuilder setSpeciality(Speciality speciality) {
            studentToBorn.speciality = speciality;
            return this;
        }

        //@param averageRating means Students Average Rating
        public StudentBuilder setAverageRating(double averageRating) {
            studentToBorn.averageRating = averageRating;
            return this;
        }

        //@param isPrivilege means Is Student Have Privilege
        public StudentBuilder setPrivilege(boolean privilege) {
            studentToBorn.isPrivilege = privilege;
            return this;
        }

        //@param isGrants means  Is Student Have Grants
        public StudentBuilder setGrants(boolean grants) {
            studentToBorn.isGrants = grants;
            return this;
        }

        //@return object of class Student
        public Student build(){
            return studentToBorn;
        }
    }
}
