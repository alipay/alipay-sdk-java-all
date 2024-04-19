package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消金分页查询活动预算
 *
 * @author auto create
 * @since 1.0, 2023-01-13 14:36:56
 */
public class MyxiaojinFinanceBudgetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7478747244969784272L;

	/**
	 * PURCHASE("PURCHASE", "采购")
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作者，不可为空，域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 分页页数，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
