package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工发放额度信息列表
 *
 * @author auto create
 * @since 1.0, 2023-04-26 09:39:36
 */
public class IssueTargetInfoContent extends AlipayObject {

	private static final long serialVersionUID = 1737186965219757117L;

	/**
	 * 发放金额
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 切换open_id前请使用：owner类型为PHONE时该字段表示员工手机号，owner类型为为EMPLOYEE时该字段表示为员工支付宝uid，owner类型为为ENTERPRISE_PAY_UID时该字段表示为员工企业码id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：owner类型，PHONE为员工手机号，EMPLOYEE为员工open_id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * owner类型，用来表示owner_id的类型;
enterprise_id支持PHONE、ENTERPRISE_PAY_UID类型；account_id支持EMPLOYEE类型
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

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
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
