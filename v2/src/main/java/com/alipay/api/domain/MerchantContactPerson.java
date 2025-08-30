package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class MerchantContactPerson extends AlipayObject {

	private static final long serialVersionUID = 5591761831627769147L;

	/**
	 * 联系人证件信息
	 */
	@ApiField("certificate_info")
	private MerchantCertificateInfo certificateInfo;

	/**
	 * 联系人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系类型
	 */
	@ApiField("type")
	private String type;

	public MerchantCertificateInfo getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(MerchantCertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
