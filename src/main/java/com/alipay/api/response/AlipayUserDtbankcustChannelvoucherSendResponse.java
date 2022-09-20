package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.channelvoucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-19 15:39:29
 */
public class AlipayUserDtbankcustChannelvoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4625422668888436176L;

	/** 
	 * 接收渠道红包的，脱敏后的支付宝登录号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动流水唯一记录
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 优惠门槛金额
比喻:
A.满5元减3元，则值是500
B.满10元随机立减1元到3元,则值是1000
整数类型，以分为单位。
	 */
	@ApiField("discount_threshold_amt")
	private Long discountThresholdAmt;

	/** 
	 * reduce:满立减(满5元减3元)
random:随机立减(满10元随机立减1元到3元)
	 */
	@ApiField("discount_type")
	private String discountType;

	/** 
	 * 比喻:
A.满5元减3元，则值是300(单位：分)
B.满10元随机立减1元到3元,则值是具体的金额，如果随机1.5元，则值为150(单位:分)
	 */
	@ApiField("discount_value")
	private Long discountValue;

	/** 
	 * 以分为单位，比喻599，代表5.99元的面额
	 */
	@ApiField("send_amount")
	private Long sendAmount;

	/** 
	 * 发放流水状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	/** 
	 * 券平台唯一id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setDiscountThresholdAmt(Long discountThresholdAmt) {
		this.discountThresholdAmt = discountThresholdAmt;
	}
	public Long getDiscountThresholdAmt( ) {
		return this.discountThresholdAmt;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getDiscountType( ) {
		return this.discountType;
	}

	public void setDiscountValue(Long discountValue) {
		this.discountValue = discountValue;
	}
	public Long getDiscountValue( ) {
		return this.discountValue;
	}

	public void setSendAmount(Long sendAmount) {
		this.sendAmount = sendAmount;
	}
	public Long getSendAmount( ) {
		return this.sendAmount;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
