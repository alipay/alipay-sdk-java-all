package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建尾款
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class AlipayCommerceMerchantcardTailpaymentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3346183267647693587L;

	/**
	 * 预约品必填；
非预约品，不用填
	 */
	@ApiField("main_booking_order_id")
	private String mainBookingOrderId;

	/**
	 * 原始订单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 单位：小时，默认为24小时
	 */
	@ApiField("pay_invalid_hours")
	private Long payInvalidHours;

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
	 * 单位：元
	 */
	@ApiField("tail_payment_order_price_yuan")
	private String tailPaymentOrderPriceYuan;

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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Long getPayInvalidHours() {
		return this.payInvalidHours;
	}
	public void setPayInvalidHours(Long payInvalidHours) {
		this.payInvalidHours = payInvalidHours;
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

	public String getTailPaymentOrderPriceYuan() {
		return this.tailPaymentOrderPriceYuan;
	}
	public void setTailPaymentOrderPriceYuan(String tailPaymentOrderPriceYuan) {
		this.tailPaymentOrderPriceYuan = tailPaymentOrderPriceYuan;
	}

}
