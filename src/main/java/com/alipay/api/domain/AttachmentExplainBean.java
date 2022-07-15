package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配置附件收集任务相关信息
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:42:03
 */
public class AttachmentExplainBean extends AlipayObject {

	private static final long serialVersionUID = 4496414131818538762L;

	/**
	 * 页面展示的任务描（collect_attachement值为true时必填）
	 */
	@ApiField("description")
	private String description;

	/**
	 * 附件列表，用于定义每个附件code的描述及页面展示顺序
	 */
	@ApiListField("details")
	@ApiField("detail_bean")
	private List<DetailBean> details;

	/**
	 * 页面展示的任务标题（collect_attachement值为true时必填）
	 */
	@ApiField("title")
	private String title;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<DetailBean> getDetails() {
		return this.details;
	}
	public void setDetails(List<DetailBean> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
