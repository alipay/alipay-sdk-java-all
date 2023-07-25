package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-20 16:13:15
 */
public class AlipayUserMemberpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6456882924675944613L;

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
