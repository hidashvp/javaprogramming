package hidash;
interface student{
	int score = 25;
	void displayscore();
}
interface sports{
	int score=10;
	
}
class Result implements Student,Sports{
	public void displayscore() {
		System.out.println("academic score is:"+student.score);
	}
	public void displaysportsscore() {
		System.out.println("Sports.score is:"+sports.score);
	}
}

	public class sportsStudentResult {
		Result r=new Result();
		r.displayscore();
		r.sportsscore();
	}
}