package com.example.unittest2.ProjectTest

object RegistrationUtil {
    private val existingUser = listOf("Peter","Carl")
    /**
     *  the input is not valid if...
     *  the userName/password is empty
     *  the userName is already taken
     *  the confirmed password is not the same as the real password
     *  the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ) : Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in existingUser) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count() {it.isDigit()}  > 1) {
            return false
        }
        return true
    }

}