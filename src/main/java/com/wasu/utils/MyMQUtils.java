package com.wasu.utils;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;

import java.util.UUID;

public class MyMQUtils {
    public static void main(String[] args){
        DefaultMQPushConsumer consumer=new DefaultMQPushConsumer("test");
        consumer.setInstanceName(UUID.randomUUID().toString());
        consumer.setConsumeMessageBatchMaxSize(32);
        consumer.setNamesrvAddr("192.168.1.109:9876");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
//        consumer.registerMessageListener(new MessageListener() {
//            @Override
//            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext){
//                for(Message me : list){
//                    System.out.print(new String(me.getBody()));
//                }
//                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//            }
//        });
//        try{
//            consumer.subscribe("test","*");
//            consumer.start();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
