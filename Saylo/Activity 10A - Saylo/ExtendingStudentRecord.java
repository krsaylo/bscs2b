
package extending.student.record;


public class ExtendingStudentRecord {

 public static void main(String[] args) {
     
     Extend studRec = new Extend("Kenette Roeven C. Saylo", "2019M0347", "BSCS 2B - AI");
     
     studRec.setOralComGrade(88);
     studRec.setHistoryGrade(86);
     studRec.setEthicsGrade(82);
     
     studRec.setAIGrade(90);
     studRec.setDiscreteStructuresGrade(75);
     studRec.setOOPGrade(88);
     
     System.out.println("\tExtending Student Record\n");
     System.out.println("Student Name: \t\t" + studRec.StudName);
     System.out.println("Student ID: \t\t" + studRec.idNum);
     System.out.println("Course and Section: \t" + studRec.CourseSection);
     System.out.println("\nMinor Subject Average: \t" + studRec.getAverage());
     System.out.println("Programming Average: \t" + studRec.getProgrammingGrade());
     System.out.println("Total Grade: \t\t" + studRec.getTotalGrade());

    }
    
}
