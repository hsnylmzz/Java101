
public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    
    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3)
    {
    	this.name = name;
    	this.stuNo = stuNo;
    	this.classes = classes;
    	this.c1 = c1;
    	this.c2 = c2;
    	this.c3 = c3;
    	this.avarage = 0.0;
    	this.isPass = false;
    }
    
    void addBulkExamNote(int note1,int note2,int note3)
    {
    	if(note1 >= 0 && note1 <= 100)
    	{
    		this.c1.note = note1;
    	}
    	
    	if(note2 >= 0 && note2 <= 100)
    	{
    		this.c2.note = note2;
    	}
    	
    	if(note3 >= 0 && note3 <= 100)
    	{
    		this.c3.note = note3;
    	}
    }
    void opinionNote(int opNote1,int opNote2,int opNote3)
    {
    	if(opNote1 >= 0 && opNote1 <= 100)
    	{
    		this.c1.opNote = opNote1;
    	}
    	
    	if(opNote2 >= 0 && opNote2 <= 100)
    	{
    		this.c2.opNote = opNote2;
    	}
    	
    	if(opNote3 >= 0 && opNote3 <= 100)
    	{
    		this.c3.opNote = opNote3;
    	}
    }
    
    void printNote()
    {
    	System.out.println(this.c1.name + " Yaz�l� Notu : " + this.c1.note + " S�zl� Notu : " + this.c1.opNote);
    	System.out.println(this.c2.name + " Yaz�l� Notu : " + this.c2.note + " S�zl� Notu : " + this.c2.opNote);
    	System.out.println(this.c3.name + " Yaz�l� Notu : " + this.c3.note + " S�zl� Notu : " + this.c3.opNote);
    	System.out.println("Ortalaman�z : " + this.avarage);
    }
    void isPass()
    {
    	this.avarage = ((this.c1.note * 0.8 + this.c1.opNote * 0.2) + (this.c2.note * 0.8 + this.c2.opNote * 0.2) + (this.c3.note * 0.8 + this.c3.opNote * 0.2)) / 3.0;
    	if(this.avarage >= 55)
    	{
    		System.out.println("Tebrikler.Ge�tin");
    		this.isPass = true;
    	}
    	else 
    	{
    		System.out.println("�zg�n�m.Kald�n�z");
    		this.isPass = false;
    	}
       printNote();
    }

}
