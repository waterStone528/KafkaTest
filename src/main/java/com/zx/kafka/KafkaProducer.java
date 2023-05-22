package com.zx.kafka;

import com.zx.kafka.message.MixMessage;
import com.zx.kafka.message.ParentMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Parameter;
import java.util.concurrent.ExecutionException;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/17
 **/
@Component
public class KafkaProducer {
    @Resource
    KafkaTemplate<String, MixMessage> kafkaTemplate;

    public void send(String topic, MixMessage message) {
        System.out.println("send message: " + message);
        try {
            kafkaTemplate.send(topic, message).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("send message success");
    }

//    public void send(String topic, ParentMessage message) {
//        System.out.println("send message: " + message);
//        kafkaTemplate.send(topic, message);
//        System.out.println("send message success");
//    }
}