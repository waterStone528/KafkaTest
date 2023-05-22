package com.zx.kafka;

import com.zx.kafka.message.MixMessage;
import com.zx.kafka.message.ParentMessage;
import com.zx.kafka.message.SubMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/17
 **/
@Component
public class KafkaConsumer {
     @KafkaListener(topics = {"test5"})
     public void receive(MixMessage message) {
//         Headers headers = message.headers();
//         Iterator iterator = headers.iterator();
//         while (iterator.hasNext()) {
//             Header header = (Header) iterator.next();
//             System.out.println("header: " + header.key() + " " + header.value());
//         }
//
         System.out.println("receive message:" + message);

         ParentMessage parentMessage = (ParentMessage) message.getParentMessage();
         System.out.println("receive parentMessage:" + parentMessage);

//       Object object = message.getParentMessage();


//         SubMessage subMessage = (SubMessage)parentMessage;
//         System.out.println("receive subMessage:" + subMessage);
//        if (parentMessage instanceof SubMessage) {
//            SubMessage subMessage = (SubMessage) parentMessage;
//            System.out.println("receive subMessage:" + subMessage);
//        }
     }
}