package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学习中心内容信息
 *
 * @author auto create
 * @since 1.0, 2024-12-06 13:46:20
 */
public class LearnCenterContentInfo extends AlipayObject {

	private static final long serialVersionUID = 3181425368763721993L;

	/**
	 * 内容编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 内容描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 移动端内容详情页链接
	 */
	@ApiField("mobile_url")
	private String mobileUrl;

	/**
	 * PC端内容详情页链接
	 */
	@ApiField("pc_url")
	private String pcUrl;

	/**
	 * 内容发布时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMobileUrl() {
		return this.mobileUrl;
	}
	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}

	public String getPcUrl() {
		return this.pcUrl;
	}
	public void setPcUrl(String pcUrl) {
		this.pcUrl = pcUrl;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
