package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.pay.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 16:37:03
 */
public class AlipayEbppIndustrySupervisionPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4756272532333848771L;

	/** 
	 * 支付单金额，单位:分  示例: 100元则传入 "10000"
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 币种 "CNY"
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 外部流水号，本次创建支付单的请求id，重复请求幂等返回
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 外部订单号，本次发起支付关联的冻资单id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付单状态:
INIT: 待处理;DEALING: 处理中;SUCCESS: 成功;FAIL: 失败;CLOSED: 已关闭;RETURN: 退回
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 收银台展示的支付标题
	 */
	@ApiField("pay_title")
	private String payTitle;

	/** 
	 * 收款方主体信息，结构字符串BASE64加密
	 */
	@ApiField("payee_participant_info")
	private String payeeParticipantInfo;

	/** 
	 * 付款方主体信息，结构字符串BASE64加密
	 */
	@ApiField("payer_participant_info")
	private String payerParticipantInfo;

	/** 
	 * 账单侧显示备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 支付宝创建的内部支付单号。后续后续根据流水号或者外部订单号查询。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}
	public String getOutFlowId( ) {
		return this.outFlowId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}
	public String getPayTitle( ) {
		return this.payTitle;
	}

	public void setPayeeParticipantInfo(String payeeParticipantInfo) {
		this.payeeParticipantInfo = payeeParticipantInfo;
	}
	public String getPayeeParticipantInfo( ) {
		return this.payeeParticipantInfo;
	}

	public void setPayerParticipantInfo(String payerParticipantInfo) {
		this.payerParticipantInfo = payerParticipantInfo;
	}
	public String getPayerParticipantInfo( ) {
		return this.payerParticipantInfo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
