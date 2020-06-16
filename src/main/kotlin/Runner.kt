package co.studycode

fun main(){
    val meeting = Meeting()
    val participant = Participant()
    participant.name = "Brian"
    participant.email ="Brian@Studycode.com"
    val canonicalEmail = participant.canonicalEmail
    meeting.addParticipants(participant)
    meeting.meetingName = "Weekly Progress Review"
    println("Created meeting `${meeting.meetingName}`")

//    meeting.logger

}