package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:25:26
 */
public class AlipayUserMemberpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7436969837996837283L;

	/** 
	 * 支付宝用户的蚂蚁会员积分余额
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
