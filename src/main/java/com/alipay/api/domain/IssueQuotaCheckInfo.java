package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度发放校验详情
 *
 * @author auto create
 * @since 1.0, 2022-08-17 10:14:45
 */
public class IssueQuotaCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 5497132537444454182L;

	/**
	 * 发放金额
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 校验结果的原因
	 */
	@ApiField("message")
	private String message;

	/**
	 * owner_id
	 */
	@ApiField("owner_id")
	private String ownerId;

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
