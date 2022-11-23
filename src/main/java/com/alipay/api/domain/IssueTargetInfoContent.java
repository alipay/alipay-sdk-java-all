package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工发放额度信息列表
 *
 * @author auto create
 * @since 1.0, 2022-11-19 12:00:26
 */
public class IssueTargetInfoContent extends AlipayObject {

	private static final long serialVersionUID = 5679246266878599663L;

	/**
	 * 发放金额
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 切换open_id前请使用：owner类型，PHONE为员工手机号，EMPLOYEE为员工支付宝uid
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：owner类型，PHONE为员工手机号，EMPLOYEE为员工open_id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

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
