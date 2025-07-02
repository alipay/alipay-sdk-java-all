package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件信息
 *
 * @author auto create
 * @since 1.0, 2024-04-22 10:38:24
 */
public class TuitionCertificate extends AlipayObject {

	private static final long serialVersionUID = 8157164793334218444L;

	/**
	 * 证件号码
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 证件类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 证件生效时间
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 证件有效截止时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 证件姓名
	 */
	@ApiField("holder_name")
	private TuitionUserName holderName;

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

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public TuitionUserName getHolderName() {
		return this.holderName;
	}
	public void setHolderName(TuitionUserName holderName) {
		this.holderName = holderName;
	}

}
