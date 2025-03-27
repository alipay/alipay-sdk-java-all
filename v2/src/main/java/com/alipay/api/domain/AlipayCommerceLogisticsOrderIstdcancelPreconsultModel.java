package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预取消即时配送订单
 *
 * @author auto create
 * @since 1.0, 2023-03-08 15:32:50
 */
public class AlipayCommerceLogisticsOrderIstdcancelPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 6354625619739482744L;

	/**
	 * 取消原因，取消原因id为i_6时必填
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 取消原因id
	 */
	@ApiField("cancel_reason_id")
	private String cancelReasonId;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 支付宝订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商家订单号，与order_no不能同时为空
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCancelReasonId() {
		return this.cancelReasonId;
	}
	public void setCancelReasonId(String cancelReasonId) {
		this.cancelReasonId = cancelReasonId;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
