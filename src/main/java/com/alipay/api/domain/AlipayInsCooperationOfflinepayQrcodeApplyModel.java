package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （当面付）生成支付二维码
 *
 * @author auto create
 * @since 1.0, 2017-08-01 20:47:09
 */
public class AlipayInsCooperationOfflinepayQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8284262781186967458L;

	/**
	 * 保险代理人在保险公司的惟一ID，由保险公司内部系统决定
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 线下投保单的惟一ID。由此来关联交易，并响应蚂蚁保险平台的回调通知
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 证件类型标识，具体值符合证件类型枚举值
	 */
	@ApiField("id_type")
	private Long idType;

	/**
	 * 保险公司在蚂蚁保险平台的惟一ID，由蚂蚁保险平台分配
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 保费金额，由（分）为单位。如33220，表示332.20元。务必确保计费单位是分，否则金额会相差100倍
	 */
	@ApiField("payment_amount")
	private Long paymentAmount;

	/**
	 * 线下投保单对应的投保人的有效证件号。由id_type来决定证件类型，如身份证号、护照号、军官证等
	 */
	@ApiField("policyholder_id")
	private String policyholderId;

	/**
	 * 线下投保单对应的投保人中文姓名
	 */
	@ApiField("policyholder_name")
	private String policyholderName;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public Long getIdType() {
		return this.idType;
	}
	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Long getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPolicyholderId() {
		return this.policyholderId;
	}
	public void setPolicyholderId(String policyholderId) {
		this.policyholderId = policyholderId;
	}

	public String getPolicyholderName() {
		return this.policyholderName;
	}
	public void setPolicyholderName(String policyholderName) {
		this.policyholderName = policyholderName;
	}

}
