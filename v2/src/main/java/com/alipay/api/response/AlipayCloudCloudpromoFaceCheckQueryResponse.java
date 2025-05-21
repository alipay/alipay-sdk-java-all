package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.face.check.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 11:02:08
 */
public class AlipayCloudCloudpromoFaceCheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3179152947574851187L;

	/** 
	 * 返回结果
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
