package _14211154_张子仪_1_Student;
import java.util.Scanner;
public class _14211154_张子仪_1_StudentTest {
	public static void main(String[] args){
		_14211154_张子仪_1_Student stu = new _14211154_张子仪_1_Student();
		System.out.println("请输入学生学号");
		Scanner sc = new Scanner(System.in);
		stu.studentNumber = sc.nextLine();
		System.out.println("请输入学生姓名");
		sc = new Scanner(System.in);
		stu.studentName = sc.nextLine();
		System.out.println("请输入学生三门课成绩：(以空格隔开)");
		stu.enterMarks(stu.markForMaths, stu.markForEnglish, stu.markForScience);
		sc.close();
		stu.tostring();	
	}
}
