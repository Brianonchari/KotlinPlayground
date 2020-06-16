package co.studycode

class Meeting {

    private val logger = Logger()
    var meetingName: String = ""
    fun addParticipants(participant: Participant) {
        if (verifyParticipant(participant))
            println("Added participant ${participant.name} , ${participant.email}")
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Verifying participant ....")
        return true
    }

    protected fun verifyMeeting() {
        //protected methods called within the class like private methods or from derived classes
    }
}

class Participant {
    var name = ""
    var email = ""
    val canonicalEmail
        get() =email.toUpperCase()
}