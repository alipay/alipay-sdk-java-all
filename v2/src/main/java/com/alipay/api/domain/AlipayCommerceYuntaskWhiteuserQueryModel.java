package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超导白名单查询
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:44
 */
public class AlipayCommerceYuntaskWhiteuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2537158499771848455L;

	/**
	 * 第几页，分页使用
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页数量，分页使用，单位个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 超导任务模版id，在超导SaaS后台针对任务点击操作时，将对应的任务id传过来
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
