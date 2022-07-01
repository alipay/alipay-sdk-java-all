package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 附件信息（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class AttachmentExplain extends AlipayObject {

	private static final long serialVersionUID = 6726845193629561391L;

	/**
	 * 允许上传更多附件。开启后，除了“附件列表”中指定的内容，签署人可自由上传之多10张图片。默认值为false
	 */
	@ApiField("allow_more_uploads")
	private Boolean allowMoreUploads;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 附件列表
	 */
	@ApiListField("details")
	@ApiField("detail")
	private List<Detail> details;

	/**
	 * 附件标题（collect_attachement值为true时必填
	 */
	@ApiField("title")
	private String title;

	public Boolean getAllowMoreUploads() {
		return this.allowMoreUploads;
	}
	public void setAllowMoreUploads(Boolean allowMoreUploads) {
		this.allowMoreUploads = allowMoreUploads;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<Detail> getDetails() {
		return this.details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
