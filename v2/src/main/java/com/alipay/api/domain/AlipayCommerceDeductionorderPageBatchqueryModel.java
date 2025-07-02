package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单分页查询
 *
 * @author auto create
 * @since 1.0, 2024-02-28 09:53:45
 */
public class AlipayCommerceDeductionorderPageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7723132156235745879L;

	/**
	 * 卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 实际扣款结束时间
	 */
	@ApiField("deduction_end_date")
	private Date deductionEndDate;

	/**
	 * 扣款单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 实际扣款开始时间
	 */
	@ApiField("deduction_start_date")
	private Date deductionStartDate;

	/**
	 * 扣款状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 下单结束时间
	 */
	@ApiField("order_end_date")
	private Date orderEndDate;

	/**
	 * 下单开始时间
	 */
	@ApiField("order_start_date")
	private Date orderStartDate;

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

	/**
	 * 分账状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Date getDeductionEndDate() {
		return this.deductionEndDate;
	}
	public void setDeductionEndDate(Date deductionEndDate) {
		this.deductionEndDate = deductionEndDate;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public Date getDeductionStartDate() {
		return this.deductionStartDate;
	}
	public void setDeductionStartDate(Date deductionStartDate) {
		this.deductionStartDate = deductionStartDate;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Date getOrderEndDate() {
		return this.orderEndDate;
	}
	public void setOrderEndDate(Date orderEndDate) {
		this.orderEndDate = orderEndDate;
	}

	public Date getOrderStartDate() {
		return this.orderStartDate;
	}
	public void setOrderStartDate(Date orderStartDate) {
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

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

}
