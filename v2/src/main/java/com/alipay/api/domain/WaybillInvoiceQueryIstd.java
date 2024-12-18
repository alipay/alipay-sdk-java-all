package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票配送单详情
 *
 * @author auto create
 * @since 1.0, 2024-07-16 14:47:52
 */
public class WaybillInvoiceQueryIstd extends AlipayObject {

	private static final long serialVersionUID = 6484875637254683778L;

	/**
	 * 失败原因，需要传单个即时配送运单的驳回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 商家门店编号
	 */
	@ApiField("shop_no")
	private String shopNo;

	/**
	 * 即时配送运单金额，waybill_invoce_status为1的情况下不能为空
	 */
	@ApiField("waybill_amount")
	private String waybillAmount;

	/**
	 * 明细的运单开票状态，1：开票成功 2：不可开票 3：可开票；整体开票状态为0的情况下，无开票明细；整体开票状态为1，明细开票状态全部是1；整体开票状态为2，明细开票状态全部为2
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
