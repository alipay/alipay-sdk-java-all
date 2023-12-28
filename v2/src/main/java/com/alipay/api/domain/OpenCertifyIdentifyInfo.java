package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸认证需要验证的身份信息
 *
 * @author auto create
 * @since 1.0, 2023-09-08 12:58:22
 */
public class OpenCertifyIdentifyInfo extends AlipayObject {

	private static final long serialVersionUID = 7737711261451718922L;

	/**
	 * 填入真实姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 填入姓名相匹配的证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 当前仅支持IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 当前仅支持CERT_INFO
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 选填手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
