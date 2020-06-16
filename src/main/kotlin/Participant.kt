package co.studycode

class Participant {
    var name: Name = Name()
    var email:Email = Email()

    val participantName: String
        get() = name.name
    val canonicalEmail
        get() = email.email
}