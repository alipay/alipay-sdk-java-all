package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 15:07:22
 */
public class AlipayCommerceEcTransOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7364749939792614444L;

	/** 
	 * 转账总金额，单位为元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 转账通道费，转账到卡是会产生。单位为元，精确到小数点后两位
	 */
	@ApiField("order_fee")
	private String orderFee;

	/** 
	 * 支付宝转账单
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 宝支付资金流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/** 
	 * SUCCESS：成功（对转账到银行卡的单据, 该状态可能变为退票[REFUND]）； FAIL：失败； DEALING：处理中（转账到支付宝账户不涉及）； REFUND：退票（转账到支付宝账户不涉及）
	 */
	@ApiField("status")
	private String status;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderFee(String orderFee) {
		this.orderFee = orderFee;
	}
	public String getOrderFee( ) {
		return this.orderFee;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}
	public String getPayFundOrderId( ) {
		return this.payFundOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
