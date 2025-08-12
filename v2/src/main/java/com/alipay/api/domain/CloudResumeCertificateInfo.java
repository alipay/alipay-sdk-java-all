package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书基本信息
 *
 * @author auto create
 * @since 1.0, 2023-07-17 10:10:48
 */
public class CloudResumeCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 5424663488475368178L;

	/**
	 * 证书等级
	 */
	@ApiField("certificate_cert_level")
	private String certificateCertLevel;

	/**
	 * 证书名称
	 */
	@ApiField("certificate_name")
	private String certificateName;

	/**
	 * 发证机构
	 */
	@ApiField("certificate_send_card_address")
	private String certificateSendCardAddress;

	/**
	 * UNPROMISED=未承诺
PROMISED=已承诺
VERFIED=已验真
UNVERIFIED=验证未通过
	 */
	@ApiField("certificate_verify_status")
	private String certificateVerifyStatus;

	/**
	 * VALID=有效
INVALID=失效
UNKNOWN=未知
	 */
	@ApiField("in_validity_period")
	private String inValidityPeriod;

	public String getCertificateCertLevel() {
		return this.certificateCertLevel;
	}
	public void setCertificateCertLevel(String certificateCertLevel) {
		this.certificateCertLevel = certificateCertLevel;
	}

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateSendCardAddress() {
		return this.certificateSendCardAddress;
	}
	public void setCertificateSendCardAddress(String certificateSendCardAddress) {
		this.certificateSendCardAddress = certificateSendCardAddress;
	}

	public String getCertificateVerifyStatus() {
		return this.certificateVerifyStatus;
	}
	public void setCertificateVerifyStatus(String certificateVerifyStatus) {
		this.certificateVerifyStatus = certificateVerifyStatus;
	}

	public String getInValidityPeriod() {
		return this.inValidityPeriod;
	}
	public void setInValidityPeriod(String inValidityPeriod) {
		this.inValidityPeriod = inValidityPeriod;
	}

}
