package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板消息
 *
 * @author auto create
 * @since 1.0, 2022-10-31 17:43:59
 */
public class MiniAppTemplateData extends AlipayObject {

	private static final long serialVersionUID = 4578864369592531486L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片链接
	 */
	@ApiField("image")
	private String image;

	/**
	 * 跳转地址
	 */
	@ApiField("link")
	private String link;

	/**
	 * logo图片地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 小程序标题
	 */
	@ApiField("title")
	private String title;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
