package demo.app

import grails.testing.web.controllers.ControllerUnitTest
import mail.sender.MailSystem
import org.springframework.mail.SimpleMailMessage
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    def setup() {
    }

    def cleanup() {
    }

    void "Test that my controller can send mail."() {
        given:"a mailer"
        def mock = Mock(MailSystem)
        controller.mailSystem = mock

        when:"sendMail is called"
        controller.index()

        then:"A mail is sent"
        1 * mock.sendMail(new SimpleMailMessage(to:"fred", from:"bob"))
    }
}
