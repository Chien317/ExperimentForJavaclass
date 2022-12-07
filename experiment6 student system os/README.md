# ExperimentForJavaclass
## This repository is for the sixth java class

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/Chien317/ExperimentForJavaclass/tree/main/experiment2)

## 实验目的:
1.掌握文件输入输出；
2.掌握对象序列化方法。

## 实验要求：
在实验三（学生选课模拟系统）的基础上，利用文件保存选课结果，过程如下：
1.采用对象序列化的writeObject方法把选课结果存到硬盘文件系统中；
2.采用对象序列化的readObject方法从文件中恢复对象，并操作学生的选课课表，实现退课操作。
3.打印课程对象信息，采用覆盖定义toString（）方法的方式。

## 解题思路
```
1.在保持实验三项目中,Course类,Student类,Teacher类,People类中的代码不变的情况下,在main类中即主函数中对代码进行修改。
2.首先先创建一个txt文件，将实例化好的数组对象即学生选好课的情况写入文件，，并将 System.out.println内容存储到文件中。
要进行选课操作,我需要从文件中取出我们上边存入的对象,将读取好的放入一个新的列表中,通过for循环历遍整个列表,将获取的内容,Course类实例化的新对象course,最后,输出打印选课情况。
```

## 核心代码：
### os处理学生和教师对象所含有的课程信息
```
        //序列化持久化对象
        File file = new File("list.text");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        char[] char_chg=stu1.Infoclass().toString().toCharArray();
        out.writeObject(char_chg);
        out.close();

        //反序列化得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = in.readObject(); // 暂时不强制转换到student类型
        in.close();
```
##输出结果
```
create course success!
id:4536251	name:Luoxing	teacherAddress:Peijing	Rank:Professor	Age:45
ID:cs101	CourseName:java	CourseLocation:bulding1	CourseTime:Wed Dec 07 23:40:01 CST 2022	teacher:Luoxing
ID:cs102	CourseName:python	CourseLocation:bulding2	CourseTime:Wed Dec 07 23:40:01 CST 2022	teacher:Luoxing
id:2018310905	name:chien	sexual:male	birthday:Sat Apr 08 23:40:01 CST 2000	DateOfschool:Sat Oct 09 23:40:01 CST 2021	address:Yuzhi Kyoto	iddress:Ganzhou
ID:cs101	CourseName:java	CourseLocation:bulding1	CourseTime:Wed Dec 07 23:40:01 CST 2022	teacher:Luoxing
ID:cs102	CourseName:python	CourseLocation:bulding2	CourseTime:Wed Dec 07 23:40:01 CST 2022	teacher:Luoxing
remove course sucess!
ID:cs101	CourseName:java	CourseLocation:bulding1	CourseTime:Wed Dec 07 23:40:01 CST 2022	teacher:Luoxing
```
[dat文件](C:\Users\Chien\Documents\GitHub\ExperimentForJavaclass\\object.dat)


## 感想：
```
这是本学期最后一个实验了,输入输出了学生的选课模拟。通过本次实验，我掌握了文件输入输出和对象序列化方法。
通过自己亲身去敲代码,以及在网上查阅各种资料能够将老师在课堂上讲的东西,更深的一步记在脑中.此次实验由于是在实验三的基础上做的修改,与我而言还是有一些难度的，但通过我的钻研和与同学交流，我最终还是完成了。 
最后,感谢张老师这学期对我们辛苦的付出,感谢老师对我各个方面上给予的帮助.老师辛苦了！
```
