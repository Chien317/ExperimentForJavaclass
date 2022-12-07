package coursesSys;


import java.util.Arrays;
import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        //第一个学生的基本信息
        student stu1=new student();
        stu1.id="2018310905";
        stu1.name="chien";
        stu1.sexual="male";
        stu1.coursesNum=2;

        Calendar calendar=Calendar.getInstance();
        calendar.set(2000,3,8);
        stu1.birthday=calendar.getTime();

        Calendar calendar1=Calendar.getInstance();
        calendar1.set(2021,9,9);
        stu1.school=calendar1.getTime();

        stu1.iddress="Ganzhou";
        stu1.address="Yuzhi Kyoto";
        //第一个老师的基本信息
        teacher teacher1=new teacher();
        teacher1.teacherID="4536251";
        teacher1.teacherName="Luoxing";
        teacher1.teacherRank="Professor";
        teacher1.teacherAge=45;
        teacher1.teacherAddress="Peijing";
        teacher1.coursesNum=2;
        //第二个老师的基本信息
        teacher teacher2=new teacher();
        teacher2.teacherID="3536251";
        teacher2.teacherName="Baoting";
        teacher2.teacherRank="Professor";
        teacher2.teacherAge=30;
        teacher2.teacherAddress="Peijing";
        teacher2.coursesNum=1;
        //课程对象实例化
        courses[] cou=new courses[3];
        cou[0]=new courses();
        cou[0].coursesName="java";
        cou[0].classlocation="bulding1";
        cou[0].coursesId="cs101";
        cou[0].teach=teacher1;
        Calendar calendar2=Calendar.getInstance();
        cou[0].classtime=calendar2.getTime();


        cou[1]=new courses();
        cou[1].coursesName="python";
        cou[1].classlocation="bulding2";
        cou[1].coursesId="cs102";
        cou[1].teach=teacher1;
        Calendar calendar3=Calendar.getInstance();
        cou[1].classtime=calendar3.getTime();


        cou[2]=new courses();
        cou[2].coursesName="c++";
        cou[2].classlocation="bulding3";
        cou[2].coursesId="cs103";
        cou[2].teach=teacher2;
        Calendar calendar4=Calendar.getInstance();
        cou[2].classtime=calendar4.getTime();

        //将课程类对象添加进老师和学生类然后分别打印出信息
        teacher1.setCourse(Arrays.copyOfRange(cou,0,2));
        System.out.println(teacher1.Infoteacher());
        teacher1.InfoTeaching();

        stu1.setCourse(Arrays.copyOfRange(cou,0,3));
        System.out.println(stu1.InfoStu());
        stu1.Infoclass();
        //退掉名字叫“java”的课程
        stu1.offclass("java");
        stu1.Infoclass();

//        System.out.println(teacher1.Info());//继承的是父类的方法
//        System.out.println(stu1.Info1());//会报错提示'Info1()' has private access in 'coursesSys.person1'父类的私有方法不能访问


    }
}
