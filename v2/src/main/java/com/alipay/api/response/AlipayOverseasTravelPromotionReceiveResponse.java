package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.promotion.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:06:53
 */
public class AlipayOverseasTravelPromotionReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239421851669488818L;

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
