package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-27 19:54:19
 */
public class AlipayFundWalletOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4265937691229627597L;

	/** 
	 * 关单是否成功
	 */
	@ApiField("close_order")
	private Boolean closeOrder;

	/** 
	 * 订单id
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	public void setCloseOrder(Boolean closeOrder) {
		this.closeOrder = closeOrder;
	}
	public Boolean getCloseOrder( ) {
		return this.closeOrder;
	}

	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}
	public String getFundOrderId( ) {
		return this.fundOrderId;
	}

}
