package com.bmicro.purse.purse.yankie.service;

import com.bmicro.purse.purse.yankie.entity.PurseYankie;
import com.bmicro.purse.purse.yankie.events.EventType;
import com.bmicro.purse.purse.yankie.events.PurseYankieCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class PurseYankieEventsService {

    @Autowired
    private KafkaTemplate<String, PurseYankieCreatedEvent> producer;

    @Value("${topic.PurseYankie.name:PurseYankie}")
    private String topicPurseYankie;

    public void publish(PurseYankie purseYankie) {

        PurseYankieCreatedEvent created = new PurseYankieCreatedEvent();
        created.setData(purseYankie);
        created.setId(UUID.randomUUID().toString());
        created.setType(EventType.CREATED);
        created.setDate(new Date());

        this.producer.send(topicPurseYankie, created);
    }

}
