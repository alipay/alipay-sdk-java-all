package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybybusvcid.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:30
 */
public class AlipayIserviceIsresourceUserquerybybusvcidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7874684193217814168L;

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
