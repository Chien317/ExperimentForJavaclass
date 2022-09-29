package coursesSys;

public class teacher {
    String teacherID;
    String teacherName;
    String teacherRank;
    int teacherAge;
    String teacherAddress;

    int coursesNum;
    courses[] course; //这里创建的是courses类的引用对象

    public teacher(){

    }

    public teacher(String teacherID,String teacherName,String teacherRank,int teacherAge,String teacherAddress,int coursesNum){
        this.teacherID=teacherID;
        this.teacherAge=teacherAge;
        this.teacherName=teacherName;
        this.teacherRank=teacherRank;
        this.teacherAddress=teacherAddress;
        this.coursesNum=coursesNum;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public String getAddress() {
        return teacherAddress;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeacherRank() {
        return teacherRank;
    }


    //这里简化了教师的开设课程系统直接用setCourses代替，相比“老师创建了课程”，直接创建课程类然后将这个对象赋予给老师在语义上更容易懂一些。
    public void setCourse(courses[] course) {
        this.course = course;
        System.out.println("create course success!");
    }

    public courses[] getCourse() {
        return course;
    }

    public int getCoursesNum() {
        return coursesNum;
    }

    public String Infoteacher(){
        String teacher="id:"+this.teacherID+"\tname:"+this.teacherName+"\tteacherAddress:"+this.teacherAddress+"\tRank:"+this.teacherRank+"\tAge:"+this.teacherAge;

        return teacher;
    }

    public void InfoTeaching(){
        for(int i=0;i<coursesNum;i++){
            System.out.println(this.course[i].InfoCourse());
        }
    }
}
