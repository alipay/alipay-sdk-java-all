package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.expandindirect.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 14:20:00
 */
public class AlipayFundExpandindirectOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534384422765885142L;

	/** 
	 * 进件单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 进件单状态
	 */
	@ApiField("status")
	private String status;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
