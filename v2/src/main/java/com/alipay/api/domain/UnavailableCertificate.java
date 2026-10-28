package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:47:58
 */
public class UnavailableCertificate extends AlipayObject {

	private static final long serialVersionUID = 2331141546969116848L;

	/**
	 * 凭证ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 不可用原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
