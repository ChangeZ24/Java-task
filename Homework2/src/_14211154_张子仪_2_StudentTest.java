package homework2;
import java.util.Scanner;
import java.lang.Exception;
public class _14211154_张子仪_2_StudentTest {
	public static void main(String[] args)throws ScoreException,StudentNumberException{
		_14211154_张子仪_2_Student stu = new _14211154_张子仪_2_Student();
		int flag=0;
		Scanner sc = new Scanner(System.in);
		while(stu.flag==0){
			try{
				stu.enterStudentNumber();
			}
			catch(StudentNumberException e){
				e.printStackTrace();
				stu.flag=0;
			}
		}	
		System.out.println("请输入学生姓名");
		sc = new Scanner(System.in);
		stu.studentName = sc.nextLine();
		flag=0;
		while(flag==0){
			try{
				System.out.println("请输入学生三门课成绩：(以空格隔开)");
				stu.enterMarks(stu.markForMaths, stu.markForEnglish, stu.markForScience);
				flag=1;
			}
			catch(ScoreException e){
				e.printStackTrace();
				flag=0;
			}
		}		
		sc.close();
		stu.tostring();	
	}
}
