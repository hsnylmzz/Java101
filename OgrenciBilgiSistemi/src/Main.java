
public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mehmet Y�lmaz","213","TRH");
		Teacher t2 = new Teacher("Isaac Newton","342","FZK");
		Teacher t3 = new Teacher("�� Ka��t�� Sinan","1111","B�O");
		Course tarih = new Course("Tarih","101","TRH");
		tarih.addTeacher(t1);
		Course fizik = new Course("Fizik","102","FZK");
		fizik.addTeacher(t2);
		Course biyo = new Course("Biyoloji","106","B�O");
		biyo.addTeacher(t3);
		Student s1 = new Student("Hasan Y�lmaz","12","4",tarih,fizik,biyo);
		s1.addBulkExamNote(100, 80, 70);
		s1.opinionNote(95,85,75);
		s1.printNote();
		s1.isPass();
		
		Student s2 = new Student("G�d�k Necmi","4","214142", tarih, fizik, biyo);
		s2.addBulkExamNote(80, 20, 70);
		s2.opinionNote(100,80,70);
		s2.printNote();
        s2.isPass();
	}

}
