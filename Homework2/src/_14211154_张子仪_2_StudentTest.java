package homework2;
import java.util.Scanner;
import java.lang.Exception;
public class _14211154_������_2_StudentTest {
	public static void main(String[] args)throws ScoreException,StudentNumberException{
		_14211154_������_2_Student stu = new _14211154_������_2_Student();
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
		System.out.println("������ѧ������");
		sc = new Scanner(System.in);
		stu.studentName = sc.nextLine();
		flag=0;
		while(flag==0){
			try{
				System.out.println("������ѧ�����ſγɼ���(�Կո����)");
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
