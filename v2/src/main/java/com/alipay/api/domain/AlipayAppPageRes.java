package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序页面信息
 *
 * @author auto create
 * @since 1.0, 2025-05-09 10:54:59
 */
public class AlipayAppPageRes extends AlipayObject {

	private static final long serialVersionUID = 6285964911597878418L;

	/**
	 * 标题链接
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 应用标识
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序位置
	 */
	@ApiField("page_type")
	private String pageType;

	/**
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPageType() {
		return this.pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
