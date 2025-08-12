package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分奖品信息
 *
 * @author auto create
 * @since 1.0, 2025-03-12 14:41:20
 */
public class RetailPointPrizeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4212696369461188362L;

	/**
	 * 积分奖品的面额，如奖品为30元优惠券，则该字段值为30，默认单位为元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 奖品面额单位，金额类奖品返回元，折扣类奖品返回折，具体可见枚举值。
	 */
	@ApiField("discount_amount_unit")
	private String discountAmountUnit;

	/**
	 * 对应奖品的使用门槛金额，如满50减20元优惠券奖品，则该字段对应为50，默认单位为元。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 活动任务参与单位 当前字段已废弃(不再使用该字段，后续废弃不会返回。)
	 */
	@ApiField("join_limit")
	@Deprecated
	private String joinLimit;

	/**
	 * 兑换奖品后续使用是否支持nfc支付
	 */
	@ApiField("nfc_pay")
	private Boolean nfcPay;

	/**
	 * 兑换该奖品需要消耗的积分数量
	 */
	@ApiField("point_count")
	private Long pointCount;

	/**
	 * 对应奖品的id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品的名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 积分奖品的类型，具体看枚举值描述
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 活动任务剩余需参与的数量，结合状态可判断还剩多少数量即可完成活动任务进行兑换 当前字段已废弃(不再使用该字段，后续废弃不会返回。)
	 */
	@ApiField("remaining_join_count")
	@Deprecated
	private Long remainingJoinCount;

	/**
	 * 对应活动的id
	 */
	@ApiField("retail_activity_id")
	private String retailActivityId;

	/**
	 * 奖品兑换的状态，用于判断如何展示 当前字段已废弃(仅返回有效的奖品，不再使用该字段，后续废弃不会返回。)
	 */
	@ApiField("status")
	@Deprecated
	private String status;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountAmountUnit() {
		return this.discountAmountUnit;
	}
	public void setDiscountAmountUnit(String discountAmountUnit) {
		this.discountAmountUnit = discountAmountUnit;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getJoinLimit() {
		return this.joinLimit;
	}
	public void setJoinLimit(String joinLimit) {
		this.joinLimit = joinLimit;
	}

	public Boolean getNfcPay() {
		return this.nfcPay;
	}
	public void setNfcPay(Boolean nfcPay) {
		this.nfcPay = nfcPay;
	}

	public Long getPointCount() {
		return this.pointCount;
	}
	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public Long getRemainingJoinCount() {
		return this.remainingJoinCount;
	}
	public void setRemainingJoinCount(Long remainingJoinCount) {
		this.remainingJoinCount = remainingJoinCount;
	}

	public String getRetailActivityId() {
		return this.retailActivityId;
	}
	public void setRetailActivityId(String retailActivityId) {
		this.retailActivityId = retailActivityId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
