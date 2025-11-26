package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点餐退款详情描述
 *
 * @author auto create
 * @since 1.0, 2020-06-18 15:09:35
 */
public class RefundDescriptionDTO extends AlipayObject {

	private static final long serialVersionUID = 4152944116382614738L;

	/**
	 * 本次支付用户实付的金额 = 应付金额 - 支付优惠中商家优惠金额 - 支付优惠中平台补贴金额
	 */
	@ApiField("buyer_amount")
	private String buyerAmount;

	/**
	 * 失败原因编码
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 口碑订单级优惠(特价菜、阶梯减)
	 */
	@ApiField("kb_order_discount")
	private String kbOrderDiscount;

	/**
	 * 交易号
	 */
	@ApiField("online_payment_no")
	private String onlinePaymentNo;

	/**
	 * 本次应付金额=实际支付金额+支付级优惠金额
	 */
	@ApiField("payable_amount")
	private String payableAmount;

	/**
	 * 支付单id
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 本次支付的支付方式，包括但不限于：(1) ALIPAY：支付宝(2) WECHAT：微信
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 退款状态，(1) SUCCESS表示退款成功 (2) PROCESSING表示退款中
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 本次支付商户实收的金额 = 用户实付金额 + 平台补贴金额 = 本次订单应付金额 - 本次支付商家优惠金额
	 */
	@ApiField("seller_amount")
	private String sellerAmount;

	public String getBuyerAmount() {
		return this.buyerAmount;
	}
	public void setBuyerAmount(String buyerAmount) {
		this.buyerAmount = buyerAmount;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getKbOrderDiscount() {
		return this.kbOrderDiscount;
	}
	public void setKbOrderDiscount(String kbOrderDiscount) {
		this.kbOrderDiscount = kbOrderDiscount;
	}

	public String getOnlinePaymentNo() {
		return this.onlinePaymentNo;
	}
	public void setOnlinePaymentNo(String onlinePaymentNo) {
		this.onlinePaymentNo = onlinePaymentNo;
	}

	public String getPayableAmount() {
		return this.payableAmount;
	}
	public void setPayableAmount(String payableAmount) {
		this.payableAmount = payableAmount;
	}

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSellerAmount() {
		return this.sellerAmount;
	}
	public void setSellerAmount(String sellerAmount) {
		this.sellerAmount = sellerAmount;
	}

}
