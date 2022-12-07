# ExperimentForJavaclass
## This repository is for the fourth java class

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/Chien317/ExperimentForJavaclass/tree/main/experiment2)

## 实验目的:
1.掌握 Java 中类的定义； 2.掌握 staticfinal 等修饰符的用法； 3.了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验要求：
某学校为了给学生提供勤工俭学机会，选派了部分学生参与实验室的卫生清洁工作。每个学生被分配若干间实验室，视实验室的清洁打分情况给予劳务补贴。

## 实验步骤:
```
1.首先创建类 Student，定义 id,name,excellentCount 和 passCount。构建了普通方法来完成类实例化。 
2.再创建 Laboratory 类，定义 id 和 roomName，并且通过构建普通方法来完成类实例化。 
3.接着创建 Prize 类，定义了优秀和及格的补助标准，另外定义了一个方法，将实验室的打扫任务分给学生，建了能够根据国家规定纳税的标准,进行计算学生最后的劳务费的多少. 
4.最后创建了 Mainfunction 类，实例化张三和李四两名同学，并且对不同实验室优秀的情况进行赋值，再输入国家的纳税标准,调用 Price 类中所定义的方法，计算结果。
```

## 解题思路
```
1.首先就要定义 Student 和 Classroom 两个类.来对学生和实验室进行实例化操作.在两个类中分别定义他们的属性。 
2.要对不同实验室卫生情况,对学生的补助进行赋值。所以创建 Prize 类，并在 Prize 类中,构建方法,来对 Main 类中,通过输入语句来对 prize 类中的一个属性(税率)进行赋值后,计算学生的税后补助. 
3.在 Main 类中,对构造的类进行实例化,通过调用 dePartureRoom()方法,将实验室分配给同学打扫.接下来定义不同实验室优秀的次数,通过输入语句输入国家最新纳税标准,调用 excelentCount 进行计算,输出结果.
```

## 流程图：

做了一个简易的UMl，感觉相比流程图这个更清楚点，不过因为现在的代码本身就没多复杂所以看起来很简单
[image](image.png)

## 核心代码：

### 1.创建学生类，并定义其属性和构造方法。lab类也类似
```
public class Student {
	  public Integer id;
	  public String name;
	  public int excellentCount;
	  public int passCount;
	  
```

### 2.定义 Prize 类，定义静态变量，并使用关键字 final，定义了不同标准的补助金额。
```
public static final int x = 15;// 优秀15元
public static final int y = 12;// 及格12元
```
### 3.使用数组集合,第一个参数是实验室 ID,另外一个学生 ID.
```
public static Map<String, List<Student>> roomStudentMap = null;
```


### 4.将实验室分配给学生，
```
  if (roomStudentMap == null) {
   roomStudentMap = new HashMap<String, List<Student>>();
   List<Student> studentIdList = new ArrayList<Student>();
   studentIdList.add(student);
   roomStudentMap.put(roomId, studentIdList);
```

### 5.创建了一个方法，将学生获得的收入和税后收入统计并计算出来。
```
 public static void calculateAccout(Student student) {
  int excelentCount = student.getExcellentCount();
  int passCount = student.getPassCount();
  int priceBefore = x * excelentCount + y * passCount;
  System.out.println(student.getName() + "勤工俭学收入" + priceBefore);
  double price = priceBefore - priceBefore * taxRate;
  System.out.println(student.getName() + "税后实际收入" + price);
```

### 6.在 Main 中实例化两个学生和两个实验室。
```
 Student student1 = new Student(100001, "张三");
  Student student2 = new Student(100001, "李四");
  Laboratory computerRoom = new Laboratory("computerRoom001", "计算机网络实验室");
  Laboratory compositionRoom = new Laboratory("compositionRoom001", "组成原理实验室");
```

### 7.通过输入语句，输入一个纳税标准值。
```
Scanner scanner = new Scanner(System.in);
```

### 8.在程序中考虑异常处理。
```
  while (true) {
   try {
    Prize.taxRate = Double.parseDouble(scanner.next());
    break;
   } catch (Exception e) {
    System.err.println("纳税标准输入格式不正确");
    System.out.println("请输入国家最新纳税标准:");
   }
```



## 系统运行结果：
```
计算机网络实验室分配给张三
计算机网络实验室分配给李四
组成原理实验室分配给张三
计算机网络实验室优秀次数:18
计算机网络实验室合格次数:0
组成原理实验室优秀次数:18
组成原理实验室合格次数:0
请输入国家最新纳税标准:
0.07
张三勤工俭学收入540
张三税后实际收入502.2
李四勤工俭学收入270
李四税后实际收入251.1
```

## 感想：

通过本次实验，我了解了了解异常的使用方法，并在程序中根据输入情况做异常处理。并且掌握 Java 中类的定义和 static（可以修饰代码块和变量）、final（可以修饰变量和类）等修饰符的用法。我相信我可以利用所学知识，更好的解决更多问题。

