package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmorder.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:10:28
 */
public class AlipayMerchantMrchsurplmorderPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3351121554827793165L;

	/** 
	 * 用户当前的可用积分
	 */
	@ApiField("point")
	private Long point;

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

}
