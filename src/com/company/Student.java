package com.company;

import java.time.LocalDate;
/*
 * Classname : Student
 * Description : Class Students. Contains builder pattern.
 *
 * @version 1.0 2020.06.15
 * @author Khnyznytskyj Evgen
 *
 * Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4.  Create a builder for the class Student
*/
public  class Student {
    
    private int id;
    private String name;
    private String lastName;
    private float height;
    private float weight;
    private String gender;
    private LocalDate birthday;
    private float averageScore;
    private String education;
    private String testNumber;
    private String numberOfGroup;
    private String courseTitle;
    private String nameOfDepartments;
    private String NameOfTheInstitute;
    private String nameOfTheUniversity;
    private boolean involvementInSportsSections;
    private String theNameOfTheSport;
    private String phoneNumber;
    private String fatherName;
    private String fatherLastName;
    private String fatherPhoneNumber;
    private String homeAddress;
    private String residence;
    private boolean residentOfDormitory;
    private boolean beneficiary;
    private boolean onFreeVisit;

    public Student(int id, String name, String lastName, float height, float weight, String gender, LocalDate birthday, float averageScore, String education, String testNumber, String numberOfGroup, String courseTitle, String nameOfDepartments, String nameOfTheInstitute, String nameOfTheUniversity, boolean involvementInSportsSections, String theNameOfTheSport, String phoneNumber, String fatherName, String fatherLastName, String fatherPhoneNumber, String homeAddress, String residence, boolean residentOfDormitory, boolean beneficiary, boolean onFreeVisit) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.birthday = birthday;
        this.averageScore = averageScore;
        this.education = education;
        this.testNumber = testNumber;
        this.numberOfGroup = numberOfGroup;
        this.courseTitle = courseTitle;
        this.nameOfDepartments = nameOfDepartments;
        NameOfTheInstitute = nameOfTheInstitute;
        this.nameOfTheUniversity = nameOfTheUniversity;
        this.involvementInSportsSections = involvementInSportsSections;
        this.theNameOfTheSport = theNameOfTheSport;
        this.phoneNumber = phoneNumber;
        this.fatherName = fatherName;
        this.fatherLastName = fatherLastName;
        this.fatherPhoneNumber = fatherPhoneNumber;
        this.homeAddress = homeAddress;
        this.residence = residence;
        this.residentOfDormitory = residentOfDormitory;
        this.beneficiary = beneficiary;
        this.onFreeVisit = onFreeVisit;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getNameOfDepartments() {
        return nameOfDepartments;
    }

    public void setNameOfDepartments(String nameOfDepartments) {
        this.nameOfDepartments = nameOfDepartments;
    }

    public String getNameOfTheInstitute() {
        return NameOfTheInstitute;
    }

    public void setNameOfTheInstitute(String nameOfTheInstitute) {
        NameOfTheInstitute = nameOfTheInstitute;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public boolean isInvolvementInSportsSections() {
        return involvementInSportsSections;
    }

    public void setInvolvementInSportsSections(boolean involvementInSportsSections) {
        this.involvementInSportsSections = involvementInSportsSections;
    }

    public String getTheNameOfTheSport() {
        return theNameOfTheSport;
    }

    public void setTheNameOfTheSport(String theNameOfTheSport) {
        this.theNameOfTheSport = theNameOfTheSport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherPhoneNumber() {
        return fatherPhoneNumber;
    }

    public void setFatherPhoneNumber(String fatherPhoneNumber) {
        this.fatherPhoneNumber = fatherPhoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public boolean isResidentOfDormitory() {
        return residentOfDormitory;
    }

    public void setResidentOfDormitory(boolean residentOfDormitory) {
        this.residentOfDormitory = residentOfDormitory;
    }

    public boolean isBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        this.beneficiary = beneficiary;
    }

    public boolean isOnFreeVisit() {
        return onFreeVisit;
    }

    public void setOnFreeVisit(boolean onFreeVisit) {
        this.onFreeVisit = onFreeVisit;
    }

//---------------------------------------------------------------------
    /*
    * classname : Builder
    * Description : builder pattern for class Student
     */
    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){
            this.studentToBuild.averageScore = student.averageScore;
            this.studentToBuild.beneficiary = student.beneficiary;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.courseTitle = student.courseTitle;
            this.studentToBuild.education = student.education;
            this.studentToBuild.fatherLastName = student.fatherLastName;
            this.studentToBuild.fatherName = student.fatherName;
            this.studentToBuild.fatherPhoneNumber = student.fatherPhoneNumber;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.height = student.height;
            this.studentToBuild.homeAddress = student.homeAddress;
            this.studentToBuild.id = student.id;
            this.studentToBuild.involvementInSportsSections = student.involvementInSportsSections;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.name = student.name;
            this.studentToBuild.nameOfDepartments = student.nameOfDepartments;
            this.studentToBuild.NameOfTheInstitute = student.NameOfTheInstitute;
            this.studentToBuild.nameOfTheUniversity = student.nameOfTheUniversity;
            this.studentToBuild.numberOfGroup = student.numberOfGroup;
            this.studentToBuild.onFreeVisit = student.onFreeVisit;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.residence = student.residence;
            this.studentToBuild.residentOfDormitory = student.residentOfDormitory;
            this.studentToBuild.testNumber = student.testNumber;
            this.studentToBuild.theNameOfTheSport = student.theNameOfTheSport;
            this.studentToBuild.weight = student.weight;
            return this;
        }

        public Builder setName(String name){
            studentToBuild.setName(name);
            return this;
        }

        public Builder setHeight(int height){
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setWeight(int weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public Student build(){
            return studentToBuild;
        }








    }
}
