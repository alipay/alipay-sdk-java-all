package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybyuserid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:01:44
 */
public class AlipayIserviceIsresourceUserquerybyuseridQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246358271163696826L;

	/** 
	 * 相关用户信息
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
