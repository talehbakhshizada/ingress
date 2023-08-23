package az.company.mspublisher.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessagePublisher {

    private final AmqpTemplate template;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public <T> void publishMessage(String queue, T data) {
        log.info("ActionLog.publishMessage.Started");
        template.convertAndSend(queue, objectMapper.writeValueAsString(data));
        log.info("ActionLog.publishMessage.End");
    }
}
