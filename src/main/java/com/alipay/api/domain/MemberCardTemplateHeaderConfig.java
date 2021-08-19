package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板头部设置
 *
 * @author auto create
 * @since 1.0, 2021-08-18 16:02:06
 */
public class MemberCardTemplateHeaderConfig extends AlipayObject {

	private static final long serialVersionUID = 5716594386524382913L;

	/**
	 * 卡模板头部logo图片URL
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 卡模板头部底图URL
	 */
	@ApiField("strip")
	private String strip;

	/**
	 * 卡模板头部显示名称
	 */
	@ApiField("title")
	private String title;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getStrip() {
		return this.strip;
	}
	public void setStrip(String strip) {
		this.strip = strip;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
