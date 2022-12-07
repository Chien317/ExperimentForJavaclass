# ExperimentForJavaclass
## This repository is for the fifth java class

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/Chien317/ExperimentForJavaclass/tree/main/experiment2)

## 实验目的:
掌握字符串String及其常用方法的使用 掌握输入输出流的使用

## 实验要求：
有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复，并把恢复后的诗歌写入D盘某个目录下的某个文本文件。 要求如下：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
2.允许提供输入参数，统计古诗中某个字或词出现的次数。

## 解题思路
```
首先初始化一个String对象str和一个可以修改内容的StringBuffer对象text，用下标“遍历”str（实际上没有用下标访问，Java不支持String下标访问）， 在下列条件下将str内容截取，加上标点和换行，并写入text：
1.当下标为能被7整除的数，且操作次数cnt为能被2整除的数时，将此位置前的7个汉字截取，加逗号，写入text；
2.当下标为能被7整除的数，且操作次数cnt不能被2整除时，将此位置前的7个汉字截取，加句号和换行符\n，写入text。 将修改过的text通过FileWriter写入D盘的after.txt文件
```

## 流程图：

做了一个简易的UMl，感觉相比流程图这个更清楚点，不过因为现在的代码本身就没多复杂所以看起来很简单
[image](image.png)

## 核心代码：

### 设置指针
用for循环遍历String对象str，当下标为能被7整除的数，且操作次数cnt为能被2整除的数时，将此位置前的7个汉字截取，加逗号，写入text
当下标为能被7整除的数，且操作次数cnt不能被2整除时，将此位置前的7个汉字截取，加句号和换行符\n，写入text
```
for (int i = 0;i < str.length();++i) {
			if (((i + 1) % 7) == 0) {
				if ((cnt % 2) == 0) {
					text.append(str.substring(i - 6,i + 1)).append(",");
					++cnt;
				}
				else if ((cnt % 2) != 0){
					text.append(str.substring(i - 6,i + 1)).append("。").append("\n");
					++cnt;
				}
			}
		}
```

### 写入D盘after.txt文件
```
try(PrintWriter out = new PrintWriter("D:\\after.text")){
			out.println(text);
		}catch(FileNotFoundException f) {
			System.out.println("An error has occured.");
		}
```
### 查找单词出现次数
```
while ((index = str.indexOf(substr)) != -1) {
			str = str.substring(index + substr.length());
			count++;
		}
		System.out.println(substr + "出现了" + count + "次");
```

## 系统运行结果：
```
输入古诗词:

汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行
输入要查询的单词:

春
春出现了6次
```
### [整理完后的古诗词](C:\Users\Chien\Documents\GitHub\ExperimentForJavaclass\after.text)

## 感想：
```
本次实验主要熟悉了StringBuffer类，以及StringBuffer的append()方法，还有FileWriter类，
以及使用try-catch处理FileNotFoundException异常。 
本来想把输入也变成从txt中读取存到String里的，结果失败了，出来的都是乱码，应该是因为文本是中文标准不一样的问题，这次实验还是用的Scanner获取键盘输入。 
另外，我发现使用FileWriter生成txt文件时，由于有try-catch处理FileNotFoundException，如果已经存在同名文件，并不会出错，而是会把内容重新写入同一个文件。 也就是说FileWriter执行时并不会每次都创建新文件，只有在没有文件时才会创建文件。
```
