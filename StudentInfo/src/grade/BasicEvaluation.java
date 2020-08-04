package grade;

//일반 과목의 등급을 만듬
public class BasicEvaluation implements GradeEvaluation {
	String grade; //등급 변수
	@Override
	public String getGrade(int point) {
		if(point >= 90 && point <= 100) grade = "A";
		else if(point >= 80) 			grade = "B";
		else if(point >= 70) 			grade = "C";
		else if(point >= 55) 			grade = "D";
		else 							grade = "F"; 
	
		return grade;
	}
}
