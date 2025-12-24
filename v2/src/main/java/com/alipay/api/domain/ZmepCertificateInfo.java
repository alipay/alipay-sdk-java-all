package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商资质证照信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:19
 */
public class ZmepCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 8653363655888944768L;

	/**
	 * 发证机构
	 */
	@ApiField("authority")
	private String authority;

	/**
	 * 证书编号
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 认证信息
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 截止日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 是否处于有效期
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
