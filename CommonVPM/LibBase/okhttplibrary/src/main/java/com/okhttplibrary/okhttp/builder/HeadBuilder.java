package com.okhttplibrary.okhttp.builder;


import com.okhttplibrary.okhttp.OkHttpUtils;
import com.okhttplibrary.okhttp.request.OtherRequest;
import com.okhttplibrary.okhttp.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
