package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准充值收款方模型
 *
 * @author auto create
 * @since 1.0, 2024-07-17 11:00:16
 */
public class DepositPayeeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1247391635866468866L;

	/**
	 * 描述参与方信息的扩展属性，使用前请与支付宝工程师确认
	 */
	@ApiField("ext_info")
	private RepaymentParticipantExtInfo extInfo;

	/**
	 * 参与方的唯一标识。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的标识类型，目前支持如下类型： 
1、ACCOUNT_BOOK_ID 支付宝的记账本ID 
2、EMPLOYEE_ACCOUNT_ID：支付宝的专用金ID
	 */
	@ApiField("identity_type")
	private String identityType;

	public RepaymentParticipantExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(RepaymentParticipantExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
