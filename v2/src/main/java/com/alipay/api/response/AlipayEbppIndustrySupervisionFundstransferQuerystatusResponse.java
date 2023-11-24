package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.fundstransfer.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:31:44
 */
public class AlipayEbppIndustrySupervisionFundstransferQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 2724383123751827221L;

	/** 
	 * 资金划拨的金额（单位分）
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 资金划拨币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 外部流水号确保每一笔资金划拨请求幂等。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易成功时有值
	 */
	@ApiField("pay_finish_time")
	private String payFinishTime;

	/** 
	 * 保证金退款场景下，填收方账户类型，本次写02，代表对公户
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/** 
	 * 保证金退款场景下，填收方账户所在行的联行号，本次为支付宝联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/** 
	 * 收方参与者ID
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/** 
	 * 保证金退款场景下，收方户名必填
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/** 
	 * 收方参与者类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/** 
	 * 付方参与者ID
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/** 
	 * 付款方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/** 
	 * 保证金退保至支付宝ACS账户时需要经过监管子户过桥。该场景下，当前字段需要填写驾校监管子户号
	 */
	@ApiField("relate_participant_id")
	private String relateParticipantId;

	/** 
	 * 在保证金退回场景下，需要有监管子户过桥。 当前字段必填且为驾校监管子户
	 */
	@ApiField("relate_participant_type")
	private String relateParticipantType;

	/** 
	 * 资金划拨请求备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 资金划拨场景
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
