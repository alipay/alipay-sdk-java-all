package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证记录
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:44:12
 */
public class EnterpriseAuthApplyDTO extends AlipayObject {

	private static final long serialVersionUID = 4492287349797647756L;

	/**
	 * 企业认证申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 企业认证审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 企业认证申请记录id
	 */
	@ApiField("auth_apply_id")
	private String authApplyId;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 法人身份证号： 快速创建，小二代入驻非必填。 普通创建，企业自入驻必填。
	 */
	@ApiField("legal_id_number")
	private String legalIdNumber;

	/**
	 * 企业法人姓名
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照截止日期
	 */
	@ApiField("license_end_date")
	private String licenseEndDate;

	/**
	 * 营业执照图片文件url
	 */
	@ApiField("license_img_url")
	private String licenseImgUrl;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuthApplyId() {
		return this.authApplyId;
	}
	public void setAuthApplyId(String authApplyId) {
		this.authApplyId = authApplyId;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getLegalIdNumber() {
		return this.legalIdNumber;
	}
	public void setLegalIdNumber(String legalIdNumber) {
		this.legalIdNumber = legalIdNumber;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLicenseEndDate() {
		return this.licenseEndDate;
	}
	public void setLicenseEndDate(String licenseEndDate) {
		this.licenseEndDate = licenseEndDate;
	}

	public String getLicenseImgUrl() {
		return this.licenseImgUrl;
	}
	public void setLicenseImgUrl(String licenseImgUrl) {
		this.licenseImgUrl = licenseImgUrl;
	}

}
