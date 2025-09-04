package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserResourceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.urquerybyuid.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:50
 */
public class AlipayIserviceIsresourceUrquerybyuidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1735817487297626948L;

	/** 
	 * 业务响应
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
