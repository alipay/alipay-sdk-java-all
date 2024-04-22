package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.uni.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 17:26:42
 */
public class AlipayFundTransUniTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6241328371537132331L;

	/** 
	 * 转账金额，单位为元，默认为空，特殊场景提供。
	 */
	@ApiField("amount")
	private String amount;

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
	 * 金融机构发起签约类、支付类、差错类业务时，应为每笔业务分配唯一的交易流水号。31位交易流水号组成规则为：“8位日期”+“16位序列号”+“1位预留位”+“6位控制位”，其中：
a）“8位日期”为系统当前日期，ISODate格式：“YYYYMMDD”
b）“16位序列号”由金融机构生成，金融机构应确保该值在网联当日唯一
c）“1位预留位”由平台分配
d）“6位控制位”由金融机构通过平台获取
例如：2023052993044491260542090100400
	 */
	@ApiField("settle_serial_no")
	private String settleSerialNo;

	/** 
	 * 转账单据状态。
SUCCESS（该笔转账交易成功）：成功；
FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）；
DEALING：处理中（转账到支付宝账户不涉及）；
REFUND：退票（转账到支付宝账户不涉及）；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_date")
	private String transDate;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

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

	public void setSettleSerialNo(String settleSerialNo) {
		this.settleSerialNo = settleSerialNo;
	}
	public String getSettleSerialNo( ) {
		return this.settleSerialNo;
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
