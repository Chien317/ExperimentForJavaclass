package coursesSys;

import java.io.Serializable;
import java.util.Date;

//课程类都是很基本的信息
public class courses implements Serializable {
    String coursesId;
    String coursesName;
    String classlocation;

    Date classtime;

    teacher teach;

    public courses(){

    }

    public courses(String coursesId,String coursesName,String classlocation,Date classtime,teacher teach){
        this.coursesId=coursesId;
        this.coursesName=coursesName;
        this.classlocation=classlocation;
        this.classtime=classtime;
        this.teach=teach;
    }

    public String getCoursesId() {
        return coursesId;
    }

    public Date getClasstime() {
        return classtime;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public String getClasslocation() {
        return classlocation;
    }

    public teacher getTeach() {
        return teach;
    }

    public String InfoCourse(){
        String cou="ID:"+this.coursesId+"\tCourseName:"+this.coursesName+"\tCourseLocation:"+this.classlocation+"\tCourseTime:"+this.classtime+"\tteacher:"+this.teach.teacherName;

        return cou;
    }
}
