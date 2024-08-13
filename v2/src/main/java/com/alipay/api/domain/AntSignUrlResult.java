package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个签署链接结果
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:43:38
 */
public class AntSignUrlResult extends AlipayObject {

	private static final long serialVersionUID = 3278419112453569961L;

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
	 * 签署链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	/**
	 * 签署方id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

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
