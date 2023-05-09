package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:50:04
 */
public class AntfortuneEquityInstpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4774168711338747552L;

	/** 
	 * 当前积分值，表示用户在商户下的可用积分总值
	 */
	@ApiField("point_score")
	private Long pointScore;

	public void setPointScore(Long pointScore) {
		this.pointScore = pointScore;
	}
	public Long getPointScore( ) {
		return this.pointScore;
	}

}
