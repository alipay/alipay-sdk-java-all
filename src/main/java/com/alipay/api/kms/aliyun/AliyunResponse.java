package com.alipay.api.kms.aliyun;

import com.alipay.api.kms.aliyun.http.UnmarshallerContext;

public abstract class AliyunResponse {
    public abstract AliyunResponse getInstance(UnmarshallerContext context);
}
