package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家CRM会员卡权益
 *
 * @author auto create
 * @since 1.0, 2022-06-29 13:16:56
 */
public class MrchCrmMemberCardBenefit extends AlipayObject {

	private static final long serialVersionUID = 1196931248546884248L;

	/**
	 * 商家会员权益描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 权益icon图片链接，通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商家会员权益
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
