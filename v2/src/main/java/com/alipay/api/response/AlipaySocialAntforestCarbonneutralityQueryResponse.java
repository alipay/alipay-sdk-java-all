package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.carbonneutrality.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:43
 */
public class AlipaySocialAntforestCarbonneutralityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181149386171354611L;

	/** 
	 * 人人1kg预计碳中和排放量
	 */
	@ApiField("carbon_neutrality_biz_count")
	private Long carbonNeutralityBizCount;

	/** 
	 * 人人1kg参与人数
	 */
	@ApiField("carbon_neutrality_people_count")
	private Long carbonNeutralityPeopleCount;

	/** 
	 * 绿色生活方式的打卡人次
	 */
	@ApiField("green_life_tick_times")
	private Long greenLifeTickTimes;

	public void setCarbonNeutralityBizCount(Long carbonNeutralityBizCount) {
		this.carbonNeutralityBizCount = carbonNeutralityBizCount;
	}
	public Long getCarbonNeutralityBizCount( ) {
		return this.carbonNeutralityBizCount;
	}

	public void setCarbonNeutralityPeopleCount(Long carbonNeutralityPeopleCount) {
		this.carbonNeutralityPeopleCount = carbonNeutralityPeopleCount;
	}
	public Long getCarbonNeutralityPeopleCount( ) {
		return this.carbonNeutralityPeopleCount;
	}

	public void setGreenLifeTickTimes(Long greenLifeTickTimes) {
		this.greenLifeTickTimes = greenLifeTickTimes;
	}
	public Long getGreenLifeTickTimes( ) {
		return this.greenLifeTickTimes;
	}

}
