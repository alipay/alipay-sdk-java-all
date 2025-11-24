package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易来账单明细列表查询
 *
 * @author auto create
 * @since 1.0, 2025-08-12 23:42:33
 */
public class AlipayTradeUnifiedsettleInstorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4596989432542587874L;

	/**
	 * 金额筛选上限，币种为人民币
	 */
	@ApiField("amount_range_end")
	private String amountRangeEnd;

	/**
	 * 金额筛选下限，币种为人民币
	 */
	@ApiField("amount_range_start")
	private String amountRangeStart;

	/**
	 * 明细查询的结束时间，最晚时间
	 */
	@ApiField("date_range_end")
	private Date dateRangeEnd;

	/**
	 * 查询明细的开始时间，最早的时间
	 */
	@ApiField("date_range_start")
	private Date dateRangeStart;

	/**
	 * 收结易来账明细的单据号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 基于来账付款方的卡号进行筛选
	 */
	@ApiField("payer_card_no")
	private String payerCardNo;

	/**
	 * 付款方机构/银行编码
	 */
	@ApiField("payer_inst_id")
	private String payerInstId;

	/**
	 * 平台签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求数据的量
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 来账状态
	 */
	@ApiField("status")
	private String status;

	public String getAmountRangeEnd() {
		return this.amountRangeEnd;
	}
	public void setAmountRangeEnd(String amountRangeEnd) {
		this.amountRangeEnd = amountRangeEnd;
	}

	public String getAmountRangeStart() {
		return this.amountRangeStart;
	}
	public void setAmountRangeStart(String amountRangeStart) {
		this.amountRangeStart = amountRangeStart;
	}

	public Date getDateRangeEnd() {
		return this.dateRangeEnd;
	}
	public void setDateRangeEnd(Date dateRangeEnd) {
		this.dateRangeEnd = dateRangeEnd;
	}

	public Date getDateRangeStart() {
		return this.dateRangeStart;
	}
	public void setDateRangeStart(Date dateRangeStart) {
		this.dateRangeStart = dateRangeStart;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayerCardNo() {
		return this.payerCardNo;
	}
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}

	public String getPayerInstId() {
		return this.payerInstId;
	}
	public void setPayerInstId(String payerInstId) {
		this.payerInstId = payerInstId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
