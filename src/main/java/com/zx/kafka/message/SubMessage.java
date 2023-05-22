package com.zx.kafka.message;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/17
 **/
public class SubMessage extends ParentMessage{
    private String b;

    public SubMessage(){
        super();
    }

    public SubMessage(String a, String b){
        super(a);
        this.b = b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public String toString() {
        return "SubMessage{" +
                "a='" + getA() + '\'' +
                "b='" + b + '\'' +
                '}';
    }
}