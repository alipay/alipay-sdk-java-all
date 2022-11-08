package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工发放额度信息列表
 *
 * @author auto create
 * @since 1.0, 2022-07-11 21:18:24
 */
public class IssueTargetInfoContent extends AlipayObject {

	private static final long serialVersionUID = 1853825985928314337L;

	/**
	 * 发放金额
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * owner_id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * owner类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 员工姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getIssueQuota() {
		return this.issueQuota;
	}
	public void setIssueQuota(String issueQuota) {
		this.issueQuota = issueQuota;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
