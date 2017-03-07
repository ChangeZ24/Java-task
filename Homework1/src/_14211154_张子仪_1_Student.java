package _14211154_张子仪_1_Student;
import java.util.Scanner;
public class _14211154_张子仪_1_Student {
	String studentNumber;
	String studentName;
	int markForMaths = -1;
	int markForEnglish = -1;
	int markForScience = -1;
	Scanner sc = new Scanner(System.in);
	_14211154_张子仪_1_Student(String number,String name){
		this.studentNumber = number;
		this.studentName = name;
	};
	_14211154_张子仪_1_Student(){};
	void enterMarks(int markForMaths,int markForEnglish,int markForScience){
		this.markForMaths = getMathsMark();
		this.markForEnglish = getEnglishMark();
		this.markForScience = getScienceMark();
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
		System.out.println("学生信息如下：");
		System.out.println("学号："+studentNumber);
		System.out.println("姓名："+studentName);
		System.out.println("数学成绩："+markForMaths);
		System.out.println("英语成绩："+markForEnglish);
		System.out.println("科学成绩："+markForScience);
		System.out.println("平均成绩："+calculateAverage());
	}

}
