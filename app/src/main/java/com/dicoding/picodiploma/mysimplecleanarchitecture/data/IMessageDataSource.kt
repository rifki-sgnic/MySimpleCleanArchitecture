package com.dicoding.picodiploma.mysimplecleanarchitecture.data

import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}