package com.example.unittest2.ProjectTest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {
    @Test
    fun `empty UserName returns false` () {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "112",
            "112"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid UserName and correctly repeated password returns true` () {
        val result = RegistrationUtil.validateRegistrationInput(
            "derya",
            "abcde",
            "abcde"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `userName already exists returns false` () {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "112",
            "112"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "derya",
            "",
            ""
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `password repeated in incorrectly way returns false` () {
        val result = RegistrationUtil.validateRegistrationInput(
            "derya",
            "12345",
            "54321"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits` () {
        val result = RegistrationUtil.validateRegistrationInput(
            "derya",
            "120000 7463784",
            "120000 7463784"
        )
        assertThat(result).isFalse()
    }
}