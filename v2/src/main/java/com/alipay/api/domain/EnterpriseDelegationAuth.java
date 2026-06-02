package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:02:50
 */
public class EnterpriseDelegationAuth extends AlipayObject {

	private static final long serialVersionUID = 7666976974412146156L;

	/**
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 授权时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 授权方ID
	 */
	@ApiField("licensor")
	private String licensor;

	/**
	 * 授权方名称
	 */
	@ApiField("licensor_name")
	private String licensorName;

	/**
	 * 授权方ID
	 */
	@ApiField("licensor_open_id")
	private String licensorOpenId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getLicensor() {
		return this.licensor;
	}
	public void setLicensor(String licensor) {
		this.licensor = licensor;
	}

	public String getLicensorName() {
		return this.licensorName;
	}
	public void setLicensorName(String licensorName) {
		this.licensorName = licensorName;
	}

	public String getLicensorOpenId() {
		return this.licensorOpenId;
	}
	public void setLicensorOpenId(String licensorOpenId) {
		this.licensorOpenId = licensorOpenId;
	}

}
