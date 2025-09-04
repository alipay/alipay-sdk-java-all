package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.promo.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 10:47:26
 */
public class AlipayCommerceMedicalPromoPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8121726443714696553L;

	/** 
	 * 用户积分数
	 */
	@ApiField("num")
	private Long num;

	public void setNum(Long num) {
		this.num = num;
	}
	public Long getNum( ) {
		return this.num;
	}

}
