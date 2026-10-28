package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class CertificateInfoItem extends AlipayObject {

	private static final long serialVersionUID = 5867865612499457658L;

	/**
	 * 证照号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证照类型
	 */
	@ApiField("cert_type")
	private String certType;

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

}
