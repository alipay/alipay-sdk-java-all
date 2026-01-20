package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款明细信息
 *
 * @author auto create
 * @since 1.0, 2018-09-03 17:15:56
 */
public class RefundList extends AlipayObject {

	private static final long serialVersionUID = 8199941181234497527L;

	/**
	 * 退优惠明细JSON
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * POS退款单ID
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退优惠的金额
	 */
	@ApiField("refund_discount_amount")
	private String refundDiscountAmount;

	/**
	 * 口碑退款单ID
	 */
	@ApiField("refund_id")
	private String refundId;

	/**
	 * 退款方式，包括但不限于：
(1) ONLINE : 线上支付
(2) OFFLINE_ALIPAY：线下支付宝收款
(3) OFFLINE_WECHAT：线下微信支付
(4) OFFLINE_BANKCARD：线下银行卡支付
(5) OFFLINE_CASH : 线下现金支付
(6) OFFLINE_POINTS : 积分支付
(7) OFFLINE_STORED_VALUE_CARD : 储值卡支付
(8) OFFLINE_KOUBEI_VOUCHER : 口碑券
(9) OFFLINE_MEITUAN : 美团
(10) OFFLINE_OTHER : 线下其他支付方式
	 */
	@ApiField("refund_method")
	private String refundMethod;

	public List<DiscountInfos> getDiscountInfos() {
		return this.discountInfos;
	}
	public void setDiscountInfos(List<DiscountInfos> discountInfos) {
		this.discountInfos = discountInfos;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundDiscountAmount() {
		return this.refundDiscountAmount;
	}
	public void setRefundDiscountAmount(String refundDiscountAmount) {
		this.refundDiscountAmount = refundDiscountAmount;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundMethod() {
		return this.refundMethod;
	}
	public void setRefundMethod(String refundMethod) {
		this.refundMethod = refundMethod;
	}

}
