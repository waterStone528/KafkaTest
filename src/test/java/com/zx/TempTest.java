package com.zx;

import com.zx.kafka.KafkaProducer;
import com.zx.kafka.message.MixMessage;
import com.zx.kafka.message.ParentMessage;
import com.zx.kafka.message.SubMessage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Description
 * @Author zhangxiong
 * @Date 2023/5/17
 **/
@SpringBootTest
public class TempTest {
    @Resource
    KafkaProducer kafkaProducer;

    @Test
    public void test() throws InterruptedException {
        kafkaProducer.send("test5",
                new MixMessage("mix", new SubMessage("a", "b")));
//        kafkaProducer.send("test1", new SubMessage("a", "b"));

        Thread.sleep(1000);
    }
}