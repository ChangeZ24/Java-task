package _14211154_������_1_StudentList;
import java.util.List;
public class StudentList {
	Student[] list;
	int total = 0;
	//List<Student> Stu = new ArrayList<Student>();
	StudentList(int length){
	    this.list = new Student[length];
	};////length�����鳤��
	boolean add(Student stu){//����stu�������У��ɹ�������true������false
		//int i;
		if(total>=this.list.length){
			return false;
		}
		else{
			this.list[total++] = stu;
			return true;
		}
	}
	boolean remove(int no){//ɾ����no������Ԫ�أ�ɾ���ɹ�������true������false
		int i;
		for(i=0;i<=total;i++){
			if(i==no-1){
				for(int a=i;a<total;a++)
				    this.list[a]=this.list[a++];
				total--;
				return true;
			}
		}
		return false;
	}
	boolean remove(String number){//ɾ��ѧ��Ϊnumber��ѧ����ɾ���ɹ�������true������false
		int i;
		for(i=0;i<=total;i++){
			if(this.list[i].studentNumber.equals(number)==true){
				for(int a=i;a<total;a++)
				    this.list[a]=this.list[a++];
				total--;
				return true;
			}
		}
		return false;
	}
	boolean isEmpty(){
		if(this.total==0)
			 return true;
		 return false;
	}
	Student getItem(int no){//���ص�no��ѧ��
		for(int i=0;i<this.total;i++){
			if(i==no-1)
				return this.list[i];
		}
		return null;
	}
	Student getItem(String number){//����ѧ��Ϊnumber��ѧ���������������ڣ�����null��
		for(int i=0;i<this.total;i++){
			if(this.list[i].studentNumber.equals(number)==true)
				return this.list[i];
		}
		return null;
	}
	int getTotal(){//����ѧ��������
		return this.total;
	}

}
