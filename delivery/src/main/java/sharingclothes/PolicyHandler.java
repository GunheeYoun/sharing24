package sharingclothes;

import sharingclothes.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrdered_Ship(@Payload Ordered ordered){

        if(ordered.isMe()){
            // 배송업체와 전문교환
            // 고객에게 SNS ('배송시작됨' 알림)


            // Delivery Aggregate에 등록

            Delivery delivery = new Delivery();
            delivery.setOrderId(ordered.getId());
            //order의 id를 delivery객체의 orderId에 set
            delivery.setStatus("Shipped");

            deliveryRepository.save(delivery);

            System.out.println("##### listener Ship : " + ordered.toJson());
        }
    }

}
