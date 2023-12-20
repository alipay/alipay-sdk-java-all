package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.linkedmallenergy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-12 20:01:54
 */
public class AlipaySocialAntiepLinkedmallenergyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1814698483777154175L;

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
