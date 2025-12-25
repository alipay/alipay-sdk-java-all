package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出生证明和户口簿识别
 *
 * @author auto create
 * @since 1.0, 2025-07-01 09:54:26
 */
public class AlipayCommerceMedicalLargermodelCertificateIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7273976313864686433L;

	/**
	 * 出生证明：birth_certificate
户口本：household_register
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 图片Base64编码（与imageUrl二选一）
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * 图片URL（与imageContent二选一）
	 */
	@ApiField("image_url")
	private String imageUrl;

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
