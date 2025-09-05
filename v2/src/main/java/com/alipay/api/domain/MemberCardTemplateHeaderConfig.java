package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板头部设置
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardTemplateHeaderConfig extends AlipayObject {

	private static final long serialVersionUID = 8761533694199579966L;

	/**
	 * 卡模板头部logo图片URL, 通过https://docs.open.alipay.com/common/105258 接口上传图片获得
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 卡模板头部底图URL,通过https://docs.open.alipay.com/common/105258 接口上传图片获得
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
