
public class Course {
   Teacher teacher;
   String name;
   String code;
   String prefix;
   double note;
   double opNote;
   
   Course(String name,String code,String prefix)
   {
	   this.name = name;
	   this.code = code;
	   this.prefix = prefix;
	   double note = 0;
	   double opnote = 0;
   }
   
   void addTeacher(Teacher teacher)
   {
	   if(teacher.branch.equals(this.prefix))
	   {
		   this.teacher = teacher;
		   //printTeacher();
	   }
	   else
	   {
		   System.out.println("Öðretmen ve Ders Bölümleri Uyuþmuyor");
	   }
   }
   void printTeacher()
   {
	   this.teacher.print();
   }
}
