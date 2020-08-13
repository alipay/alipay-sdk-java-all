package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会场楼层数据项信息
 *
 * @author auto create
 * @since 1.0, 2019-10-14 21:02:31
 */
public class MiniActivityModuleQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 5241958944933996412L;

	/**
	 * 行动点文案
	 */
	@ApiField("action_text")
	private String actionText;

	/**
	 * 记录唯一标识
	 */
	@ApiField("id")
	private String id;

	/**
	 * 图片链接
	 */
	@ApiField("image")
	private String image;

	/**
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序页面
	 */
	@ApiField("page")
	private String page;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getActionText() {
		return this.actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
