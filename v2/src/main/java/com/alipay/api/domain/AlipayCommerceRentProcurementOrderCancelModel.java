package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购取消
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:12:45
 */
public class AlipayCommerceRentProcurementOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2557989462824938971L;

	/**
	 * 取消原因码
	 */
	@ApiField("cancel_code")
	private String cancelCode;

	/**
	 * 取消原因描述
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 商户外部采购单号（与procurement_order_id二选一）
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/**
	 * 供应链采购单号（与out_procurement_order_id二选一）
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public String getCancelCode() {
		return this.cancelCode;
	}
	public void setCancelCode(String cancelCode) {
		this.cancelCode = cancelCode;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getOutProcurementOrderId() {
		return this.outProcurementOrderId;
	}
	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}

	public String getProcurementOrderId() {
		return this.procurementOrderId;
	}
	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}

}
