package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝品牌信息
 *
 * @author auto create
 * @since 1.0, 2026-09-03 10:45:47
 */
public class AlipayBrandDTO extends AlipayObject {

	private static final long serialVersionUID = 8494494261389935117L;

	/**
	 * 用于支付宝品牌心智中的支付成功logo
	 */
	@ApiField("check_icon_url")
	private String checkIconUrl;

	/**
	 * 支付宝品牌心智slogan
	 */
	@ApiField("content")
	private String content;

	/**
	 * 支付宝产品图标地址链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 支付宝产品文案标题
	 */
	@ApiField("title")
	private String title;

	public String getCheckIconUrl() {
		return this.checkIconUrl;
	}
	public void setCheckIconUrl(String checkIconUrl) {
		this.checkIconUrl = checkIconUrl;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
