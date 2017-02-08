package com.gp.rxjavaretrofitdemo;

import com.gp.rxjavaretrofitdemo.entity.MovieEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ping6 on 2017/2/8.
 */

public interface MovieService {
//    @GET("top250")
//    Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);
@GET("top250")
Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);
}
