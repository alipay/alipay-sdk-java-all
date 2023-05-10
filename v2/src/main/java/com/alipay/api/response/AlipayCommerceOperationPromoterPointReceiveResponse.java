package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PointReceiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.point.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:18:48
 */
public class AlipayCommerceOperationPromoterPointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5187267529484394136L;

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
