package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:36:36
 */
public class AlipayEcoMycarPromoVoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5583646159253382278L;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态 1. 待支付 4. 交易关闭 6. 待发货 53. 已评价 55. 已核销 56. 交易完成
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 核销码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}
