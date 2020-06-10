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
        @param firstName means Students First Name
        @param lastName means Students Last Name
        @param patronymic means Students patronymic
        @param homeAddress means Students Home Address
        @param localAddress means Students Local Address
        @param parentsName means Students Parent Name
        @param parentsAddress means Students Parent Home Address
        @param currentDegree means Students Degree
        @param foreignLanguage means Students Foreign Language
        @param nativeLanguage means Students Native Language
        @param gender means Students Gender
        @param group means Students University Group
        @param nationality means Students Nationality
        @param country means Students Native Country
        @param studentAge means Students Age
        @param universityYear means Students Study Year
        @param phoneNumber means Students Mobile Phone Number
        @param parentsPhoneNumber means Students Parents Mobile Phone Number
        @param studentCardNumber means Students Card Number
        @param height means Students Height
        @param weight means Students Weight
        @param birthday means Students Day Of Birth
        @param speciality means Students University speciality
        @param averageRating means Students Average Rating
        @param isPrivilege means  Is Student Have Privilege
        @param isGrants means  Is Student Have Grants
    */

    private String firstName, lastName, patronymic, homeAddress,
            localAddress, parentsName, parentsAddress,
            currentDegree, foreignLanguage, nativeLanguage,
            gender, group, nationality, country;

    private int studentAge, universityYear, phoneNumber, parentsPhoneNumber,
            studentCardNumber, height, weight;

    private LocalDate birthday;
    private Speciality speciality;
    private double averageRating;
    private boolean isPrivilege, isGrants;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getParentsAddress() {
        return parentsAddress;
    }

    public void setParentsAddress(String parentsAddress) {
        this.parentsAddress = parentsAddress;
    }

    public String getCurrentDegree() {
        return currentDegree;
    }

    public void setCurrentDegree(String currentDegree) {
        this.currentDegree = currentDegree;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(int universityYear) {
        this.universityYear = universityYear;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getParentsPhoneNumber() {
        return parentsPhoneNumber;
    }

    public void setParentsPhoneNumber(int parentsPhoneNumber) {
        this.parentsPhoneNumber = parentsPhoneNumber;
    }

    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(int studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public boolean isPrivilege() {
        return isPrivilege;
    }

    public void setPrivilege(boolean privilege) {
        isPrivilege = privilege;
    }

    public boolean isGrants() {
        return isGrants;
    }

    public void setGrants(boolean grants) {
        isGrants = grants;
    }

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

        public StudentBuilder setFirstName(String firstName) {
            studentToBorn.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            studentToBorn.lastName = lastName;
            return this;
        }

        public StudentBuilder setPatronymic(String patronymic) {
            studentToBorn.patronymic = patronymic;
            return this;
        }


        public StudentBuilder setHomeAddress(String homeAddress) {
            studentToBorn.homeAddress = homeAddress;
            return this;
        }

        public StudentBuilder setLocalAddress(String localAddress) {
            studentToBorn.localAddress = localAddress;
            return this;
        }

        public StudentBuilder setParentsName(String parentsName) {
            studentToBorn.parentsName = parentsName;
            return this;
        }

        public StudentBuilder setParentsAddress(String parentsAddress) {
            studentToBorn.parentsAddress = parentsAddress;
            return this;
        }

        public StudentBuilder setCurrentDegree(String currentDegree) {
            studentToBorn.currentDegree = currentDegree;
            return this;
        }

        public StudentBuilder setForeignLanguage(String foreignLanguage) {
            studentToBorn.foreignLanguage = foreignLanguage;
            return this;
        }

        public StudentBuilder setNativeLanguage(String nativeLanguage) {
            studentToBorn.nativeLanguage = nativeLanguage;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            studentToBorn.gender = gender;
            return this;
        }

        public StudentBuilder setGroup(String group) {
            studentToBorn.group = group;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            studentToBorn.nationality = nationality;
            return this;
        }

        public StudentBuilder setCountry(String country) {
            studentToBorn.country = country;
            return this;
        }

        public StudentBuilder setStudentAge(int studentAge) {
            studentToBorn.studentAge = studentAge;
            return this;
        }

        public StudentBuilder setUniversityYear(int universityYear) {
            studentToBorn.universityYear = universityYear;
            return this;
        }

        public StudentBuilder setPhoneNumber(int phoneNumber) {
            studentToBorn.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setParentsPhoneNumber(int parentsPhoneNumber) {
            studentToBorn.parentsPhoneNumber = parentsPhoneNumber;
            return this;
        }

        public StudentBuilder setStudentCardNumber(int studentCardNumber) {
            studentToBorn.studentCardNumber = studentCardNumber;
            return this;
        }

        public StudentBuilder setHeight(int height) {
            studentToBorn.height = height;
            return this;
        }

        public StudentBuilder setWeight(int weight) {
            studentToBorn.weight = weight;
            return this;
        }

        public StudentBuilder setBirthday(LocalDate birthday) {
            studentToBorn.birthday = birthday;
            return this;
        }

        public StudentBuilder setSpeciality(Speciality speciality) {
            studentToBorn.speciality = speciality;
            return this;
        }

        public StudentBuilder setAverageRating(double averageRating) {
            studentToBorn.averageRating = averageRating;
            return this;
        }

        public StudentBuilder setPrivilege(boolean privilege) {
            studentToBorn.isPrivilege = privilege;
            return this;
        }

        public StudentBuilder setGrants(boolean grants) {
            studentToBorn.isGrants = grants;
            return this;
        }

        public Student build(){
            return studentToBorn;
        }
    }
}
