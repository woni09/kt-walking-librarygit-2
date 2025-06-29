package miniprojectver.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import miniprojectver.config.kafka.KafkaProcessor;
import miniprojectver.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PointViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PointViewRepository pointViewRepository;
    //>>> DDD / CQRS
}
