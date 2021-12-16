package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询活动预算
 *
 * @author auto create
 * @since 1.0, 2021-04-21 15:23:41
 */
public class AlipayBossFncAntbudgetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5884636414656477691L;

	/**
	 * COMMISSION("COMMISSION", "返佣"),
    PURCHASE("PURCHASE", "采购"),
    PROMO("PROMO", "营销"),
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作者，不可为空，域账号,
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
