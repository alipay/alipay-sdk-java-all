package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人信息
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:11:44
 */
public class PersonInfo extends AlipayObject {

	private static final long serialVersionUID = 1739878677798622919L;

	/**
	 * 身份证有效期开始日,格式（yyyy-MM-dd）
	 */
	@ApiField("cert_effective_date")
	private String certEffectiveDate;

	/**
	 * 身份证有效期到期日,格式（yyyy-MM-dd）,其中long 长期
	 */
	@ApiField("cert_expiration_date")
	private String certExpirationDate;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，RESIDENT-居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getCertEffectiveDate() {
		return this.certEffectiveDate;
	}
	public void setCertEffectiveDate(String certEffectiveDate) {
		this.certEffectiveDate = certEffectiveDate;
	}

	public String getCertExpirationDate() {
		return this.certExpirationDate;
	}
	public void setCertExpirationDate(String certExpirationDate) {
		this.certExpirationDate = certExpirationDate;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
