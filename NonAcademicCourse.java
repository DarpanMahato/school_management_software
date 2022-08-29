
public class NonAcademicCourse extends Course
{
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    //methods
    public String getInstructorName()
    {
        return this.instructorName;
    }
    
    public String getStartDate()
    {
        return this.startDate;
    }
    
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
    public String getExamDate()
    {
        return this.examDate;
    }
    
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
    
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    public boolean getIsRemoved()
    {
        return this.isRemoved;
    }
    
    public void setInstructorName(String instructorName)
    {
        if (isRegistered == false){
            this.instructorName = instructorName;
            this.isRegistered = true;
        }
        else{
            System.out.println("This course has already been registered. Hence instructor is already defined.");
        }
    }
    
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate)
    {
        if(isRegistered == true){
            System.out.println("This course is already registered.");
        }
        else{
            super.setCourseLeader(courseLeader);
            this.instructorName = instructorName;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
        }
    }
    
    public void remove()
    {
        if (isRemoved == true){
            System.out.println("The course has already been removed");
        }
        else{
            super.setCourseLeader("");
            instructorName = "";
            startDate = "";
            completionDate = "";
            examDate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }
    
    public void display()
    {
        super.display();
        if (isRegistered == true){
            System.out.println("The instructor of this course is "+ instructorName);
            System.out.println ("This course will start on "+startDate);
            System.out.println ("This course will complete on "+completionDate);
            System.out.println ("The exam is on "+ examDate);
        }
    }
}
