package _14211154_张子仪_1_Student;
import java.util.Scanner;
public class _14211154_张子仪_1_StudentListTest {
	public static void main(String [] args){
		_14211154_张子仪_1_StudentList student;
		 student = new _14211154_张子仪_1_StudentList(10);
		 int c,i;
		 int flag = 0;
		 
		 System.out.println("菜单如下，请输入1~8代表您要执行的操作：");
		 System.out.println("1.增加一个学生    2.根据学号删除学生    3.根据位置删除学生    4.判断是否为空");
		 System.out.println("5.根据位置返回学生    6.根据学号返回学生    7。输出全部学生信息    8.退出");
		 
		 while(flag == 0){
			 System.out.println("请输入您的操作：");
			 Scanner sc = new Scanner(System.in);
			 c = sc.nextInt();
			 switch(c){
			 case 1:
				 _14211154_张子仪_1_Student stu = new _14211154_张子仪_1_Student();
				 System.out.println("请输入学生信息:");
				 System.out.println("学号:");
				 sc  = new Scanner(System.in);
				 stu.studentNumber = sc.nextLine();
				 System.out.println("请输入学生姓名");
				 sc  = new Scanner(System.in);
				 stu.studentName = sc.nextLine();
				 System.out.println("数学成绩:");
				 sc  = new Scanner(System.in);
				 stu.markForMaths = sc.nextInt();
				 System.out.println("英语成绩:");
				 sc  = new Scanner(System.in);
				 stu.markForEnglish = sc.nextInt();
				 System.out.println("科学成绩:");
				 sc  = new Scanner(System.in);
				 stu.markForScience = sc.nextInt();
				 student.add(stu);
				 System.out.println("---目前有"+student.total+"个学生,信息为---:");
				 for(i = 0;i<student.total;i++){
					 student.list[i].tostring();
				 }
				 break;
			 case 2:
				 System.out.println("请输入学生学号:");
				 sc  = new Scanner(System.in);
				 String num1 = sc.nextLine();
				 if(student.remove(num1)==true)
					 System.out.println("删除成功");
				 else
					 System.out.println("没有此学生！");
				 System.out.println("---目前有"+student.getTotal()+"个学生,信息为---:");
				 for(i = 0;i<student.getTotal();i++){
					 student.list[i].tostring();
				 }
				 break;
			 case 3:
				 System.out.println("请输入要删除的第几个学生:");
				 sc  = new Scanner(System.in);
				 int n1 = sc.nextInt();
				 if(student.remove(n1)==true)
					 System.out.println("删除成功");
				 else
					 System.out.println("没有此学生！");
				 if(student.total!=0){
					 System.out.println("---目前有"+student.getTotal()+"个学生,信息为---:");
					 for(i = 0;i<student.total;i++){
						 student.list[i].tostring();
					 }
				 }
				 else
					 System.out.println("---目前没有学生信息---");
				 break;
			 case 4:
				 if(student.isEmpty()==true)
					 System.out.println("名单为空");
				 else
					 System.out.println("名单不空");
				 break;
			 case 5:
				 System.out.println("请输入学生位置:");
				 sc  = new Scanner(System.in);
				 int n2 = sc.nextInt();
				 if(student.getItem(n2)!=null){
					 student.getItem(n2).tostring();
				 }
				 else
					 System.out.println("没有此学生！");
				 break;
			 case 6:
				 System.out.println("请输入学生学号:");
				 sc  = new Scanner(System.in);
				 String num2 = sc.nextLine();
				 if(student.getItem(num2)!=null){
					 student.getItem(num2).tostring();
				 }
				 else
					 System.out.println("没有此学生！");
				 break;
			 case 7:
				 if(student.total!=0){
					 System.out.println("---目前有"+student.getTotal()+"个学生,信息为---:");
					 for(i = 0;i<student.total;i++){
						 student.list[i].tostring();
					 }
				 }
				 else
					 System.out.println("---目前没有学生信息---");
				 break;
			 case 8:
				 System.out.println("谢谢使用");
				 flag = 1;
				 break;
			 }
		 }
	 }


}
