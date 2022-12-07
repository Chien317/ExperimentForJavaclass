package coursesSys;

//再创建一个私有的person类验证一下
public class person1 {
    private String id;
    private String name;
    private String sexual;
    private String address; //地址

    public person1(){

    }

    public person1(String id, String name, String sexual){
        this.id=id;
        this.name=name;
        this.sexual=sexual;
    }

    private String Info1(){
        String person="id:"+this.id+"\tname:"+this.name+"\tsexual:"+this.sexual+"\tbirthday:";

        return person;
    }

}
