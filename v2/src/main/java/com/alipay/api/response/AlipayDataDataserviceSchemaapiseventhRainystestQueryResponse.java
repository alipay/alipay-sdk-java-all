package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapiseventh.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:56
 */
public class AlipayDataDataserviceSchemaapiseventhRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7729913735753517862L;

	/** 
	 * id
	 */
	@ApiField("user_id")
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
