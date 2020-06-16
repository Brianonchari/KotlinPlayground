package co.studycode

class Participant(val name:Name, val email: Email) {
//    val name: Name = Name()
//    val email:Email = Email()

    val participantName: String
        get() = name.name
    val canonicalEmail
        get() = email.email
}