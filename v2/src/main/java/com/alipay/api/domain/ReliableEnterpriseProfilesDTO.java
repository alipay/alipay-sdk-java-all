package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业个性化信息
 *
 * @author auto create
 * @since 1.0, 2025-08-04 19:43:32
 */
public class ReliableEnterpriseProfilesDTO extends AlipayObject {

	private static final long serialVersionUID = 4424238593411583874L;

	/**
	 * 企业注册来源渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 企业在来源渠道（如钉钉）的活跃度
	 */
	@ApiField("activity_level")
	private String activityLevel;

	/**
	 * 企业在来源渠道（如钉钉）的认证类型
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 企业营业执照编码，适用于未三证合一的企业
	 */
	@ApiField("biz_license_no")
	private String bizLicenseNo;

	/**
	 * 企业在来源渠道（如钉钉）的营业执照照片URL
	 */
	@ApiField("biz_license_url")
	private String bizLicenseUrl;

	/**
	 * 企业当前的员工数规模区间
	 */
	@ApiField("count_employee")
	private String countEmployee;

	/**
	 * 企业法人的身份证号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 企业在来源渠道（如钉钉）的注册时间
	 */
	@ApiField("platform_gmt_create")
	private String platformGmtCreate;

	/**
	 * 企业纳税人识别号，适用于未三证合一的企业
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getActivityLevel() {
		return this.activityLevel;
	}
	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getBizLicenseNo() {
		return this.bizLicenseNo;
	}
	public void setBizLicenseNo(String bizLicenseNo) {
		this.bizLicenseNo = bizLicenseNo;
	}

	public String getBizLicenseUrl() {
		return this.bizLicenseUrl;
	}
	public void setBizLicenseUrl(String bizLicenseUrl) {
		this.bizLicenseUrl = bizLicenseUrl;
	}

	public String getCountEmployee() {
		return this.countEmployee;
	}
	public void setCountEmployee(String countEmployee) {
		this.countEmployee = countEmployee;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getPlatformGmtCreate() {
		return this.platformGmtCreate;
	}
	public void setPlatformGmtCreate(String platformGmtCreate) {
		this.platformGmtCreate = platformGmtCreate;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
