package co.studycode



fun main() {
    val meeting = Meeting("Weekly Progress Review")
    val name= Name()
    val email = Email()
    name.name = "John"
    email.email = "onchari@email.com"
    val participant = Participant(name,email)
//    participant.name = "Brian"
//    participant.email = email
//    participant.name = name
//    participant.email ="Brian@Studycode.com"
    val canonicalEmail = participant.canonicalEmail
    meeting.addParticipants(participant)
//    meeting.meetingName = "Weekly Progress Review"
    println("Created $meeting  with name `${meeting.meetingName}`")

//    meeting.logger

}