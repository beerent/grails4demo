package mail.sender

import org.springframework.mail.MailMessage

class DefaultMailSystem implements MailSystem {

    @Override
    void sendMail(MailMessage message) {
        println "SENDING MAIL $message"
    }

}
