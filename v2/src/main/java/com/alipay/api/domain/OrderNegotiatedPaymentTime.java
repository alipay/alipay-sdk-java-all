package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单协商支付时间列表
 *
 * @author auto create
 * @since 1.0, 2026-08-03 10:48:43
 */
public class OrderNegotiatedPaymentTime extends AlipayObject {

	private static final long serialVersionUID = 4669399831398494275L;

	/**
	 * 租期。标识第几期，起始值为1，需保证编号递增
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 协商支付时间，表示商家与用户协议一致的支付时间
	 */
	@ApiField("negotiated_payment_time")
	private Date negotiatedPaymentTime;

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getNegotiatedPaymentTime() {
		return this.negotiatedPaymentTime;
	}
	public void setNegotiatedPaymentTime(Date negotiatedPaymentTime) {
		this.negotiatedPaymentTime = negotiatedPaymentTime;
	}

}
