package demo.app

class DemoController {

    def index() {
        sendMail(to:"fred", from:"bob")
        render("Mail sent.")
    }
}
