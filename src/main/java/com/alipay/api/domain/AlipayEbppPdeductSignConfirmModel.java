package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣签约确认
 *
 * @author auto create
 * @since 1.0, 2020-02-14 16:58:14
 */
public class AlipayEbppPdeductSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1596836975882874257L;

	/**
	 * 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 二级渠道码，预留字段
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 支付宝缴费系统中的出账机构ID
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 错误编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 户号签约失败原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部产生的协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/**
	 * 商户PartnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 流水号，用于跨系统追踪请求状态，无业务意义
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 签约是否成功，T:成功，F:失败
	 */
	@ApiField("sign_result")
	private String signResult;

	/**
	 * 蚂蚁统一会员ID
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

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getOutAgreementId() {
		return this.outAgreementId;
	}
	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSignResult() {
		return this.signResult;
	}
	public void setSignResult(String signResult) {
		this.signResult = signResult;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
