package mail.sender

import grails.artefact.Enhances
import org.grails.core.artefact.ControllerArtefactHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage

@Enhances(ControllerArtefactHandler.TYPE)
trait MailSender {
    @Autowired(required = false)
    MailSystem mailSystem

    void sendMail(Map message) {
        this.mailSystem.sendMail(new SimpleMailMessage(message))
    }
}
