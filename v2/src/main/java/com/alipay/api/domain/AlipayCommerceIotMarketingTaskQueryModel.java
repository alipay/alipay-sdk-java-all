package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商海报投放根据模版查任务接口
 *
 * @author auto create
 * @since 1.0, 2026-03-23 15:50:26
 */
public class AlipayCommerceIotMarketingTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5428631965968497555L;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页参数，页大小，一页限制20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 投放计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
