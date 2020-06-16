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

class Participant {
    var name: Name = Name()
    var email:Email = Email()

    val participantName: String
        get() = name.name
    val canonicalEmail
        get() = email.email
}

class Name {
    var name: String = ""
        set(value: String) {
            if (value.isNullOrBlank()) throw java.lang.IllegalArgumentException("Name cannot be blank")
            field = value
        }
}

class Email{
    var email:String =""
    set(value:String) {
        if(value.isNullOrBlank()) throw IllegalArgumentException("Email cannot be blank")
        field = value
    }
}