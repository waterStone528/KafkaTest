package com.zx.kafka.message;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/17
 **/
public class ParentMessage implements java.io.Serializable{
    private String a;

    public ParentMessage(){
    }

    public ParentMessage(String a, String b){
        this.a = a;
    }

    public ParentMessage(String a){
        this.a = a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public String toString() {
        return "ParentMessage{" +
                "a='" + a + '\'' +
                '}';
    }
}