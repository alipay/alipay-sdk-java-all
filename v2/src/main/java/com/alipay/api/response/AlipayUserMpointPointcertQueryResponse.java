package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mpoint.pointcert.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 20:17:44
 */
public class AlipayUserMpointPointcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2497299881291943675L;

	/** 
	 * 用户待领取积分数量
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
