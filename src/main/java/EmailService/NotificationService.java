package EmailService;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser() {
        messageService.sendMessage();
    }
}
