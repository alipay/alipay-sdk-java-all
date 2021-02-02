package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票配送单详情
 *
 * @author auto create
 * @since 1.0, 2020-09-26 22:33:58
 */
public class WaybillInvoiceIstd extends AlipayObject {

	private static final long serialVersionUID = 2654997496177986465L;

	/**
	 * 失败原因，需要传单个配送单的驳回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 商家门店编号
	 */
	@ApiField("shop_no")
	private String shopNo;

	/**
	 * 即时配送运单金额
	 */
	@ApiField("waybill_amount")
	private String waybillAmount;

	/**
	 * 配送单开票状态  0：处理中 1：已开票  2：开票失败
	 */
	@ApiField("waybill_invoice_status")
	private Long waybillInvoiceStatus;

	/**
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getWaybillAmount() {
		return this.waybillAmount;
	}
	public void setWaybillAmount(String waybillAmount) {
		this.waybillAmount = waybillAmount;
	}

	public Long getWaybillInvoiceStatus() {
		return this.waybillInvoiceStatus;
	}
	public void setWaybillInvoiceStatus(Long waybillInvoiceStatus) {
		this.waybillInvoiceStatus = waybillInvoiceStatus;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
