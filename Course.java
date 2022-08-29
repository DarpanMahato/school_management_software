
public class Course
{
    /**assigning attributes*/
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    
    /**initializing constructor*/
    public Course(String courseID, String courseName, int duration)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    
    /**accessor methods*/ 
    public String getCourseID()
    {
        return this.courseID;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public int getDuration()
    {
        return this.duration;
    }
    
    public String getCourseLeader(){
        return this.courseLeader;
    }
    
    /**set course leader*/
    public void setCourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }
    
    /**output method*/
    public void display()
    {
        System.out.println("The course ID is "+ courseID);
        System.out.println("The course name is "+ courseName);
        System.out.println("The duration of the course is "+ duration);
        if (courseLeader !="")
        {
            System.out.println("The courseleader is "+ courseLeader);
        }
    }
}
