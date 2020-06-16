package co.studycode

import java.lang.IllegalArgumentException

class Meeting(val meetingName: String) {

//    constructor(meetingName:String){
//        this.meetingName = meetingName
//    }

    private val logger = Logger()
    fun addParticipants(participant: Participant) {
        if (verifyParticipant(participant)) {
            println("Added participant ${participant.participantName} , ${participant.canonicalEmail}")
        }
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Verifying participant ...${participant.participantName}, ${participant.canonicalEmail}")
        return true
    }

    protected fun verifyMeeting() {
        //protected methods called within the class like private methods or from derived classes
    }
}





