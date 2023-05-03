package com.alihmzyv;

import com.alihmzyv.config.KafkaTopicConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Component
public class KafkaListeners {

    @KafkaListener(topics = "example-topic", groupId = "example-group")
    void listener(String data) {
        log.info("Listener received: {}", data);
    }
}
