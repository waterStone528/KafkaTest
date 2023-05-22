package com.zx.kafka.message;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/18
 **/
public class MixMessage {
    private String signalPar;
    private ParentMessage parentMessage;

    public MixMessage(){
    }

    public MixMessage(String signalPar, ParentMessage parentMessage){
        this.signalPar = signalPar;
        this.parentMessage = parentMessage;
    }

    public void setSignalPar(String signalPar) {
        this.signalPar = signalPar;
    }

    public String getSignalPar() {
        return signalPar;
    }

    public void setParentMessage(ParentMessage parentMessage) {
        this.parentMessage = parentMessage;
    }

    public Object getParentMessage() {
        return parentMessage;
    }

    public String toString() {
        return "MixMessage{" +
                "signalPar='" + signalPar + '\'' +
                ", parentMessage=" + parentMessage +
                '}';
    }
}