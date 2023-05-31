package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用企业授权信息模型
 *
 * @author auto create
 * @since 1.0, 2023-05-26 15:06:53
 */
public class EpAuthContent extends AlipayObject {

	private static final long serialVersionUID = 7713251732373136133L;

	/**
	 * 企业信用等级
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/**
	 * 企业授权单号
	 */
	@ApiField("ep_auth_no")
	private String epAuthNo;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 证件号码，仅支持身份证号
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 个人用户姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	public String getCreditLevel() {
		return this.creditLevel;
	}
	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public String getEpAuthNo() {
		return this.epAuthNo;
	}
	public void setEpAuthNo(String epAuthNo) {
		this.epAuthNo = epAuthNo;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

}
