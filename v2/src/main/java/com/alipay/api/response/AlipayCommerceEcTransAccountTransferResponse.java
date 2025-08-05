package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-21 09:32:07
 */
public class AlipayCommerceEcTransAccountTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7435979324379285224L;

	/** 
	 * 支付宝支付资金流水号
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/** 
	 * 支付宝转账单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * SUCCESS：成功（对转账到银行卡的单据, 该状态可能变为退票[REFUND]）；
FAIL：失败；
DEALING：处理中（转账到支付宝账户不涉及）；
REFUND：退票（转账到支付宝账户不涉及）
	 */
	@ApiField("status")
	private String status;

	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}
	public String getFundOrderId( ) {
		return this.fundOrderId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
