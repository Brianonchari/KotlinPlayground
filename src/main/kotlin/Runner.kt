package co.studycode



fun main() {
    val meeting = Meeting("Weekly Progress Review",Location(" address location"))
    val name= Name()
    val email = Email()
    name.name = "John"
    email.email = "onchari@email.com"
    val participant = Participant(name,email)

    val canonicalEmail = participant.canonicalEmail
    meeting.addParticipants(participant)
//    meeting.meetingName = "Weekly Progress Review"
    println("Created $meeting  with name `${meeting.meetingName}` and at ${meeting.location}")

//    meeting.logger

}