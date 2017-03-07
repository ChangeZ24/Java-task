package _14211154_张子仪_1_Student;

public class _14211154_张子仪_1_StudentList {
	_14211154_张子仪_1_Student[] list;
	int total = 0;
	//List<Student> Stu = new ArrayList<Student>();
	_14211154_张子仪_1_StudentList(int length){
	    this.list = new _14211154_张子仪_1_Student[length];
	};////length是数组长度
	boolean add(_14211154_张子仪_1_Student stu){//增加stu到数组中，成功，返回true，否则false
		//int i;
		if(total>=this.list.length){
			return false;
		}
		else{
			this.list[total++] = stu;
			return true;
		}
	}
	boolean remove(int no){//删除第no个数组元素，删除成功，返回true，否则false
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
	boolean remove(String number){//删除学号为number的学生，删除成功，返回true，否则false
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
	_14211154_张子仪_1_Student getItem(int no){//返回第no个学生
		for(int i=0;i<this.total;i++){
			if(i==no-1)
				return this.list[i];
		}
		return null;
	}
	_14211154_张子仪_1_Student getItem(String number){//返回学号为number的学生，若该生不存在，返回null。
		for(int i=0;i<this.total;i++){
			if(this.list[i].studentNumber.equals(number)==true)
				return this.list[i];
		}
		return null;
	}
	int getTotal(){//返回学生总人数
		return this.total;
	}


}
