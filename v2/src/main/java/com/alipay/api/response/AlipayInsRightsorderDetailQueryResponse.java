package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.rightsorder.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 10:37:27
 */
public class AlipayInsRightsorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6771387685898629117L;

	/** 
	 * 订单状态，SUCCESS、ASSET_CONSUMED
表示积分完成扣减后的状态；FAILED、ASSET_ROLLBACK、INIT表示积分未扣减状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
