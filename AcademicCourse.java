
public class AcademicCourse extends Course
{
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments)
    {
        super(courseID, courseName, duration);
        this.level = level;
        this.numberOfAssessments = numberOfAssessments;
        this.credit = credit;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    
    public String getLevel()
    {
        return this.level;
    }
        
    public String getCredit(){
        return this.credit;
    }
    
    public String getStartingDate()
    {
        return this.startingDate;
    }

    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
    
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments= numberOfAssessments;
    } 
    
    public void Register(String lecturerName, String courseLeader,String startingDate, String completionDate)
    {
        if (isRegistered == true){
            System.out.println ("This course is registered.");
            System.out.println ("The lecturer for this course is "+lecturerName);
            System.out.println ("This course will start on "+startingDate);
            System.out.println ("This course will complete on "+completionDate);
        }
        else{
            super.setCourseLeader (courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            isRegistered = true;
        }
    }
    
    public void display()
    {
        super.display();
        if(isRegistered == true)
        {
            System.out.println ("The lecturer for this course is "+lecturerName);
            System.out.println ("The level of this course is "+level);
            System.out.println ("The credit of this course is "+credit);
            System.out.println ("This course will start on "+startingDate);
            System.out.println ("This course will complete on "+completionDate);
            System.out.println ("The number of assessments for this course are "+numberOfAssessments);
        }
    }
}
