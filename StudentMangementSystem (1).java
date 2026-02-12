import java.util.Scanner;
class StudentMangementSystem
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		Student students[] = new Student[10];
		int choice=0;
		do{
		System.out.println("select Your choice:");
		System.out.println("1. Add student \n 2. Delete student \n 3. Update student \n 4. display all students \n 5. display particular student\n 6. total no of students \n 7. exit");
		choice = sc.nextInt();

		switch(choice)
		{
		case 1:
		{
		System.out.println("enter student details like id, name, mobieno, emailid, m1,m2,m3 marks");
		int id = sc.nextInt();
		String name = sc.next();
		long mob = sc.nextLong();
		String em = sc.next();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		Student s = new Student(id,name,mob,em,m1,m2,m3);
		students[Student.totalnoofstudents]=s;
		Student.totalnoofstudents++;
		break;
	
		}
		case 2:
			{
				System.out.println("Enter id");
			int id=sc.nextInt();
			int count=0;
			for(int i=0;i<Student.totalnoofstudents;i++)
				{
					if(id==students[i].id) {
						for(int j=i;j<Student.totalnoofstudents;j++)
						{
							students[j]=students[j+1];
						}
						count++;
						break;
					}
				}
				if(count==0) {
					System.out.println("Id is invalid");
				}
				Student.totalnoofstudents--;
				break;
			}
		case 3:
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			int count=0;
			for(int i=0;i<Student.totalnoofstudents;i++)
				{
					if(id==students[i].id) {
						System.out.println("enter student new values like name, mob, emailid, m1,m2,m3 marks");
						String name = sc.next();
						long mob = sc.nextLong();
						String em = sc.next();
						int m1 = sc.nextInt();
						int m2 = sc.nextInt();
						int m3 = sc.nextInt();

		Student s = new Student(id,name,mob,em,m1,m2,m3);
				students[i]=s;
						count++;
					}
				}
				if(count==0) {
					System.out.println("Id is invalid");
				}
				break;
		}
		case 4: 
			{
				for(int i=0;i<Student.totalnoofstudents;i++)
				{
					students[i].display();
				}
				break;
			}
		case 5:
			{
			System.out.println("Enter id");
			int id=sc.nextInt();
			int count=0;
			for(int i=0;i<Student.totalnoofstudents;i++)
				{
					if(id==students[i].id) {
						students[i].display();
						count++;
					}
				}
				if(count==0) {
					System.out.println("Id is invalid");
				}
				break;
			}
		case 6:
			{
			System.out.println(Student.totalnoofstudents);
			break;
			}
		case 7:{
			System.out.println("Program is exited");
			break;
		}
		default: 
		{
		System.out.println("invaid choice , reenter");
		break;
		}
		}
		}while(choice!=7);
		
	}


}