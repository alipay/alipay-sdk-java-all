package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工发放额度信息列表
 *
 * @author auto create
 * @since 1.0, 2025-06-19 14:13:39
 */
public class IssueTargetInfoContent extends AlipayObject {

	private static final long serialVersionUID = 8895655951789844991L;

	/**
	 * 当发放余额或点券时，单位为元，币种以创建制度时填写的currency为准，不填写默认为人民币。当发放类型为次卡时，单位为次。
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 切换open_id前请使用：owner类型为PHONE时该字段表示员工手机号，owner类型为EMPLOYEE时该字段表示为员工支付宝uid，owner类型为ENTERPRISE_PAY_UID时该字段表示为员工企业码id，owner类型为ENTERPRISE时可不填，如果填写仅支持填企业id，owner类型为INSTITUTION时可不填，默认为制度id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：owner类型为PHONE时，填写员工手机号，EMPLOYEE时填写员工open_id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * owner类型，用来表示owner_id的类型
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
