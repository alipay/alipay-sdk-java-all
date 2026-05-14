package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:02:43
 */
public class AntSignResult extends AlipayObject {

	private static final long serialVersionUID = 5254736265436867835L;

	/**
	 * 企业直签链接
	 */
	@ApiField("cert_sign_url")
	private String certSignUrl;

	/**
	 * 加密后的签署方证件号(用来关联签署方的签署链接)
	 */
	@ApiField("encrypt_sign_cert_no")
	private String encryptSignCertNo;

	/**
	 * 签署方名称
	 */
	@ApiField("sign_cert_name")
	private String signCertName;

	/**
	 * 签署方证件号（脱敏）
	 */
	@ApiField("sign_cert_no")
	private String signCertNo;

	/**
	 * 签署链接：电子签任务为异步任务，请确保已处于签署中（SIGNNING）状态，再给用户发送签署链接，否则用户签署会不成功
	 */
	@ApiField("sign_url")
	private String signUrl;

	/**
	 * 签署方id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getCertSignUrl() {
		return this.certSignUrl;
	}
	public void setCertSignUrl(String certSignUrl) {
		this.certSignUrl = certSignUrl;
	}

	public String getEncryptSignCertNo() {
		return this.encryptSignCertNo;
	}
	public void setEncryptSignCertNo(String encryptSignCertNo) {
		this.encryptSignCertNo = encryptSignCertNo;
	}

	public String getSignCertName() {
		return this.signCertName;
	}
	public void setSignCertName(String signCertName) {
		this.signCertName = signCertName;
	}

	public String getSignCertNo() {
		return this.signCertNo;
	}
	public void setSignCertNo(String signCertNo) {
		this.signCertNo = signCertNo;
	}

	public String getSignUrl() {
		return this.signUrl;
	}
	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
