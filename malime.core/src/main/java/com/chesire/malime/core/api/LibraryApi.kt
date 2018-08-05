package com.chesire.malime.core.api

import com.chesire.malime.core.flags.UserSeriesStatus
import com.chesire.malime.core.models.MalimeModel
import io.reactivex.Observable
import io.reactivex.Single

interface LibraryApi {
    fun addItem(item: MalimeModel): Single<MalimeModel>
    fun deleteItem(item: MalimeModel): Single<MalimeModel>
    fun getUserLibrary(): Observable<List<MalimeModel>>
    fun updateItem(
        item: MalimeModel,
        newProgress: Int,
        newStatus: UserSeriesStatus
    ): Single<MalimeModel>
}