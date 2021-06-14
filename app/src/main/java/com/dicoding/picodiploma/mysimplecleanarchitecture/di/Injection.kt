package com.dicoding.picodiploma.mysimplecleanarchitecture.di

import com.dicoding.picodiploma.mysimplecleanarchitecture.data.IMessageDataSource
import com.dicoding.picodiploma.mysimplecleanarchitecture.data.MessageDataSource
import com.dicoding.picodiploma.mysimplecleanarchitecture.data.MessageRepository
import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.IMessageRepository
import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.MessageInteractor
import com.dicoding.picodiploma.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}