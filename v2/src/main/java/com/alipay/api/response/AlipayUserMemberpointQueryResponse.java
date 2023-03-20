package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:05:03
 */
public class AlipayUserMemberpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7354694298645971161L;

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
