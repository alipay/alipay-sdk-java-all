package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务金额型数据，当选择付费模式或金额任务模式时传入
 *
 * @author auto create
 * @since 1.0, 2021-01-30 13:17:17
 */
public class AmountTypeSyncData extends AlipayObject {

	private static final long serialVersionUID = 3442358766436842498L;

	/**
	 * 商户回传的优惠金额，如用户享受的红包金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 商户数据回传的优惠信息的名称。
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 是否为支付宝交易，默认false，表示是否要做支付宝交易关联。此时tradeNo必须传支付宝交易号。
	 */
	@ApiField("has_alipay_trade")
	private Boolean hasAlipayTrade;

	/**
	 * 用户和商户发生交易的交易单金额，单位元。
	 */
	@ApiField("task_amount")
	private String taskAmount;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 用户和商户发生金额类交易的交易单号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public Boolean getHasAlipayTrade() {
		return this.hasAlipayTrade;
	}
	public void setHasAlipayTrade(Boolean hasAlipayTrade) {
		this.hasAlipayTrade = hasAlipayTrade;
	}

	public String getTaskAmount() {
		return this.taskAmount;
	}
	public void setTaskAmount(String taskAmount) {
		this.taskAmount = taskAmount;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
