package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.mcaplatform.level.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:17:12
 */
public class MybankMarketingMcaplatformLevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1394113761374443184L;

	/** 
	 * 绿色等级，不唯一
枚举值L1,L2,L3,L4,L5
	 */
	@ApiField("green_level")
	private String greenLevel;

	/** 
	 * 绿色等级成长值，0～100
	 */
	@ApiField("growth_value")
	private Long growthValue;

	public void setGreenLevel(String greenLevel) {
		this.greenLevel = greenLevel;
	}
	public String getGreenLevel( ) {
		return this.greenLevel;
	}

	public void setGrowthValue(Long growthValue) {
		this.growthValue = growthValue;
	}
	public Long getGrowthValue( ) {
		return this.growthValue;
	}

}
