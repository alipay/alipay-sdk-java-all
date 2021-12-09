package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.promotion.receive response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-12 21:07:36
 */
public class AlipayOverseasTravelPromotionReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391336742673336121L;

	/** 
	 * 券平台领券成功的券id
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}
	public String getOutPrizeId( ) {
		return this.outPrizeId;
	}

}
