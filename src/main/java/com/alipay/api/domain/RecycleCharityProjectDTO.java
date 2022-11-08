package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述公益回收捐赠项目
 *
 * @author auto create
 * @since 1.0, 2022-04-25 11:38:50
 */
public class RecycleCharityProjectDTO extends AlipayObject {

	private static final long serialVersionUID = 3596431124117831628L;

	/**
	 * 公益项目底图
	 */
	@ApiField("pic_big")
	private String picBig;

	/**
	 * 捐赠项目的ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目详情URL
	 */
	@ApiField("project_link")
	private String projectLink;

	/**
	 * 公益项目标题
	 */
	@ApiField("project_title")
	private String projectTitle;

	/**
	 * 公益项目简介
	 */
	@ApiField("subject")
	private String subject;

	public String getPicBig() {
		return this.picBig;
	}
	public void setPicBig(String picBig) {
		this.picBig = picBig;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectLink() {
		return this.projectLink;
	}
	public void setProjectLink(String projectLink) {
		this.projectLink = projectLink;
	}

	public String getProjectTitle() {
		return this.projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
