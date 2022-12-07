package another;
//在非同个包下创建父类测试一下

public class person2 {
    private String id;
    private String name;
    private String sexual;
    private String address; //地址

    public person2(){

    }

    public person2(String id, String name, String sexual){
        this.id=id;
        this.name=name;
        this.sexual=sexual;
    }

    String Info2(){
        String person="id:"+this.id+"\tname:"+this.name+"\tsexual:"+this.sexual+"\tbirthday:";

        return person;
    }

}
