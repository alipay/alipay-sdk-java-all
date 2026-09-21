package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向营业员额度配置
 *
 * @author auto create
 * @since 1.0, 2026-08-25 00:07:50
 */
public class AlipayCommerceEcRecyclinginvoiceClerkquotaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1721413215218768536L;

	/**
	 * 变更金额（元，正数，支持两位小数）
	 */
	@ApiField("change_amount")
	private String changeAmount;

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
	 * 额度类型，默认为年额度:YEARLY
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getChangeAmount() {
		return this.changeAmount;
	}
	public void setChangeAmount(String changeAmount) {
		this.changeAmount = changeAmount;
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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
