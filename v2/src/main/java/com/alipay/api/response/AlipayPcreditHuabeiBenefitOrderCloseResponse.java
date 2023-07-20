package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:04:02
 */
public class AlipayPcreditHuabeiBenefitOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3856278499971292614L;

	/** 
	 * 权益订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户侧唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
