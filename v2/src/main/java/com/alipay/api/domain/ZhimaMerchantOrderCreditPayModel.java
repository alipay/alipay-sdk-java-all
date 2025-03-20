package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用支付
 *
 * @author auto create
 * @since 1.0, 2021-03-23 10:18:05
 */
public class ZhimaMerchantOrderCreditPayModel extends AlipayObject {

	private static final long serialVersionUID = 4554246967219983495L;

	/**
	 * 优惠券金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，无支付行为时为空，例如订单取消或者支付金额为0
	 */
	@ApiField("coupon_amount")
	private String couponAmount;

	/**
	 * CANCEL，FINISH, INSTALLMENT  订单完结类型，目前包括取消(CANCEL)、完结(FINISH) 分期扣款(INSTALLMENT)
	 */
	@ApiField("order_operate_type")
	private String orderOperateType;

	/**
	 * 外部订单号,包含字母、数字、下划线，调用方需要保证订单号唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部资金订单号，可包含字母、数字、下划线
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 支付总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，无支付行为时为空，例如订单取消或者支付金额为0
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单操作说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 是否使用优惠券，默认为false，可选值：true或false，字符串形式，目前仅针对回收行业生效
	 */
	@ApiField("use_coupon")
	private String useCoupon;

	/**
	 * 芝麻订单号
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public String getCouponAmount() {
		return this.couponAmount;
	}
	public void setCouponAmount(String couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getOrderOperateType() {
		return this.orderOperateType;
	}
	public void setOrderOperateType(String orderOperateType) {
		this.orderOperateType = orderOperateType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTransNo() {
		return this.outTransNo;
	}
	public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUseCoupon() {
		return this.useCoupon;
	}
	public void setUseCoupon(String useCoupon) {
		this.useCoupon = useCoupon;
	}

	public String getZmOrderNo() {
		return this.zmOrderNo;
	}
	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}
