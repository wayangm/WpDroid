package com.revosleap.wpdroid.utils.retrofit

import com.revosleap.wpdroid.utils.misc.UtilFun
import com.revosleap.wpdroid.utils.misc.Utilities
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var retrofit: Retrofit? = null
    fun getRetrofitInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(UtilFun.getUrlBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}