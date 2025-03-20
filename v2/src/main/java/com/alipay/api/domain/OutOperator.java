package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部操作员
 *
 * @author auto create
 * @since 1.0, 2023-12-04 14:31:20
 */
public class OutOperator extends AlipayObject {

	private static final long serialVersionUID = 6352491457189192836L;

	/**
	 * 已经授权的权限码列表
	 */
	@ApiListField("authed_role_codes")
	@ApiField("string")
	private List<String> authedRoleCodes;

	/**
	 * 联系邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 登录名
	 */
	@ApiField("logon_name")
	private String logonName;

	/**
	 * 操作员Id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 账号id
	 */
	@ApiField("owner_id")
	private String ownerId;

	public List<String> getAuthedRoleCodes() {
		return this.authedRoleCodes;
	}
	public void setAuthedRoleCodes(List<String> authedRoleCodes) {
		this.authedRoleCodes = authedRoleCodes;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getLogonName() {
		return this.logonName;
	}
	public void setLogonName(String logonName) {
		this.logonName = logonName;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}
