package _14211154_������_1_Student;
import java.util.Scanner;
public class _14211154_������_1_StudentListTest {
	public static void main(String [] args){
		_14211154_������_1_StudentList student;
		 student = new _14211154_������_1_StudentList(10);
		 int c,i;
		 int flag = 0;
		 
		 System.out.println("�˵����£�������1~8������Ҫִ�еĲ�����");
		 System.out.println("1.����һ��ѧ��    2.����ѧ��ɾ��ѧ��    3.����λ��ɾ��ѧ��    4.�ж��Ƿ�Ϊ��");
		 System.out.println("5.����λ�÷���ѧ��    6.����ѧ�ŷ���ѧ��    7�����ȫ��ѧ����Ϣ    8.�˳�");
		 
		 while(flag == 0){
			 System.out.println("���������Ĳ�����");
			 Scanner sc = new Scanner(System.in);
			 c = sc.nextInt();
			 switch(c){
			 case 1:
				 _14211154_������_1_Student stu = new _14211154_������_1_Student();
				 System.out.println("������ѧ����Ϣ:");
				 System.out.println("ѧ��:");
				 sc  = new Scanner(System.in);
				 stu.studentNumber = sc.nextLine();
				 System.out.println("������ѧ������");
				 sc  = new Scanner(System.in);
				 stu.studentName = sc.nextLine();
				 System.out.println("��ѧ�ɼ�:");
				 sc  = new Scanner(System.in);
				 stu.markForMaths = sc.nextInt();
				 System.out.println("Ӣ��ɼ�:");
				 sc  = new Scanner(System.in);
				 stu.markForEnglish = sc.nextInt();
				 System.out.println("��ѧ�ɼ�:");
				 sc  = new Scanner(System.in);
				 stu.markForScience = sc.nextInt();
				 student.add(stu);
				 System.out.println("---Ŀǰ��"+student.total+"��ѧ��,��ϢΪ---:");
				 for(i = 0;i<student.total;i++){
					 student.list[i].tostring();
				 }
				 break;
			 case 2:
				 System.out.println("������ѧ��ѧ��:");
				 sc  = new Scanner(System.in);
				 String num1 = sc.nextLine();
				 if(student.remove(num1)==true)
					 System.out.println("ɾ���ɹ�");
				 else
					 System.out.println("û�д�ѧ����");
				 System.out.println("---Ŀǰ��"+student.getTotal()+"��ѧ��,��ϢΪ---:");
				 for(i = 0;i<student.getTotal();i++){
					 student.list[i].tostring();
				 }
				 break;
			 case 3:
				 System.out.println("������Ҫɾ���ĵڼ���ѧ��:");
				 sc  = new Scanner(System.in);
				 int n1 = sc.nextInt();
				 if(student.remove(n1)==true)
					 System.out.println("ɾ���ɹ�");
				 else
					 System.out.println("û�д�ѧ����");
				 if(student.total!=0){
					 System.out.println("---Ŀǰ��"+student.getTotal()+"��ѧ��,��ϢΪ---:");
					 for(i = 0;i<student.total;i++){
						 student.list[i].tostring();
					 }
				 }
				 else
					 System.out.println("---Ŀǰû��ѧ����Ϣ---");
				 break;
			 case 4:
				 if(student.isEmpty()==true)
					 System.out.println("����Ϊ��");
				 else
					 System.out.println("��������");
				 break;
			 case 5:
				 System.out.println("������ѧ��λ��:");
				 sc  = new Scanner(System.in);
				 int n2 = sc.nextInt();
				 if(student.getItem(n2)!=null){
					 student.getItem(n2).tostring();
				 }
				 else
					 System.out.println("û�д�ѧ����");
				 break;
			 case 6:
				 System.out.println("������ѧ��ѧ��:");
				 sc  = new Scanner(System.in);
				 String num2 = sc.nextLine();
				 if(student.getItem(num2)!=null){
					 student.getItem(num2).tostring();
				 }
				 else
					 System.out.println("û�д�ѧ����");
				 break;
			 case 7:
				 if(student.total!=0){
					 System.out.println("---Ŀǰ��"+student.getTotal()+"��ѧ��,��ϢΪ---:");
					 for(i = 0;i<student.total;i++){
						 student.list[i].tostring();
					 }
				 }
				 else
					 System.out.println("---Ŀǰû��ѧ����Ϣ---");
				 break;
			 case 8:
				 System.out.println("ллʹ��");
				 flag = 1;
				 break;
			 }
		 }
	 }


}
