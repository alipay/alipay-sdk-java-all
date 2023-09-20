package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.eggyparty.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-01 10:16:43
 */
public class AlipaySocialAntforestEggypartyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6758689714178386298L;

	/** 
	 * 公益林用户总浇水能量克数
	 */
	@ApiField("total_water_energy")
	private String totalWaterEnergy;

	/** 
	 * 公益林总浇水次数
	 */
	@ApiField("total_water_times")
	private String totalWaterTimes;

	public void setTotalWaterEnergy(String totalWaterEnergy) {
		this.totalWaterEnergy = totalWaterEnergy;
	}
	public String getTotalWaterEnergy( ) {
		return this.totalWaterEnergy;
	}

	public void setTotalWaterTimes(String totalWaterTimes) {
		this.totalWaterTimes = totalWaterTimes;
	}
	public String getTotalWaterTimes( ) {
		return this.totalWaterTimes;
	}

}
