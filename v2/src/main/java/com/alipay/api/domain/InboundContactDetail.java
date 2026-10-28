package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库结构化联系方式
 *
 * @author auto create
 * @since 1.0, 2026-10-17 11:29:27
 */
public class InboundContactDetail extends AlipayObject {

	private static final long serialVersionUID = 8385542231998321775L;

	/**
	 * 联系方式脱敏名称，如果无公开的，则可能为空
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 该联系在当前企业公开的职位信息
	 */
	@ApiField("occupation_decision")
	private String occupationDecision;

	/**
	 * 企业公开的联系方式
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getOccupationDecision() {
		return this.occupationDecision;
	}
	public void setOccupationDecision(String occupationDecision) {
		this.occupationDecision = occupationDecision;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
