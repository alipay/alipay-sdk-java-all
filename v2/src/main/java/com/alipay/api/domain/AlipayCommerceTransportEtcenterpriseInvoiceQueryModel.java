package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可开发票查询
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:09
 */
public class AlipayCommerceTransportEtcenterpriseInvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1285814941339634245L;

	/**
	 * 企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 开票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 查询月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 不传入时默认 =1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据条数,默认10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 外部企业运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	/**
	 * 查询年份
	 */
	@ApiField("year")
	private String year;

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}
