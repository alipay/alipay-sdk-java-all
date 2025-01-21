package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PointReceiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.point.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 11:38:22
 */
public class AlipayCommerceOperationPromoterPointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7533554137154938954L;

	/** 
	 * 积分领取结果
	 */
	@ApiField("point_receive_result")
	private PointReceiveInfo pointReceiveResult;

	public void setPointReceiveResult(PointReceiveInfo pointReceiveResult) {
		this.pointReceiveResult = pointReceiveResult;
	}
	public PointReceiveInfo getPointReceiveResult( ) {
		return this.pointReceiveResult;
	}

}
