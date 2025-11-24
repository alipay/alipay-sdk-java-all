package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐问题，当card_type为FUNCTIONAL_CARD是为必填
 *
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:28
 */
public class RecommendQuestion extends AlipayObject {

	private static final long serialVersionUID = 7232426281168968145L;

	/**
	 * 点击推荐问题的行为
	 */
	@ApiField("click_action")
	private String clickAction;

	/**
	 * 当点击行为为CHAT时，点击推荐问题会发送该文本
	 */
	@ApiField("recommend_query")
	private String recommendQuery;

	/**
	 * 推荐问题副标题，建议15字以内
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 推荐问题主标题，建议8个字以内
	 */
	@ApiField("title")
	private String title;

	/**
	 * 当点击行为为LINK时，点击后跳转的链接
	 */
	@ApiField("url")
	private String url;

	public String getClickAction() {
		return this.clickAction;
	}
	public void setClickAction(String clickAction) {
		this.clickAction = clickAction;
	}

	public String getRecommendQuery() {
		return this.recommendQuery;
	}
	public void setRecommendQuery(String recommendQuery) {
		this.recommendQuery = recommendQuery;
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
