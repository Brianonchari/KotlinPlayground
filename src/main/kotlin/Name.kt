package co.studycode

class Name {
    var name: String = ""
        set(value: String) {
            if (value.isNullOrBlank()) throw java.lang.IllegalArgumentException("Name cannot be blank")
            field = value
        }
}