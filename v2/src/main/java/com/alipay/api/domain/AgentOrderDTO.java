package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * agent支付订单信息
 *
 * @author auto create
 * @since 1.0, 2026-08-21 14:54:10
 */
public class AgentOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 8729218929528641971L;

	/**
	 * 买家实付金额，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 订单总金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单营销优惠金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 轮询单号，可用与支付宝Agent订单关联
	 */
	@ApiField("out_shake_no")
	private String outShakeNo;

	/**
	 * 用户支付成功时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 商家入驻支付宝名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getOutShakeNo() {
		return this.outShakeNo;
	}
	public void setOutShakeNo(String outShakeNo) {
		this.outShakeNo = outShakeNo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
