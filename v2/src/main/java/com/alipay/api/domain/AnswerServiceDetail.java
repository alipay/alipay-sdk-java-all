package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐服务的详情信息
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class AnswerServiceDetail extends AlipayObject {

	private static final long serialVersionUID = 4861591544767181994L;

	/**
	 * 推荐服务的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 服务id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 推荐服务展示logo图片链接地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 推荐服务的标题信息
	 */
	@ApiField("title")
	private String title;

	/**
	 * 推荐服务的跳转链接。外部机构链接，不包含扩展字段。
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
