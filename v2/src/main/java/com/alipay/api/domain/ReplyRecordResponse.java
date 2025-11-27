package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户与商家之间的协商记录
 *
 * @author auto create
 * @since 1.0, 2025-10-24 10:35:52
 */
public class ReplyRecordResponse extends AlipayObject {

	private static final long serialVersionUID = 2438934268956531355L;

	/**
	 * 回复内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 回复时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 回复图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 回复人名称
	 */
	@ApiField("replier_name")
	private String replierName;

	/**
	 * 回复人角色
	 */
	@ApiField("replier_role")
	private String replierRole;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getReplierName() {
		return this.replierName;
	}
	public void setReplierName(String replierName) {
		this.replierName = replierName;
	}

	public String getReplierRole() {
		return this.replierRole;
	}
	public void setReplierRole(String replierRole) {
		this.replierRole = replierRole;
	}

}
