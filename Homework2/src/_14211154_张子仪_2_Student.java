package homework2;
import java.util.Scanner;
import java.lang.Exception;
public class _14211154_������_2_Student {
	String studentNumber;
	String studentName;
	int markForMaths = -1;
	int markForEnglish = -1;
	int markForScience = -1;
	int flag=0;
	Scanner sc = new Scanner(System.in);
	
	_14211154_������_2_Student(String number,String name){
		this.studentNumber = number;
		this.studentName = name;
	};
	_14211154_������_2_Student(){};
	void enterStudentNumber() throws StudentNumberException{
		System.out.println("������ѧ��ѧ��");
		this.studentNumber = sc.nextLine();
		if((this.studentNumber.length()!=10)||(this.studentNumber.charAt(0)!=50)||(this.studentNumber.charAt(1)!=48)
				||(this.studentNumber.charAt(2)<48||this.studentNumber.charAt(2)>57)
				||(this.studentNumber.charAt(3)<48||this.studentNumber.charAt(3)>57)
				||(this.studentNumber.charAt(4)<48||this.studentNumber.charAt(4)>57)
				||(this.studentNumber.charAt(5)<48||this.studentNumber.charAt(5)>57)
				||(this.studentNumber.charAt(6)<48||this.studentNumber.charAt(6)>57)
				||(this.studentNumber.charAt(7)<48||this.studentNumber.charAt(7)>57)
				||(this.studentNumber.charAt(8)<48||this.studentNumber.charAt(8)>57)
				||(this.studentNumber.charAt(9)<48||this.studentNumber.charAt(9)>57))
			throw new StudentNumberException("ѧ�Ÿ�ʽ����ȷ�����������룡");
		this.flag=1;
	}
	void enterMarks(int markForMaths,int markForEnglish,int markForScience) throws ScoreException{
		this.markForMaths = getMathsMark();
		this.markForEnglish = getEnglishMark();
		this.markForScience = getScienceMark();
		if((this.markForMaths<0||this.markForMaths>100)||(this.markForEnglish<0||this.markForEnglish>100)||(this.markForScience<0||this.markForScience>100))
			throw new ScoreException("�ɼ������������������룡");
	}
	int getMathsMark(){
		markForMaths = sc.nextInt();
		//sc.close();
		return markForMaths;
	}
	int getEnglishMark(){
		//Scanner sc = new Scanner(System.in);
		markForEnglish = sc.nextInt();
		//sc.close();
		return markForEnglish;
	}
	int getScienceMark(){
		//Scanner sc = new Scanner(System.in);
		markForScience = sc.nextInt();
		//sc.close();
		return markForScience;
	}
	double calculateAverage(){
		return (markForMaths+markForEnglish+markForScience)/3.0;
	}
	void tostring(){
		System.out.println("ѧ����Ϣ���£�");
		System.out.println("ѧ�ţ�"+studentNumber);
		System.out.println("������"+studentName);
		System.out.println("��ѧ�ɼ���"+markForMaths);
		System.out.println("Ӣ��ɼ���"+markForEnglish);
		System.out.println("��ѧ�ɼ���"+markForScience);
		System.out.println("ƽ���ɼ���"+calculateAverage());
	}

}
