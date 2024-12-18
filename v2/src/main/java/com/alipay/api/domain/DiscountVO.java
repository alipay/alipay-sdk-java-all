package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 湖北购药 iot场景下 详细折扣信息
 *
 * @author auto create
 * @since 1.0, 2024-12-09 14:45:52
 */
public class DiscountVO extends AlipayObject {

	private static final long serialVersionUID = 5357141234494226818L;

	/**
	 * 活动类型code码，如券名称
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 当前活动ID，若是商家中台系统自己管理活动，活动ID可关注
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 当前订单活动优惠金额，并且活动优惠金额=商家承担成本金额+平台承担成本金额，单位：元，如：5.0
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 当前活动优惠由平台承担的成本金额，单位：元，如5.0
	 */
	@ApiField("platform_cost")
	private String platformCost;

	/**
	 * 当前活动优惠由商家承担的成本金额，单位：元，如5.0
	 */
	@ApiField("seller_cost")
	private String sellerCost;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

	public String getPlatformCost() {
		return this.platformCost;
	}
	public void setPlatformCost(String platformCost) {
		this.platformCost = platformCost;
	}

	public String getSellerCost() {
		return this.sellerCost;
	}
	public void setSellerCost(String sellerCost) {
		this.sellerCost = sellerCost;
	}

}
