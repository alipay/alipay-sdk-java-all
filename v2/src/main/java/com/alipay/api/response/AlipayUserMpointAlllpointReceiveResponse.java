package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mpoint.alllpoint.receive response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 20:17:44
 */
public class AlipayUserMpointAlllpointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5428553826458631455L;

	/** 
	 * 用户领取状态为SUCCESS时该值才有意义，表示同步领取成功获得的积分数
	 */
	@ApiField("point")
	private Long point;

	/** 
	 * 如果用户待领取积分较少为同步领取，返回SUCCESS
如果用户待领取积分较多则为异步领取，返回DOING
	 */
	@ApiField("status")
	private String status;

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
