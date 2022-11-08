package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户证件对象
 *
 * @author auto create
 * @since 1.0, 2020-06-17 14:04:53
 */
public class Certificate extends AlipayObject {

	private static final long serialVersionUID = 3548364545961457337L;

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

}
