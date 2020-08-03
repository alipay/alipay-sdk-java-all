package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.uni.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-31 19:07:03
 */
public class AlipayFundTransUniTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4317198515876163382L;

	/** 
	 * 支付宝转账订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付宝支付资金流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/** 
	 * 转账单据状态。
SUCCESS：成功（对转账到银行卡的单据, 该状态可能变为退票[REFUND]状态）；
FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）；
DEALING：处理中；
REFUND：退票；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_date")
	private String transDate;

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

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransDate( ) {
		return this.transDate;
	}

}
