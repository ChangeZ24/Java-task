package homework2;
import java.util.Scanner;
import java.lang.Exception;
public class _14211154_张子仪_2_Student {
	String studentNumber;
	String studentName;
	int markForMaths = -1;
	int markForEnglish = -1;
	int markForScience = -1;
	int flag=0;
	Scanner sc = new Scanner(System.in);
	
	_14211154_张子仪_2_Student(String number,String name){
		this.studentNumber = number;
		this.studentName = name;
	};
	_14211154_张子仪_2_Student(){};
	void enterStudentNumber() throws StudentNumberException{
		System.out.println("请输入学生学号");
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
			throw new StudentNumberException("学号格式不正确，请重新输入！");
		this.flag=1;
	}
	void enterMarks(int markForMaths,int markForEnglish,int markForScience) throws ScoreException{
		this.markForMaths = getMathsMark();
		this.markForEnglish = getEnglishMark();
		this.markForScience = getScienceMark();
		if((this.markForMaths<0||this.markForMaths>100)||(this.markForEnglish<0||this.markForEnglish>100)||(this.markForScience<0||this.markForScience>100))
			throw new ScoreException("成绩输入有误，请重新输入！");
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
