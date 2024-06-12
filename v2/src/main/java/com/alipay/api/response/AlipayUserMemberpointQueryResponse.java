package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:57:32
 */
public class AlipayUserMemberpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1827748344598323476L;

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
