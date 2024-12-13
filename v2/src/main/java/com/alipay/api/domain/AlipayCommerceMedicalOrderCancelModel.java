package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家取消订单
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:24:18
 */
public class AlipayCommerceMedicalOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8384578767779558488L;

	/**
	 * 订单ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 此字段传取商家消订单的自定义原因，当reason_code=1099时，必填
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 此字段传取商家消订单的code
	 */
	@ApiField("reason_code")
	private String reasonCode;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
