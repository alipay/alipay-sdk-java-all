package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单分页查询
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:01:00
 */
public class AlipayCommerceMerchantcardDeductionorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1596488969941319731L;

	/**
	 * 订购单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 订单结束时间
	 */
	@ApiField("deduction_end_date")
	private String deductionEndDate;

	/**
	 * 订单开始时间
	 */
	@ApiField("deduction_start_date")
	private String deductionStartDate;

	/**
	 * 订单状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 订购结束时间
	 */
	@ApiField("order_end_date")
	private String orderEndDate;

	/**
	 * 订购开始时间
	 */
	@ApiField("order_start_date")
	private String orderStartDate;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionEndDate() {
		return this.deductionEndDate;
	}
	public void setDeductionEndDate(String deductionEndDate) {
		this.deductionEndDate = deductionEndDate;
	}

	public String getDeductionStartDate() {
		return this.deductionStartDate;
	}
	public void setDeductionStartDate(String deductionStartDate) {
		this.deductionStartDate = deductionStartDate;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public String getOrderEndDate() {
		return this.orderEndDate;
	}
	public void setOrderEndDate(String orderEndDate) {
		this.orderEndDate = orderEndDate;
	}

	public String getOrderStartDate() {
		return this.orderStartDate;
	}
	public void setOrderStartDate(String orderStartDate) {
		this.orderStartDate = orderStartDate;
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
