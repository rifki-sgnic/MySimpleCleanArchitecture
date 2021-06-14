package com.dicoding.picodiploma.mysimplecleanarchitecture.data

import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}