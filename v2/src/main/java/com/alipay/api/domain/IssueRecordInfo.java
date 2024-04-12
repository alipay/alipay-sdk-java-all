package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手工发放发放记录信息详情
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:56:29
 */
public class IssueRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 5466918224226273186L;

	/**
	 * 发放金额，支持两位小数，单位为（元）
	 */
	@ApiField("issue_quota")
	private String issueQuota;

	/**
	 * 发放状态描述
0: "未发放"
1: "发放成功"
2: "待作废"
3: "已作废"
4: "作废失败，有消费记录"
5: "发放中"
	 */
	@ApiField("issue_status")
	private Long issueStatus;

	/**
	 * 根据owner_type返回对应的owner_id，例如：owner_type为PHONE，则owner_id返回手机号
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 切换open_id后请使用：owner_type为PHONE，返回员工手机号，owner_type为EMPLOYEE，返回员工open_id，owner_type为ENTERPRISE_PAY_UID，返回员工企业码id
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 用来指定owner_id的类型，具体返回值参考枚举值
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 发放状态为发放成功的可返回额度id，未发放和发放中的无法返回额度id
	 */
	@ApiField("quota_id")
	private String quotaId;

	/**
	 * 发放对应的员工名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getIssueQuota() {
		return this.issueQuota;
	}
	public void setIssueQuota(String issueQuota) {
		this.issueQuota = issueQuota;
	}

	public Long getIssueStatus() {
		return this.issueStatus;
	}
	public void setIssueStatus(Long issueStatus) {
		this.issueStatus = issueStatus;
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

	public String getQuotaId() {
		return this.quotaId;
	}
	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
