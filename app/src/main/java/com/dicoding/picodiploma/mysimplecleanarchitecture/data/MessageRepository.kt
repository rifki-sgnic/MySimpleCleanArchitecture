package com.dicoding.picodiploma.mysimplecleanarchitecture.data

import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.IMessageRepository
import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}