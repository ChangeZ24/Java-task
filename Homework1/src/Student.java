package _14211154_������_1_StudentList;
import java.util.Scanner;
public class Student {
	String studentNumber;
	String studentName;
	int markForMaths = -1;
	int markForEnglish = -1;
	int markForScience = -1;
	Scanner sc = new Scanner(System.in);
	Student(String number,String name){
		this.studentNumber = number;
		this.studentName = name;
	};
	Student(){};
	void enterMarks(int markForMaths,int markForEnglish,int markForScience){
		this.markForMaths = getMathsMark();
		this.markForEnglish = getEnglishMark();
		this.markForScience = getScienceMark();
	}
	int getMathsMark(){
		
		markForMaths = sc.nextInt();
		return markForMaths;
	}
	int getEnglishMark(){
		
		markForEnglish = sc.nextInt();
		return markForEnglish;
	}
	int getScienceMark(){
		
		markForScience = sc.nextInt();
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
