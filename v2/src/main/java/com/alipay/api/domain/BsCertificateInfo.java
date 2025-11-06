package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证照信息
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:37
 */
public class BsCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 2534844473847431423L;

	/**
	 * 证照图片
	 */
	@ApiField("certificate_img")
	private String certificateImg;

	/**
	 * 证照类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	public String getCertificateImg() {
		return this.certificateImg;
	}
	public void setCertificateImg(String certificateImg) {
		this.certificateImg = certificateImg;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

}
