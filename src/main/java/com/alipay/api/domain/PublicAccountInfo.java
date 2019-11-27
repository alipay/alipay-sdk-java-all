package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众账号基本信息查询的返回结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PublicAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 8745632862849841588L;

	/**
	 * 描述跳转URl
	 */
	@ApiField("desc_url")
	private String descUrl;

	/**
	 * 头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 服务窗描述
	 */
	@ApiField("public_desc")
	private String publicDesc;

	/**
	 * 服务窗ID
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 服务窗账号名称
	 */
	@ApiField("public_name")
	private String publicName;

	public String getDescUrl() {
		return this.descUrl;
	}
	public void setDescUrl(String descUrl) {
		this.descUrl = descUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getPublicDesc() {
		return this.publicDesc;
	}
	public void setPublicDesc(String publicDesc) {
		this.publicDesc = publicDesc;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
