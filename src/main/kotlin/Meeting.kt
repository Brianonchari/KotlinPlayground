package co.studycode

import java.lang.IllegalArgumentException

class Meeting {

    private val logger = Logger()
    var meetingName: String = ""
    fun addParticipants(participant: Participant) {
        if (verifyParticipant(participant)) {
            println("Added participant ${participant.participantName} , ${participant.canonicalEmail}")
        }
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Verifying participant ....")
        return true
    }

    protected fun verifyMeeting() {
        //protected methods called within the class like private methods or from derived classes
    }
}





