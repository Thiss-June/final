package school;

import java.util.ArrayList;

public class School {
	//싱글턴 방식으로 하나의 학교 객체만 만들기
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good School";
	//학교에 등록된 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<>();
	//과목 리스트
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	private School() {} //다른 클래스에서 school객체를 만들수 없음
	
	public static School getInstance() {
		if(instance == null) instance = new School();
		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	//입력 메소드
	public void addStudent(Student st) {
		studentList.add(st);
	}
	public void addSubject(Subject sb) {
		subjectList.add(sb);
	}
	
}
