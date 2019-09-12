package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.point.authbase.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-22 11:00:33
 */
public class AlipayUserPointAuthbaseSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4643212678179137251L;

	/** 
	 * 实际给用户发放的积分数，由于单个用户有日限额，所以实际发放的积分数可能小于请求发放的积分数
	 */
	@ApiField("send_point")
	private Long sendPoint;

	public void setSendPoint(Long sendPoint) {
		this.sendPoint = sendPoint;
	}
	public Long getSendPoint( ) {
		return this.sendPoint;
	}

}
