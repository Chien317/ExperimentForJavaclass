package coursesSys;

import java.util.Date;

//创建一个简单的person类实现学生和老师继承person父类关系打印出人的信息
public class person {
    String id;
    String name;
    String sexual;
    String address; //地址

    public person(){

    }

    public person(String id, String name, String sexual){
        this.id=id;
        this.name=name;
        this.sexual=sexual;
    }

    public String Info(){
        String person="id:"+this.id+"\tname:"+this.name+"\tsexual:"+this.sexual+"\tbirthday:";

        return person;
    }

}
