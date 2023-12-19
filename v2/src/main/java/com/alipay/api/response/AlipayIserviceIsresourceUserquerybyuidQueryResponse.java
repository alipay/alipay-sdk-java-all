package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybyuid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 11:41:48
 */
public class AlipayIserviceIsresourceUserquerybyuidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7633662823562826939L;

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
