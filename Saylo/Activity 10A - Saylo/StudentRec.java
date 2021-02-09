
package extending.student.record;


public class StudentRec {
    protected String StudName;
    protected String CourseSection;
    protected String idNum;
    protected double oralCom;
    protected double history; 
    protected double ethics;
    
    public String getStudentName(){
        return StudName;
    }
    public void setStudentName(String temp){
        StudName = temp;
    }
    public double getAverage(){
        double ave = 0;
        ave = (oralCom + history + ethics)/3;
        
        return ave;
    }
    public void setOralComGrade(double Grade){
        oralCom = Grade;
    }
    public void setHistoryGrade(double Grade){
        history = Grade;
    }
    public void setEthicsGrade(double Grade){
        ethics = Grade;
    }
    
}
