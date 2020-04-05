package mail.sender

import org.springframework.mail.MailMessage

interface MailSystem {
    void sendMail(MailMessage message);
}
