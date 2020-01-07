package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 附件信息（E签宝）
 *
 * @author auto create
 * @since 1.0, 2019-12-25 10:59:03
 */
public class AttachmentExplain extends AlipayObject {

	private static final long serialVersionUID = 7896896341997693442L;

	/**
	 * 是否允许上传更多附件 （collect_attachement值为true时必填）
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
