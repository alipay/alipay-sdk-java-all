package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.enterprise.staffinfo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-19 22:14:34
 */
public class KoubeiMarketingDataEnterpriseStaffinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4165282513493551923L;

	/** 
	 * 人群ID
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
