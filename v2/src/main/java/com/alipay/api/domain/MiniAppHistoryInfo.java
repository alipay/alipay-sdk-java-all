package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最近使用小程序单项记录
 *
 * @author auto create
 * @since 1.0, 2019-10-23 17:19:52
 */
public class MiniAppHistoryInfo extends AlipayObject {

	private static final long serialVersionUID = 1457821338617937743L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图标
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 小程序slogan
	 */
	@ApiField("slogan")
	private String slogan;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}
