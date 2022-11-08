package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益详情
 *
 * @author auto create
 * @since 1.0, 2022-01-11 10:18:29
 */
public class ActivityDetail extends AlipayObject {

	private static final long serialVersionUID = 5633892423834943841L;

	/**
	 * 权益id，领奖时的凭证。领奖凭证应该保证唯一，以保证后续领奖时能够识别领取人身份。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型。

取值范围为枚举值：
VOUCHER 券

目前仅支持发券
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 限制。
根据不同的voucherType，会有其对应的券模板，用于对消费者展示
详见券模板说明文档
	 */
	@ApiField("voucher_constraint")
	private String voucherConstraint;

	/**
	 * 券描述
根据不同的voucherType，会有其对应的券模板，用于对消费者展示
详见券模板说明文档
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券权益。
根据不同的voucherType，会有其对应的券模板，用于对消费者展示
详见券模板说明文档
	 */
	@ApiField("voucher_interest")
	private String voucherInterest;

	/**
	 * 券类型，目前支持以下种类：
全场满减:  GLOBAL_FIX_VOUCHER
全场折扣: GLOBAL_DISCOUNT_VOUCHER
单品满减：ITEM_FIX_VOUCHER
单品折扣： ITEM_DISCOUNT_VOUCHER
单品特价： ITEM_SPECIAL_VOUCHER
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getVoucherConstraint() {
		return this.voucherConstraint;
	}
	public void setVoucherConstraint(String voucherConstraint) {
		this.voucherConstraint = voucherConstraint;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherInterest() {
		return this.voucherInterest;
	}
	public void setVoucherInterest(String voucherInterest) {
		this.voucherInterest = voucherInterest;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
