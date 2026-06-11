package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class LifeServiceTailPaymentOrder extends AlipayObject {

	private static final long serialVersionUID = 8663381572319288752L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 原始预约单id
	 */
	@ApiField("main_booking_order_id")
	private String mainBookingOrderId;

	/**
	 * 原始订单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_success_time")
	private String orderSuccessTime;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_invalid_time")
	private String payInvalidTime;

	/**
	 * 服务描述
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * null
	 */
	@ApiListField("service_programs")
	@ApiField("life_service_tail_payment_service_program")
	private List<LifeServiceTailPaymentServiceProgram> servicePrograms;

	/**
	 * 尾款id
	 */
	@ApiField("tail_payment_id")
	private String tailPaymentId;

	/**
	 * 尾款单id
	 */
	@ApiField("tail_payment_order_id")
	private String tailPaymentOrderId;

	/**
	 * 尾款单金额，单位：元
	 */
	@ApiField("tail_payment_order_price_yuan")
	private String tailPaymentOrderPriceYuan;

	/**
	 * 尾款单状态
	 */
	@ApiField("tail_payment_order_status")
	private String tailPaymentOrderStatus;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getMainBookingOrderId() {
		return this.mainBookingOrderId;
	}
	public void setMainBookingOrderId(String mainBookingOrderId) {
		this.mainBookingOrderId = mainBookingOrderId;
	}

	public String getMainOrderId() {
		return this.mainOrderId;
	}
	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
	}

	public String getOrderSuccessTime() {
		return this.orderSuccessTime;
	}
	public void setOrderSuccessTime(String orderSuccessTime) {
		this.orderSuccessTime = orderSuccessTime;
	}

	public String getPayInvalidTime() {
		return this.payInvalidTime;
	}
	public void setPayInvalidTime(String payInvalidTime) {
		this.payInvalidTime = payInvalidTime;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public List<LifeServiceTailPaymentServiceProgram> getServicePrograms() {
		return this.servicePrograms;
	}
	public void setServicePrograms(List<LifeServiceTailPaymentServiceProgram> servicePrograms) {
		this.servicePrograms = servicePrograms;
	}

	public String getTailPaymentId() {
		return this.tailPaymentId;
	}
	public void setTailPaymentId(String tailPaymentId) {
		this.tailPaymentId = tailPaymentId;
	}

	public String getTailPaymentOrderId() {
		return this.tailPaymentOrderId;
	}
	public void setTailPaymentOrderId(String tailPaymentOrderId) {
		this.tailPaymentOrderId = tailPaymentOrderId;
	}

	public String getTailPaymentOrderPriceYuan() {
		return this.tailPaymentOrderPriceYuan;
	}
	public void setTailPaymentOrderPriceYuan(String tailPaymentOrderPriceYuan) {
		this.tailPaymentOrderPriceYuan = tailPaymentOrderPriceYuan;
	}

	public String getTailPaymentOrderStatus() {
		return this.tailPaymentOrderStatus;
	}
	public void setTailPaymentOrderStatus(String tailPaymentOrderStatus) {
		this.tailPaymentOrderStatus = tailPaymentOrderStatus;
	}

}
