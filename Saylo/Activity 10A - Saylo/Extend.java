
package extending.student.record;


public class Extend extends StudentRec{
    
    protected double oop;
    protected double ai;
    protected double disc;
    protected String rating;
    
    public Extend(String StudName, String CourseSection, String idNum){
        this.StudName = StudName;
        this.CourseSection = CourseSection;
        this.idNum = idNum;
    }

    
    public double getProgrammingGrade(){
        double result = 0;
        result = (oop + ai + disc)/3;
                return result;
    }
    public double getTotalGrade(){
        double result = 0;
        result = (getProgrammingGrade() + getAverage())/2;
        return result;
    }
    public String getRating(){
        if (getTotalGrade()>=100){
            rating = "SSS";
        }else if(getTotalGrade()>=90){
            rating = "A";
        }else if(getTotalGrade()>=80){
            rating = "B";
        }else if(getTotalGrade()>=70){
            rating = "D";
        }else{
            rating = "Failure";
        }
    
        return rating;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setOOPGrade(double grade){
        oop = grade;
    }
    public void setAIGrade(double grade){
        ai = grade;
    }
    public void setDiscreteStructuresGrade(double grade){
        disc = grade;
    }
    
}
