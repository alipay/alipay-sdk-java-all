package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.fundstransfer.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-02 09:42:04
 */
public class AlipayEbppIndustrySupervisionFundstransferQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 2547913494388468636L;

	/** 
	 * 特定资金划拨场景下，内部分两阶段处理。当前字段表示中间过程的支付宝内部操作单号
	 */
	@ApiField("additional_operate_no")
	private String additionalOperateNo;

	/** 
	 * 当前查询的资金划拨记录的金额。单位：分
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 当前资金划拨记录对应的「业务场景 biz_scene 」
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 资金划拨币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 资金划拨请求接口或者退款接口返回的支付宝内部受理生成的流水单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 支付宝内部处理资金划拨相关操作涉及到的下游原始操作单号。目前只有特定场景存在关联
	 */
	@ApiField("org_operate_no")
	private String orgOperateNo;

	/** 
	 * 在商户发起退款、资金划拨操作时请求参数中的「外部流水号 out_trade_no 」
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易成功时有值:
	 */
	@ApiField("pay_finish_time")
	private String payFinishTime;

	/** 
	 * 表示收款方账户是对公账户还是对私账户
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/** 
	 * 部分资金划拨场景，且收款方为对公账户时，对应收方账户所在行的联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/** 
	 * 收款方账户户号
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/** 
	 * 资金划拨请求中的收方账户户名
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/** 
	 * 收款方账户类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/** 
	 * 付款方账户户号
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/** 
	 * 付款方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/** 
	 * 特定资金划拨场景下，中间过渡户的账户户号
保证金退保至支付宝ACS账户时需要经过监管子户过桥。该场景下，当前字段需要填写 监管子户户号
	 */
	@ApiField("relate_participant_id")
	private String relateParticipantId;

	/** 
	 * 资金划拨过程中，中间涉及到的过渡户的账户类型
在保证金退回场景下，需要有监管子户过桥。 当前字段必填且为「监管子户 CUSTODY_SUB_ACCOUNT 」
	 */
	@ApiField("relate_participant_type")
	private String relateParticipantType;

	/** 
	 * 资金划拨请求备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 查询的当前划拨记录的资金划拨场景。
	 */
	@ApiField("scene")
	private String scene;

	/** 
	 * 资金划拨结果描述，比如余额不足，账户被冻结
	 */
	@ApiField("transfer_msg")
	private String transferMsg;

	/** 
	 * SUCCESS: 成功
FAIL: 失败
DEALING: 处理中
CLOSED: 已关闭
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	public void setAdditionalOperateNo(String additionalOperateNo) {
		this.additionalOperateNo = additionalOperateNo;
	}
	public String getAdditionalOperateNo( ) {
		return this.additionalOperateNo;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOrgOperateNo(String orgOperateNo) {
		this.orgOperateNo = orgOperateNo;
	}
	public String getOrgOperateNo( ) {
		return this.orgOperateNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayFinishTime(String payFinishTime) {
		this.payFinishTime = payFinishTime;
	}
	public String getPayFinishTime( ) {
		return this.payFinishTime;
	}

	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}
	public String getPayeeAccountType( ) {
		return this.payeeAccountType;
	}

	public void setPayeeContactLine(String payeeContactLine) {
		this.payeeContactLine = payeeContactLine;
	}
	public String getPayeeContactLine( ) {
		return this.payeeContactLine;
	}

	public void setPayeeParticipantId(String payeeParticipantId) {
		this.payeeParticipantId = payeeParticipantId;
	}
	public String getPayeeParticipantId( ) {
		return this.payeeParticipantId;
	}

	public void setPayeeParticipantName(String payeeParticipantName) {
		this.payeeParticipantName = payeeParticipantName;
	}
	public String getPayeeParticipantName( ) {
		return this.payeeParticipantName;
	}

	public void setPayeeParticipantType(String payeeParticipantType) {
		this.payeeParticipantType = payeeParticipantType;
	}
	public String getPayeeParticipantType( ) {
		return this.payeeParticipantType;
	}

	public void setPayerParticipantId(String payerParticipantId) {
		this.payerParticipantId = payerParticipantId;
	}
	public String getPayerParticipantId( ) {
		return this.payerParticipantId;
	}

	public void setPayerParticipantType(String payerParticipantType) {
		this.payerParticipantType = payerParticipantType;
	}
	public String getPayerParticipantType( ) {
		return this.payerParticipantType;
	}

	public void setRelateParticipantId(String relateParticipantId) {
		this.relateParticipantId = relateParticipantId;
	}
	public String getRelateParticipantId( ) {
		return this.relateParticipantId;
	}

	public void setRelateParticipantType(String relateParticipantType) {
		this.relateParticipantType = relateParticipantType;
	}
	public String getRelateParticipantType( ) {
		return this.relateParticipantType;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setTransferMsg(String transferMsg) {
		this.transferMsg = transferMsg;
	}
	public String getTransferMsg( ) {
		return this.transferMsg;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

}
