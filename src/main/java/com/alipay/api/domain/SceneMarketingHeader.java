package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景营销头部信息
 *
 * @author auto create
 * @since 1.0, 2018-06-05 11:04:43
 */
public class SceneMarketingHeader extends AlipayObject {

	private static final long serialVersionUID = 2793413966586426195L;

	/**
	 * 图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
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
