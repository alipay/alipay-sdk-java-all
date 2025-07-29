package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度发放校验详情
 *
 * @author auto create
 * @since 1.0, 2025-06-19 14:13:39
 */
public class IssueQuotaCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 6271722946321649811L;

	/**
	 * 发放点券和余额时，单位为元，发放次卡时，单位为次
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 校验结果的原因
	 */
	@ApiField("message")
	private String message;

	/**
	 * 入参的 owner_id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 入参的  owner_open_id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * owner_type
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 校验结果
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getIssueQuota() {
		return this.issueQuota;
	}
	public void setIssueQuota(String issueQuota) {
		this.issueQuota = issueQuota;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
