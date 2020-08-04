package grade;

public class PassFailEvaluation implements GradeEvaluation{
	String grade;
	
	@Override
	public String getGrade(int point) {
		if(point >= 70 && point <= 100)
			return "P";
		else
			return "F";
	}
}
