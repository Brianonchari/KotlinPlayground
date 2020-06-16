package co.studycode



fun main() {
    val meeting = Meeting("Weekly Progress Review")
    val participant = Participant()
//    participant.name = "Brian"
    val name= Name()
    val email = Email()
    name.name = "John"
    email.email = "onchari@email.com"
    participant.email = email
    participant.name = name

//    participant.email ="Brian@Studycode.com"
    val canonicalEmail = participant.canonicalEmail
    meeting.addParticipants(participant)
//    meeting.meetingName = "Weekly Progress Review"
    println("Created $meeting  with name `${meeting.meetingName}`")

//    meeting.logger

}