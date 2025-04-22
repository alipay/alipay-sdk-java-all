package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公共事业缴费直连代扣异步扣款支付接口
 *
 * @author auto create
 * @since 1.0, 2022-11-21 15:46:16
 */
public class AlipayEbppPdeductAsyncPayModel extends AlipayObject {

	private static final long serialVersionUID = 4523945155343638371L;

	/**
	 * 分配给外部机构发起扣款时的渠道码。朗新为LANGXIN
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 二级渠道码，预留字段
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 支付宝代扣协议Id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 用户UserId在应用AppId下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户外部业务流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扣款金额，支付总金额，包含滞纳金
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户partnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentChannel() {
		return this.agentChannel;
	}
	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
