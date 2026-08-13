package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AdPublicTabInfo extends AlipayObject {

	private static final long serialVersionUID = 1635792891835796458L;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 图标链接
	 */
	@ApiField("public_logo_url")
	private String publicLogoUrl;

	/**
	 * 名称
	 */
	@ApiField("public_name")
	private String publicName;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicLogoUrl() {
		return this.publicLogoUrl;
	}
	public void setPublicLogoUrl(String publicLogoUrl) {
		this.publicLogoUrl = publicLogoUrl;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
