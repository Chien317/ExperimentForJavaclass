import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        System.out.println("输入古诗词:\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer text = new StringBuffer();
        int cnt = 0;
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
        try(PrintWriter out = new PrintWriter("after.text")){
            out.println(text);
        }catch(FileNotFoundException f) {
            System.out.println("An error has occured.");
        }
        System.out.println("输入要查询的单词:\n");
        Scanner sc1 = new Scanner(System.in);
        String substr = sc1.nextLine();
        int count = 0;
        int index = -1;

        while ((index = str.indexOf(substr)) != -1) {
            str = str.substring(index + substr.length());
            count++;
        }
        System.out.println(substr + "出现了" + count + "次");
    }
}