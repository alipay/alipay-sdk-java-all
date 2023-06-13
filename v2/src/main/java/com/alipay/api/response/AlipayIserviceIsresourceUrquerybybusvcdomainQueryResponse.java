package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserResourceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.urquerybybusvcdomain.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:01:52
 */
public class AlipayIserviceIsresourceUrquerybybusvcdomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8244141527538113298L;

	/** 
	 * 相关用户资源信息
	 */
	@ApiField("biz_data")
	private OpenApiUserResourceInfo bizData;

	public void setBizData(OpenApiUserResourceInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiUserResourceInfo getBizData( ) {
		return this.bizData;
	}

}
