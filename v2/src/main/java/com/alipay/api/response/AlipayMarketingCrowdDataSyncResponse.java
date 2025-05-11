package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.crowd.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayMarketingCrowdDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7226328327375116195L;

	/** 
	 * 人群记录ID
	 */
	@ApiField("crowd_record_id")
	private String crowdRecordId;

	public void setCrowdRecordId(String crowdRecordId) {
		this.crowdRecordId = crowdRecordId;
	}
	public String getCrowdRecordId( ) {
		return this.crowdRecordId;
	}

}
