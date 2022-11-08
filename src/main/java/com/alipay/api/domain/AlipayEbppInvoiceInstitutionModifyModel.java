package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度编辑
 *
 * @author auto create
 * @since 1.0, 2022-08-18 15:39:19
 */
public class AlipayEbppInvoiceInstitutionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8245571965132196633L;

	/**
	 * 企业共同账户id（条件必填）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号（条件必填）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 制度是否启用（可空），"0"为停用，"1"为启用
	 */
	@ApiField("effective")
	private String effective;

	/**
	 * 制度生效结束时间（可空），最小粒度为天，最早是当日
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 制度生效起始时间（可空），最小粒度为天，最早是当日
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业id（条件必填）
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度描述（可空）
	 */
	@ApiField("institution_desc")
	private String institutionDesc;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 制度名称（可空）
	 */
	@ApiField("institution_name")
	private String institutionName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEffective() {
		return this.effective;
	}
	public void setEffective(String effective) {
		this.effective = effective;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionDesc() {
		return this.institutionDesc;
	}
	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

}
