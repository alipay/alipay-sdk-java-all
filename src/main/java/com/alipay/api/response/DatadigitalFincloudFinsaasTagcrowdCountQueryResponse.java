package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.tagcrowd.count.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-26 09:41:41
 */
public class DatadigitalFincloudFinsaasTagcrowdCountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3289715412369526119L;

	/** 
	 * 人群数量+不唯一
	 */
	@ApiField("crowd_count")
	private String crowdCount;

	public void setCrowdCount(String crowdCount) {
		this.crowdCount = crowdCount;
	}
	public String getCrowdCount( ) {
		return this.crowdCount;
	}

}
