package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.logical.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:40:08
 */
public class DatadigitalFincloudFinsaasCrowdLogicalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4765835181795373369L;

	/** 
	 * 人群ID+唯一
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
