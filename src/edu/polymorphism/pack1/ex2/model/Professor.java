package edu.polymorphism.pack1.ex2.model;

public class Professor extends UniverseMember{
    // 필드
    private String professorDepartment;
    private String professorOfficeLocation;
    private double professorSalary;

    // 코드 분류 후
    // 생성자 만들기
    // 생성자 아무것도 존재하지 않는 생성자
    // 자식 클래스 필드 값만 기본으로 만들어지는 생성자
    // 부모 클래스 필드 값만 기본으로 만들어지는 생성자
    // 부모 클래스 + 자식 클래스 필드 값 모두 기본 매개변수로
    // 만들어지는 생성자


    // 생성자
    public Professor() {
        super();
    }
    public Professor(String professorDepartment, String professorOfficeLocation, double professorSalary) {
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }
    public Professor(String name, String id,String professorDepartment) {
        super(name, id); // 교수님의 이름과 아이디는 UniverseMember 필드에 작성된 변수이름 사용
        this.professorDepartment = professorDepartment; // 교수님의 부서는 Professor 클래스에 작성된 변수이름 사용
    }
    public Professor(String name, String id, String professorDepartment, String professorOfficeLocation, double professorSalary) {
        super(name, id);
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }


    // getter setter
    public String getProfessorDepartment() {
        return professorDepartment;
    }
    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }
    public String getProfessorOfficeLocation() {
        return professorOfficeLocation;
    }
    public void setProfessorOfficeLocation(String professorOfficeLocation) {
        this.professorOfficeLocation = professorOfficeLocation;
    }
    public double getProfessorSalary() {
        return professorSalary;
    }
    public void setProfessorSalary(double professorSalary) {
        this.professorSalary = professorSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nprofessorDepartment='" + professorDepartment + '\'' +
                ", professorOfficeLocation='" + professorOfficeLocation + '\'' +
                ", professorSalary=" + professorSalary;
    }
}