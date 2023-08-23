package az.company.mspublisher.service;

import az.company.mspublisher.model.queue.CardDto;
import az.company.mspublisher.queue.MessagePublisher;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
@RequiredArgsConstructor
public class MessageSenderService {

    @Value("${rabbitmq.queue.card}")
    private String cardQ;

    private final MessagePublisher messagePublisher;

    @PostConstruct
    public void sendMessageToQueue(){
        messagePublisher.publishMessage(cardQ, new CardDto("12346546", LocalDate.of(2023, Month.AUGUST,23),
                "658","ssssss"));
    }

}
