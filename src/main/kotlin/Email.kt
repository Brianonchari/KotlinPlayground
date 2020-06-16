package co.studycode

import java.lang.IllegalArgumentException

class Email{
    var email:String =""
        set(value:String) {
            if(value.isNullOrBlank()) throw IllegalArgumentException("Email cannot be blank")
            field = value
        }
}