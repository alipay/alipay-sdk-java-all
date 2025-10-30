package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车商户侧取消订单
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:27:24
 */
public class AlipayEcoMycarRentcarMerchantCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5783164998132454748L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 扣款金额，单位分，没有违约金则传0
	 */
	@ApiField("deduct_amount")
	private Long deductAmount;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号，支付宝侧使用商户pid+商户订单号做订单唯一性校验及幂等控制
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Long getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(Long deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
