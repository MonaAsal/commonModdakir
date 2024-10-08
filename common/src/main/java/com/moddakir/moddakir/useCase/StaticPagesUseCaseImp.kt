package com.moddakir.moddakir.useCase

import com.moddakir.moddakir.network.model.AboutModel
import com.moddakir.moddakir.network.Resource
import com.moddakir.moddakir.network.model.response.ModdakirResponse
import com.moddakir.moddakir.network.model.response.ResponseModel
import com.moddakir.moddakir.network.model.response.TicketsResponse
import com.moddakir.moddakir.network.remote.RemoteRepository
import javax.inject.Inject

class StaticPagesUseCaseImp @Inject constructor(
    private val repository: RemoteRepository
) : StaticPagesUseCase {

    override suspend fun getAboutUs(): Resource<ModdakirResponse<AboutModel>> {
        return repository.getAboutUs()
    }

    override suspend fun contactUsForm(message:String,title:String): Resource<ModdakirResponse<ResponseModel>> {
        return repository.contactUsForm(message,title)
    }

    override suspend fun getListContactUs(page: Int): Resource<ModdakirResponse<TicketsResponse>> {
        return repository.getListContactUs(page)
    }

}