package coursesSys;

import java.util.Arrays;
import java.util.Date;

public class student {
    String id;
    String name;
    String sexual;
    Date birthday;
    String address; //地址
    String iddress; //户籍
    Date school; //入学时间

    int coursesNum;

    courses[] course; //这里创建的是courses类的引用对象
    public student(){

    }

    public student(String id,String name,String sexual,Date birthday,String address,String iddress,Date school,int coursesNum){
        this.id=id;
        this.name=name;
        this.sexual=sexual;
        this.birthday=birthday;
        this.address=address;
        this.iddress=iddress;
        this.school=school;
        this.coursesNum=coursesNum;
    }

    public String getId(){
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getSexual() {
        return sexual;
    }

    public String getAddress() {
        return address;
    }

    public String getIddress() {
        return iddress;
    }

    public Date getSchool() {
        return school;
    }

    public int getCoursesNum() {
        return coursesNum;
    }

    public void setCourse(courses[] course) {
        this.course = course;
    }


    //下面两个info方法都是打印学生个人信息和课程信息的
    public String InfoStu(){
        String stu="id:"+this.id+"\tname:"+this.name+"\tsexual:"+this.sexual+"\tbirthday:"+this.birthday+"\tDateOfschool:"+this.school+"\taddress:"+this.address+"\tiddress:"+this.iddress;

        return stu;
    }

    public void Infoclass(){
        for(int i=0;i<coursesNum;i++){
            if(this.course[i]!=null)
                System.out.println(this.course[i].InfoCourse());
        }
    }

    //下面这个是退课方法，用的稍微简便的直接在学生的courses对象集合里将某个实例化对象改为null，因为值为null的对象会变回引用对象被垃圾站回收
    public void offclass(String str){
        for(int i=0;i<coursesNum;i++){
            if(this.course[i].coursesName.equals(str)){
                this.course[i]=null;
                System.out.println("remove course sucess!");
            }
        }
    }
}
