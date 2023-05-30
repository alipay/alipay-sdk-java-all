package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybybusvcid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-26 10:41:56
 */
public class AlipayIserviceIsresourceUserquerybybusvcidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5895584146285336529L;

	/** 
	 * 相关的用户信息
	 */
	@ApiField("biz_data")
	private OpenApiUserInfo bizData;

	public void setBizData(OpenApiUserInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiUserInfo getBizData( ) {
		return this.bizData;
	}

}
