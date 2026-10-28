package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.creative.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 19:41:33
 */
public class AlipayDataDataserviceAdcampaignCreativeCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1467359898658562746L;

	/** 
	 * 创意id
	 */
	@ApiField("creative_id")
	private Long creativeId;

	/** 
	 * 创意名称
	 */
	@ApiField("creative_name")
	private String creativeName;

	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}
	public Long getCreativeId( ) {
		return this.creativeId;
	}

	public void setCreativeName(String creativeName) {
		this.creativeName = creativeName;
	}
	public String getCreativeName( ) {
		return this.creativeName;
	}

}
