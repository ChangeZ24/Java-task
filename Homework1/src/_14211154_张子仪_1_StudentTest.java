package _14211154_������_1_Student;
import java.util.Scanner;
public class _14211154_������_1_StudentTest {
	public static void main(String[] args){
		_14211154_������_1_Student stu = new _14211154_������_1_Student();
		System.out.println("������ѧ��ѧ��");
		Scanner sc = new Scanner(System.in);
		stu.studentNumber = sc.nextLine();
		System.out.println("������ѧ������");
		sc = new Scanner(System.in);
		stu.studentName = sc.nextLine();
		System.out.println("������ѧ�����ſγɼ���(�Կո����)");
		stu.enterMarks(stu.markForMaths, stu.markForEnglish, stu.markForScience);
		sc.close();
		stu.tostring();	
	}
}
