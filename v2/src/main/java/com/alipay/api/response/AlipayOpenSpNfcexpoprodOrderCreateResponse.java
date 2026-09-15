package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nfcexpoprod.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:12:51
 */
public class AlipayOpenSpNfcexpoprodOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3789923219335154375L;

	/** 
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

}
