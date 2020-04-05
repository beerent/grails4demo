package mail.sender

import org.springframework.mail.SimpleMailMessage
import spock.lang.Specification

class MailSenderSpec extends Specification {
    void "Test that we can send mail"() {
        given:"a mailer"
        def test = new TestMailer()
        def mock = Mock(MailSystem)
        test.mailSystem = mock

        when:"sendMail is called"
        test.sendMail(to:"fred", from:"bob")

        then:"A mail is sent"
        1 * mock.sendMail(new SimpleMailMessage(to:"fred", from:"bob"))
    }
}

class TestMailer implements MailSender {

}
