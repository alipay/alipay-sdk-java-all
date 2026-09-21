package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业员额度变更明细查询接口出参
 *
 * @author auto create
 * @since 1.0, 2026-08-25 00:07:51
 */
public class ClerkQuotaRecordQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 1862569344536881892L;

	/**
	 * 变更金额（元，正数，支持两位小数）
	 */
	@ApiField("change_amount")
	private String changeAmount;

	/**
	 * 变更时间
	 */
	@ApiField("change_time")
	private String changeTime;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getChangeAmount() {
		return this.changeAmount;
	}
	public void setChangeAmount(String changeAmount) {
		this.changeAmount = changeAmount;
	}

	public String getChangeTime() {
		return this.changeTime;
	}
	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
