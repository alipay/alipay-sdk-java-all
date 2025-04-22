package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理参与者模型
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:06:53
 */
public class GFAOpenAPIParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 3479673334959629265L;

	/**
	 * 参与者账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 参与者账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 参与者机构Id
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 参与者角色id（如支付宝中的uid）
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 3位。用于标识入参ip_role_id为UID或者PID
	 */
	@ApiField("ip_role_id_type")
	private String ipRoleIdType;

	/**
	 * 参与者名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参与者角色id（如支付宝中的uid）
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 参与者扩展信息。Map<String, String> 类型 JSON 字符串
	 */
	@ApiField("properties")
	private String properties;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleIdType() {
		return this.ipRoleIdType;
	}
	public void setIpRoleIdType(String ipRoleIdType) {
		this.ipRoleIdType = ipRoleIdType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

}
